package com.emazon.stock.configuration.exceptionhandler;

import com.emazon.stock.adapters.driver.jpa.mysql.exception.CategoryAlreadyExistsException;
import com.emazon.stock.adapters.driver.jpa.mysql.exception.ElementNotFoundException;
import com.emazon.stock.adapters.driver.jpa.mysql.exception.NoDataFoundException;
import com.emazon.stock.configuration.Constants;
import com.emazon.stock.domain.exception.EmptyFieldException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@RequiredArgsConstructor
public class ControllerAdvisor {

    @ExceptionHandler(EmptyFieldException.class)
    public ResponseEntity<ExceptionResponse> handleEmptyFieldException(EmptyFieldException exception){
        return ResponseEntity.badRequest().body(new ExceptionResponse(
                String.format(Constants.EMPTY_FIELD_EXCEPTION_MESSAGE, exception.getMessage()),
                HttpStatus.BAD_REQUEST.toString(), LocalDateTime.now()
        ));
    }

    @ExceptionHandler(CategoryAlreadyExistsException.class)
    public ResponseEntity<ExceptionResponse> handleCategoryAlreadyExistsException(){
        return ResponseEntity.badRequest().body(new ExceptionResponse(
                Constants.CATEGORY_ALREADY_EXISTS_EXCEPTION_MESSAGE, HttpStatus.BAD_REQUEST.toString(), LocalDateTime.now()
        ));
    }

    @ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<ExceptionResponse> handleNoDataFoundException(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ExceptionResponse(
                        Constants.NO_DATA_FOUND_EXCEPTION_MESSAGE, HttpStatus.FOUND.toString(), LocalDateTime.now()
                )
        );
    }

    @ExceptionHandler(ElementNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleElementNotFoundException(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ExceptionResponse(
                        Constants.ELEMENT_NOT_FOUND_EXCEPTION_MESSAGE, HttpStatus.CONFLICT.toString(), LocalDateTime.now()
                )
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponse> handleValidationException(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                new ExceptionResponse(Constants.ERROR_DATA_VALIDATION, HttpStatus.BAD_REQUEST.toString(), LocalDateTime.now())
        );
    }


}

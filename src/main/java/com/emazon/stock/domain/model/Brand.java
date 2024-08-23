package com.emazon.stock.domain.model;

public class Brand {

    private final Long id;
    private String nombre;
    private String description;

    public Brand(Long id, String nombre, String description) {
        this.id = id;
        this.nombre = nombre;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescription() {
        return description;
    }
}

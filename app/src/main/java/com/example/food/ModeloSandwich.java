package com.example.food;

import androidx.annotation.CallSuper;

import java.io.Serializable;

@SuppressWarnings("ModeloSandwich")
public class ModeloSandwich implements Serializable {
    private String nombre;
    private int id;
    private String descripcion;
    private String precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}

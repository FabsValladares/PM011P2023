package com.example.pm011p2023.transacciones;

public class Personas {


    public Personas(Integer id, String nombres, String apellidos, Integer edad, String correo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        Edad = edad;
        this.correo = correo;
    }

    private Integer id;
    private String nombres;

    private String apellidos;

    private Integer Edad;

    private String correo;

    public Personas() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    }

package com.example.pm011p2023.transacciones;

public class Transacciones {
    //Nombre de la base de datos
    public static final String NameDatabase = "PM01DB";
    //Tablas de las base de datos
    public static final String tablapersonas = "personas";
    /*Transacciones de la base de datos PM01B*/
    public static final String CreateTBPersonas =
            "CREATE TABLE personas (id Integer PRIMARY KEY AUTOINCREMENT, nombres TEXT, " +
                    "apellidos TEXT, edad INTEGER, correo TEXT)";

    public static final String DropTablePersonas = "DROP TABLE IF EXISTS personas";


    //Helper
    public static final String Empty = "";
}
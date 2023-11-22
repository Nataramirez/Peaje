package co.edu.uniquindio.parcial3.model;

import java.util.ArrayList;
import java.util.List;

public class Peaje {
    private String nombre;
    public static List<EstacionPeaje> listaEstacionPeajes = new ArrayList<>();
    public static List<Conductor> listaConductores = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

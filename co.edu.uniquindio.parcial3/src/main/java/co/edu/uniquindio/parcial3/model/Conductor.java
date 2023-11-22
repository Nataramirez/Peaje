package co.edu.uniquindio.parcial3.model;

import java.util.Date;

public class Conductor {
    private String nombre;
    private String apellido;
    private String documentoIdentidad;
    private Date fechaNacimiento;

    public Conductor(){}
    public Conductor(String nombre, String apellido, String documentoIdentidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}

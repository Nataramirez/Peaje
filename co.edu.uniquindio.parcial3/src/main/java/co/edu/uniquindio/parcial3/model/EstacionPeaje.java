package co.edu.uniquindio.parcial3.model;

public class EstacionPeaje {
    private String nombre;
    private String departamento;
    private double valorNumerico;

    public EstacionPeaje(){}
    public EstacionPeaje(String nombre, String departamento, double valorNumerico) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.valorNumerico = valorNumerico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getValorNumerico() {
        return valorNumerico;
    }

    public void setValorNumerico(double valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    @Override
    public String toString() {
        return "EstacionPeaje{" +
                "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", valorNumerico=" + valorNumerico +
                '}';
    }
}

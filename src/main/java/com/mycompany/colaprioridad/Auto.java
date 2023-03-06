package com.mycompany.colaprioridad;

public class Auto {

    String Marca;
    int Year;
    int prioridad;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    String Matricula;

    @Override
    public String toString() {
        return "Auto{" + "Marca=" + Marca + ", Year=" + Year + ", prioridad=" + prioridad + ", Matricula=" + Matricula + '}';
    }

    public Auto(String Marca, int Year, int prioridad, String Matricula) {
        this.Marca = Marca;
        this.Year = Year;
        this.prioridad = prioridad;
        this.Matricula = Matricula;
    }

    public Auto() {
    }
}

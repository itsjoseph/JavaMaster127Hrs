package org.example;

public class Automovil {
    private String fabricante;
    private String modelo;
    private String color;
    private int capacidadEstanque = 40;
    private int id;
    private double cilindrada;

    private static int ultimoId;

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, int capacidadEstanque) {
        this(fabricante, modelo, color);
        this.capacidadEstanque = capacidadEstanque;
    }

    public Automovil(String fabricante, String modelo, String color, int capacidadEstanque, double cilindrada) {
        this(fabricante, modelo, color, capacidadEstanque);
        this.cilindrada = cilindrada;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return super.equals(this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;


    }
}


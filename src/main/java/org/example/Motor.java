package org.example;

public class Motor {
    private double cilindrada;
    private TipoMotor tipoMotor;

    public Motor(double cilindrada, TipoMotor tipoMotor) {
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public Motor() {
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}

package org.example;

public enum TipoAutomovil {
    SEDAN("Sedan", "Auto normal", 4),
    STATION_WAGEN("Station wagen", "Auto mediano", 4),
    HATCHBACK("Hatchback", "Auto compacto", 4),
    PICKUP("Pick up", "camioneta", 4),
    COUPE("Cuope", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 4);

    private final String nombre;
    private final int numeroPuertas;
    private final String desc;

    TipoAutomovil(String nombre, String desc, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.desc = desc;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDesc() {
        return desc;
    }
}

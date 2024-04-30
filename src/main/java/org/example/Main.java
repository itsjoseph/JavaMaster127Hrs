package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Color.BLANCO.getColor());
        System.out.println(TipoAutomovil.CONVERTIBLE.getDesc());

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil tipoAutomovil : tipos) {
            System.out.println(tipoAutomovil.getNombre() );
        }
    }
}
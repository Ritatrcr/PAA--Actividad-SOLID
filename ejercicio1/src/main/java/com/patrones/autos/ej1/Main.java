package com.patrones.autos.ej1;

public class Main {
    public static void main(String[] args) {
        // Demostración: construir varios automóviles solo con el Builder (sin Director)
        Automovil deportivo = new AutomovilBuilder()
                .conMotor(TipoMotor.GASOLINA)
                .color(Color.ROJO)
                .rin(Rin.RIN18)
                .sonido(Sonido.PREMIUM)
                .interior(Interior.CUERO)
                .conTechoSolar(true)
                .conGPS(true)
                .build();

        Automovil familiar = new AutomovilBuilder()
                .conMotor(TipoMotor.HIBRIDO)
                .color(Color.AZUL)
                .rin(Rin.RIN19)
                .interior(Interior.MIXTO)
                .conGPS(true)
                .build();

        Automovil urbano = new AutomovilBuilder()
                .conMotor(TipoMotor.ELECTRICO)
                .color(Color.BLANCO)
                .rin(Rin.RIN18)
                .sonido(Sonido.BASICO)
                .build();

        // Uno personalizado a tu gusto
        Automovil personalizado = new AutomovilBuilder()
                .conMotor(TipoMotor.DIESEL)
                .color(Color.NEGRO)
                .rin(Rin.RIN20)
                .sonido(Sonido.BOSE)
                .conTechoSolar(false)
                .conGPS(false)
                .build();

    
        System.out.println(deportivo);
        System.out.println(familiar);
        System.out.println(urbano);
        System.out.println(personalizado);
    }
}

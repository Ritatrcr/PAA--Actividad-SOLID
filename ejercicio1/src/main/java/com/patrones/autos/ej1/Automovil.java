package com.patrones.autos.ej1;

public final class Automovil {
    private final TipoMotor motor;
    private final Color color;
    private final Rin rin;
    private final Sonido sonido;
    private final Interior interior;
    private final boolean techoSolar;
    private final boolean gps;

    Automovil(AutomovilBuilder b) {
        this.motor = b.motor;
        this.color = b.color;
        this.rin = b.rin;
        this.sonido = b.sonido;
        this.interior = b.interior;
        this.techoSolar = b.techoSolar;
        this.gps = b.gps;
    }

    public TipoMotor getMotor()   { return motor; }
    public Color getColor()       { return color; }
    public Rin getRin()           { return rin; }
    public Sonido getSonido()     { return sonido; }
    public Interior getInterior() { return interior; }
    public boolean tieneTechoSolar() { return techoSolar; }
    public boolean tieneGPS()        { return gps; }

    @Override
    public String toString() {
        return "Automovil{" +
                "motor=" + motor +
                ", color=" + color +
                ", rin=" + rin +
                ", sonido=" + sonido +
                ", interior=" + interior +
                ", techoSolar=" + techoSolar +
                ", gps=" + gps +
                '}';
    }
}

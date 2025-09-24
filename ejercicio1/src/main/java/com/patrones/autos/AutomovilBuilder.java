package com.patrones.autos;

public class AutomovilBuilder {
    // Requeridos/optativos con defaults
    TipoMotor motor;
    Color color;
    Rin rin;
    Sonido sonido = Sonido.BASICO;
    Interior interior = Interior.TELA;
    boolean techoSolar = false;
    boolean gps = false;

    public AutomovilBuilder conMotor(TipoMotor motor) { this.motor = motor; return this; }
    public AutomovilBuilder color(Color color)        { this.color = color; return this; }
    public AutomovilBuilder rin(Rin rin)              { this.rin = rin; return this; }
    public AutomovilBuilder sonido(Sonido sonido)     { this.sonido = sonido; return this; }
    public AutomovilBuilder interior(Interior interior){ this.interior = interior; return this; }
    public AutomovilBuilder conTechoSolar(boolean v)  { this.techoSolar = v; return this; }
    public AutomovilBuilder conGPS(boolean v)         { this.gps = v; return this; }

    public Automovil build() {
        if (motor == null) throw new IllegalStateException("motor es obligatorio");
        if (color == null) throw new IllegalStateException("color es obligatorio");
        if (rin == null)   throw new IllegalStateException("rin es obligatorio");
        return new Automovil(this);
    }
}

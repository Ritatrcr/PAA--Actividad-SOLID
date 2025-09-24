package com.patrones.notificaciones.render;

public class MobileRenderer implements NotificationRenderer {
    @Override
    public void render(String tipo, String titulo, String cuerpo) {
        System.out.println("MÓVIL -> [" + tipo + "] (Toast/Push) " + titulo + " - " + cuerpo);
    }
    @Override
    public String plataforma() { return "MÓVIL"; }
}

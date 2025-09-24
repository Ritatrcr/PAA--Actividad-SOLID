package com.patrones.notificaciones.render;

public class DesktopRenderer implements NotificationRenderer {
    @Override
    public void render(String tipo, String titulo, String cuerpo) {
        System.out.println("ESCRITORIO -> [" + tipo + "] {SystemTray} " + titulo + " :: " + cuerpo);
    }
    @Override
    public String plataforma() { return "ESCRITORIO"; }
}

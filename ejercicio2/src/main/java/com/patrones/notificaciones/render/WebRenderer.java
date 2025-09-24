package com.patrones.notificaciones.render;

public class WebRenderer implements NotificationRenderer {
    @Override
    public void render(String tipo, String titulo, String cuerpo) {
        System.out.println("WEB -> [" + tipo + "] <h1>" + titulo + "</h1> <p>" + cuerpo + "</p>");
    }
    @Override
    public String plataforma() { return "WEB"; }
}

package com.patrones.notificaciones.render;

public interface NotificationRenderer {
    void render(String tipo, String titulo, String cuerpo);
    String plataforma();
}

package com.patrones.notificaciones.core;

import com.patrones.notificaciones.render.NotificationRenderer;

public class MessageNotification extends Notification {
    public MessageNotification(NotificationRenderer renderer, String titulo, String mensaje) {
        super(renderer, titulo, mensaje);
    }
    @Override
    public void enviar() {
        renderer.render("MENSAJE", titulo, mensaje);
    }
}

package com.patrones.notificaciones.core;

import com.patrones.notificaciones.render.NotificationRenderer;

public class AlertNotification extends Notification {
    public AlertNotification(NotificationRenderer renderer, String titulo, String mensaje) {
        super(renderer, titulo, mensaje);
    }
    @Override
    public void enviar() {
        renderer.render("ALERTA", "⚠ " + titulo, mensaje.toUpperCase());
    }
}

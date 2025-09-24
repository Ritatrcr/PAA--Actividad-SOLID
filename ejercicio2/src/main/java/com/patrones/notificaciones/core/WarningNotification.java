package com.patrones.notificaciones.core;

import com.patrones.notificaciones.render.NotificationRenderer;

public class WarningNotification extends Notification {
    public WarningNotification(NotificationRenderer renderer, String titulo, String mensaje) {
        super(renderer, titulo, mensaje);
    }
    @Override
    public void enviar() {
        renderer.render("ADVERTENCIA", titulo + " (revísalo)", mensaje);
    }
}

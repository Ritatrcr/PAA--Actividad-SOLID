package com.patrones.notificaciones.core;

import com.patrones.notificaciones.render.NotificationRenderer;

public class ConfirmationNotification extends Notification {
    public ConfirmationNotification(NotificationRenderer renderer, String titulo, String mensaje) {
        super(renderer, titulo, mensaje);
    }
    @Override
    public void enviar() {
        renderer.render("CONFIRMACIÓN", titulo + " ✅", mensaje + " (¿Confirmar?)");
    }
}

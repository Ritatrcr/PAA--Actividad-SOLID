package com.patrones.notificaciones.core;

import com.patrones.notificaciones.render.NotificationRenderer;

public abstract class Notification {
    protected NotificationRenderer renderer;
    protected String titulo;
    protected String mensaje;

    protected Notification(NotificationRenderer renderer, String titulo, String mensaje) {
        this.renderer = renderer;
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    public void setRenderer(NotificationRenderer renderer) {
        this.renderer = renderer; // Permite cambiar plataforma en tiempo de ejecución
    }

    public abstract void enviar(); // Cada tipo define su formato y delega el render
}

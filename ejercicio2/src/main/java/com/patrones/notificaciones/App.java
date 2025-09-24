package com.patrones.notificaciones;

import com.patrones.notificaciones.core.*;
import com.patrones.notificaciones.render.*;

public class App {
    public static void main(String[] args) {
        // Crear renderizadores por plataforma (podría venir de config)
        NotificationRenderer web     = RendererFactory.create(Platform.WEB);
        NotificationRenderer mobile  = RendererFactory.create(Platform.MOBILE);
        NotificationRenderer desktop = RendererFactory.create(Platform.DESKTOP);

        // Crear notificaciones de distintos tipos (independientes de la plataforma)
        Notification n1 = new MessageNotification(web, "Nuevo mensaje", "Tienes 1 mensaje sin leer.");
        Notification n2 = new AlertNotification(mobile, "CPU Alta", "Uso por encima del 90%");
        Notification n3 = new WarningNotification(desktop, "Espacio en disco", "Menos del 10% disponible");
        Notification n4 = new ConfirmationNotification(web, "Eliminar archivo", "¿Seguro que deseas eliminarlo?");

        // Simulaciones (prints)
        n1.enviar();
        n2.enviar();
        n3.enviar();
        n4.enviar();

        // Flexibilidad en tiempo de ejecución: cambiar la plataforma
        n1.setRenderer(mobile);
        n1.enviar(); // Ahora el mismo tipo se muestra en otra plataforma

        // Agregar una nueva plataforma o un nuevo tipo NO rompe lo existente.
    }
}

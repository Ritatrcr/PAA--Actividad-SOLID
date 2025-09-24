package com.patrones.notificaciones.render;

import com.patrones.notificaciones.Platform;

public class RendererFactory {
    public static NotificationRenderer create(Platform platform) {
        return switch (platform) {
            case WEB     -> new WebRenderer();
            case MOBILE  -> new MobileRenderer();
            case DESKTOP -> new DesktopRenderer();
        };
    }
}

package com.patrones.chat;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChatRoom implements Mediator {
    private final Map<String, Participant> participants = new ConcurrentHashMap<>();

    @Override
    public void join(Participant p) {
        participants.put(p.getId(), p);
        broadcast("SYSTEM", p.getDisplayName() + " se unió a la sala.");
    }

    @Override
    public void leave(String id) {
        Participant p = participants.remove(id);
        if (p != null) {
            broadcast("SYSTEM", p.getDisplayName() + " salió de la sala.");
        }
    }

    @Override
    public void broadcast(String fromId, String message) {
        for (Participant p : participants.values()) {
            if (!p.getId().equals(fromId)) {
                String from = resolveName(fromId);
                p.receive(from, message);
            }
        }
    }

    @Override
    public void sendTo(String fromId, String toId, String message) {
        Participant to = participants.get(toId);
        if (to != null) {
            String from = resolveName(fromId);
            to.receive(from, message);
        }
    }

    private String resolveName(String fromId) {
        Participant from = participants.get(fromId);
        return (from != null) ? from.getDisplayName() : fromId;
    }
}


package com.patrones.chat;

public interface Mediator {
    void join(Participant p);
    void leave(String id);
    void broadcast(String fromId, String message);
    void sendTo(String fromId, String toId, String message);
}

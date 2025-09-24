package com.patrones.chat;

public interface Participant {
    String getId();
    String getDisplayName();
    void receive(String from, String message);
    void send(String message);
    void sendTo(String toId, String message);
}

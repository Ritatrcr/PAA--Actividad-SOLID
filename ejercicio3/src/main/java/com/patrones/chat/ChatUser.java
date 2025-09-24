package com.patrones.chat;

public class ChatUser implements Participant {
    private final String id;
    private final String displayName;
    private final Mediator mediator;

    public ChatUser(String id, String displayName, Mediator mediator) {
        this.id = id;
        this.displayName = displayName;
        this.mediator = mediator;
    }

    @Override public String getId() { return id; }
    @Override public String getDisplayName() { return displayName; }

    @Override
    public void receive(String from, String message) {
        System.out.printf("[%s] %s: %s%n", displayName, from, message);
    }

    @Override
    public void send(String message) {
        mediator.broadcast(id, message);
    }

    @Override
    public void sendTo(String toId, String message) {
        mediator.sendTo(id, toId, message);
    }
}

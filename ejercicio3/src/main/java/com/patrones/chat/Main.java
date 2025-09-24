package com.patrones.chat;

public class Main {
    public static void main(String[] args) {
        Mediator room = new ChatRoom();

        Participant ana   = new ChatUser("u1", "Ana", room);
        Participant bruno = new ChatUser("u2", "Bruno", room);
        Participant caro  = new ChatUser("u3", "Caro", room);

        room.join(ana);
        room.join(bruno);
        room.join(caro);

        ana.send("Hola equipo 👋");
        bruno.sendTo("u1", "¿Lista la demo?");
        room.leave("u3");
        ana.send("Empezamos en 5 minutos.");
    }
}

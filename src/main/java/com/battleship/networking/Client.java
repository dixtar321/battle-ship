package com.battleship.networking;

import java.io.Serializable;
import java.util.function.Consumer;

public class Client extends NetworkConnection {

    private final String ip;
    private final int port;

    public Client(Consumer<Serializable> onReceiveCallback, String ip, int port) {
        super(onReceiveCallback);
        this.ip = ip;
        this.port = port;
    }

    @Override
    protected boolean isServer() {
        return false;
    }

    @Override
    protected String getIP() {
        return ip;
    }

    @Override
    protected int getPort() {
        System.out.println("Client:  " + getIP() + " //// " + String.valueOf(port));
        return port;
    }

    @Override
    public void closeConnection() {
        // Ваш специфический код закрытия соединения для клиента
        // Например, закрытие сокета
        try {
            // socket.close();
            // input.close();
            // output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

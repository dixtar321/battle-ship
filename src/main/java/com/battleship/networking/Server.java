package com.battleship.networking;

import com.battleship.utils.IpChecker;

import java.io.Serializable;
import java.util.function.Consumer;

public class Server extends NetworkConnection {

    public int port;

    public Server(Consumer<Serializable> onReceiveCallback, int port) {
        super(onReceiveCallback);
        this.port = port;
    }

    @Override
    protected boolean isServer() {
        return true;
    }

    @Override
    protected String getIP() {
        try {
            return IpChecker.getIp();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected int getPort() {
        System.out.println("Server:  " + getIP() + " //// " + String.valueOf(port));
        return port;
    }

    @Override
    public void closeConnection() {
        // Ваш специфический код закрытия соединения для сервера
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

package com.battleship.game.playerpack;

import javax.swing.*;
import java.io.Serializable;

public class PlayerData implements Serializable {

    private final String userName;

    public PlayerData(String name) {
        userName = name;

    }

    public String getName() {
        return userName;
    }

}
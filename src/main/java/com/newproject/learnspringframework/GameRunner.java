package com.newproject.learnspringframework;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running Game: " + game);
        game.up(); // calling the methods here
        game.down();
        game.left();
        game.right();
    }
}

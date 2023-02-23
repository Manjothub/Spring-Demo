package com.newproject.learnspringframework;

public class AppGamingBasic {
    public static void main(String[] args){
        //var Game = new MarioGame();
        var Game = new PacmanGame();
        //var Game = new SuperContraGame();
        var gameRunner = new GameRunner(Game);
        gameRunner.run();
    }
}

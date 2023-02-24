package com.newproject.learnspringframework;

public class App01GamingBasicjava {
    public static void main(String[] args){
        //var Game = new MarioGame();
        var Game = new PacmanGame();
        //var Game = new SuperContraGame();
        var gameRunner = new GameRunner(Game);
        //2 Object creation + wiring of Dependencies
        // Game is Dependency of GameRunner class
        gameRunner.run();
    }
}

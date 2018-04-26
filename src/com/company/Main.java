package com.company;

/**
 * Main driver class, calls and creates all needed classes for an entire game
 * TODO:
 *         Main window: implement basics, with blank start screen and start button.  Upon press game begins
 *         Map: Decide how map will be internally handled, then implement
 *         Player: ability to move throughout map, and skills
 *         Monsters: decide what kind of monsters and how many, implement
 *         Figure out rest of TODO
 */
public class Main {

    public static void main(String[] args) {
        Player thePlayer = new Player();
        Inputer input = new Inputer(thePlayer);
        input.changeLabel("What is your name adventurer?");
    }

    public static void play(Player player) {
        MainWindow window = new MainWindow();
        window.changeTopMessage("Welcome to dungeonCrawler " + player.getName());
    }
}

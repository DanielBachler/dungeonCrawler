package com.company;

/**
 TODO:
        Main window: implement basics, with blank start screen and start button.  Upon press game begins
        Map: Decide how map will be internally handled, then implement
        Player: ability to move throughout map, and skills
        Monsters: decide what kind of monsters and how many, implement
        Figure out rest of TODO
 */

/**
 * Main driver class, calls and creates all needed classes for an entire game
 */
public class Main {

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        play();
    }

    public static void play() {
        Player thePlayer = createPlayer();
        System.out.println(thePlayer.getName());
    }

    //Creates a player
    public static Player createPlayer() {
        Player temp = new Player();
        Inputer input = new Inputer(temp);
        input.changeLabel("What is your name adventurer?");
        return temp;
    }
}

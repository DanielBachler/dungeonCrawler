package com.company;

/**
 TODO:
        Main window: implement basics, with blank start screen and start button.  Upon press game begins
        Map: Decide how map will be internally handled, then implement
        Player: ability to move throughout map, and skills
        Monsters: decide what kind of monsters and how many, implement
        Figure out rest of TODO
 */

public class Main {

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        play();
    }

    public static void play() {
        Inputer input = new Inputer();
        input.changeLabel("Please enter your name");
        String name;
        do {
            name = input.getInput();
        } while(name != null);
        System.out.println(name);
    }
}

package com.sourav.Game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Down");
    }

    @Override
    public void left() {
        System.out.println("Back");
    }

    @Override
    public void right() {
        System.out.println("Accelerate");
    }

}

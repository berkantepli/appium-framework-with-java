package com.berkantepli;

public class ChildClassDemo extends ParentClassDemo {

    public void Engine() {
        System.out.println("new engine ");
    }

    public void colour() {
        System.out.println(colour);
    }

    public static void main(String[] args) {
        ChildClassDemo cd = new ChildClassDemo();
        cd.colour();
    }

    
}

package com.java4qa.sandbox;

public class MyFirstProgram {

    public static void main(String[] args){
        hello("world");
        hello("user");
        hello("Alexey");

        Square s = new Square(5);
        System.out.println("Squere area is: " + s.l + "=" + s.area());

        Rectangle r = new Rectangle( 4, 5);
        System.out.println("Rectangkle area with the lines " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello( String somebody) {System.out.println("Hello, " + somebody + "!");}

}

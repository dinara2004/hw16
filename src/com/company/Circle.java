package com.company;

public class Circle {
     private static double PI;
     private static double radius;

    public Circle() {
    }

    static void area() {
        System.out.println(PI* (radius * radius));
    }

    static void circumference() {
        System.out.println(PI * 2 * radius);
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }


}


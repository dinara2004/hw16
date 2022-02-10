package com.company;

public class Main {

    public static void main(String[] args) {
//        Circle деген класс тузунуз, анын PI деген свойствасы, area
//        жана circumference деген статик методдору болсун.
//        areaны табуу учун: PI * (radius * radius)
//        circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат
        Circle circle = new Circle();
        circle.setPI(3.14);
        circle.setRadius(3);
        Circle.area();
        Circle.circumference();

    }

}

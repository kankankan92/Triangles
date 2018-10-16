package com.company;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(2, 1);
        Point point2 = new Point(1, -2);
        Point point3 = new Point(-1, 0);
        Vector vector1 = new Vector(point1, point2);
        Vector vector2 = new Vector(point1, point3);
        System.out.println(vector1.cosAngle(vector1.scalarProduct(vector1,vector2), vector1.getLenght()*vector2.getLenght()));
    }
}

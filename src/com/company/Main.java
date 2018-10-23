package com.company;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(5, 2);
        Point point2 = new Point(3, -4);
        Point point3 = new Point(-1, 0);
        Point point4 = new Point(2, 1);
        Point point5 = new Point(1, -2);
        Point point6 = new Point(-1, 0);
        Triangle triangle1 = new Triangle(point1, point2, point3);
        Triangle triangle2 = new Triangle(point4, point5, point6);
        System.out.println(triangle1.angles[0]+","+ triangle1.angles[1]+","+ triangle1.angles[2]);
        triangle1.sortAngles(triangle1.angles);
        System.out.println(triangle1.angles[0]+","+ triangle1.angles[1]+","+ triangle1.angles[2]);
        System.out.println(Triangle.similarityTriangles(triangle1, triangle2));
    }
}

package com.company;

public class Vector {

    private final double x;
    private final double y;
    private double length;

    Vector(Point start, Point end){
        x = start.getX()- end.getX();
        y = start.getY()- end.getY();
        length = Math.sqrt(getX()*getX()+getY()*getY());
    }

    public static double scalarProduct(Vector vector1, Vector vector2){
        double scalarProduct = vector1.getX()*vector2.getX()+vector1.getY()*vector2.getY();
        return scalarProduct;
    }

    private double getX() {
        return x;
    }

    private double getY() {
        return y;
        }

    public double getLength() {
        return length;
    }

}


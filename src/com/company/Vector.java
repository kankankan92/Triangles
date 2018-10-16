package com.company;

public class Vector {

    private final double x;
    private final double y;
    private double lenght;

    Vector(Point start, Point end){
        this.x = start.getX()- end.getX();
        this.y = start.getY()- end.getY();
        this.lenght = Math.sqrt(getX()*getX()+getY()*getY());
    }

    public double scalarProduct(Vector vector1, Vector vector2){
        double scalarProduct = vector1.getX()*vector2.getX()+vector1.getY()*vector2.getY();
        return scalarProduct;
    }

    public double cosAngle(double scalarProduct, double lenght){
        double cosAngle = scalarProduct/lenght;
        return cosAngle;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
        }

    public double getLenght() {
        return lenght;
    }

}


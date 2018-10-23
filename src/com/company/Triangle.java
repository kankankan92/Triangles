package com.company;

public class Triangle {
    double[] angles;

    Triangle(Point a, Point b, Point c) {
        this.angles = new double[3];
        angles[0] = cosAngle(a, b, c);
        angles[1] = cosAngle(b, c, a);
        angles[2] = cosAngle(c, a, b);
    }

    public void sortAngles(double[] angls) {
        for (int i = 1; i < angls.length; i++) {
            for (int j = 0; j < angls.length - i; j++) {
                if (angls[j] > angls[j + 1]) {
                    double n = angls[j];
                    angls[j] = angls[j + 1];
                    angls[j + 1] = n;
                }
            }
        }
    }

    private double cosAngle(Point a, Point b, Point c) {
        Vector vector1 = new Vector(a, b);
        Vector vector2 = new Vector(a, c);
        double cosAngle = Vector.scalarProduct(vector1, vector2) / (vector1.getLength() * vector2.getLength());
        return cosAngle;
    }

    public static boolean similarityTriangles(Triangle triangle1, Triangle triangle2) {
        boolean similarityTriangles = true;
        triangle1.sortAngles(triangle1.angles);
        triangle2.sortAngles(triangle2.angles);
        for (int i = 0; i < triangle1.angles.length; i++) {
            if (triangle1.angles[i] != triangle2.angles[i]) {
                similarityTriangles = false;
            }
        }
        return similarityTriangles;
    }
}

package org.example.Exrcise1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Point2D pointA = new Point2D(3.5f, 4.5f);

        Point2D pointB = new Point2D();
        pointB.setX(1.0f);
        pointB.setY(4.0f);

        Point2D pointC = new Point2D();
        pointC.setXY(-1.5f, -3.5f);

        Point3D pointD = new Point3D(1f, 2.0f, 3.0f);
        float[] tabD = pointD.getXYZ();

        Point3D pointE = new Point3D(1.0f, 2.0f, 3.0f);
        pointE.setXYZ(-1f, -2.0f, -3.0f);
        float[] tabE = pointE.getXYZ();

        System.out.println("Point A: " + Arrays.toString(pointA.getXY()));
        System.out.println("Point B: " + Arrays.toString(pointB.getXY()));
        System.out.println("Point C: " + Arrays.toString(pointC.getXY()));
        System.out.println("Point D: " + Arrays.toString(tabD));
        System.out.println("Point E: " + Arrays.toString(tabE));

        System.out.println("Point A: " + pointA.toString()); //format współrzędnych 6miejsc po przecinku
        System.out.println("Point B: " + pointB.toString());
        System.out.println("Point C: " + pointC.toString());
        System.out.println("Point D: " + pointD.toString(tabD));
        System.out.println("Point E: " + pointD.toString(tabE));
    }
}

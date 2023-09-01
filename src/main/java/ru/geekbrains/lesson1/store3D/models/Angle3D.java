package ru.geekbrains.lesson1.store3D.models;

import java.util.List;

public class Angle3D {
    private List<Point3D> vector;
    private double angle;

    public List<Point3D> getVector() {
        return vector;
    }

    public void setVector(List<Point3D> vector) {
        this.vector = vector;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public Angle3D(List<Point3D> vector, double angle) {
        this.vector = vector;
        this.angle = angle;
    }
}

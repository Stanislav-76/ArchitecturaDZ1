package ru.geekbrains.lesson1.store3D.models;

import java.util.List;

public class Flash {

    //TODO: Доработать в рамках ДР - выполнено
    private Point3D location;
    private Angle3D angle;
    private String color;
    private float power;

    public Flash(Point3D location, Angle3D angle, String color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void rotate(Angle3D angle){
        double angleRotate;
        int speed;
    }

    public void move(Point3D targetPoint){
        int speed;
    }

}

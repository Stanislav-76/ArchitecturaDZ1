package ru.geekbrains.lesson1.store3D.models;

public class Camera {

    //TODO: Доработать в рамках ДР - выполнено
    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
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

    public void rotate(Angle3D angle){
        double angleRotate;
        int speed;
    }

    public void move(Point3D targetPoint){
        int speed;
    }

}

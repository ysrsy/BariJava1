package com.company.oop;
public class Circle extends Shape {
    private int radius;

    Circle (){
        System.out.println("circle default constructor");
        setName("Circle");
    }

    @Override
    public void printName() {
        System.out.println(getName());
    }

    Circle (int radius){
        System.out.println("circle parametric constructor");
        this.radius=radius;
        setName("Circle");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }


}

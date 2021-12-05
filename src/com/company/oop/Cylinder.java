package com.company.oop;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Cylinder extends Circle {
    private int height;
    String material;

    Cylinder(int radius,int height){
        super(radius);
        this.height=height;
        setName("Cylinder");
        System.out.println("cylinder parametric constructor");
    }

    Cylinder (int radius, int height, String material){
        this(radius,height);
        this.material=material;
        System.out.println("cylinder biggest constructor");
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void printName() {
        super.printName();
    }

    @Override
    public double calculateArea() {
        return super.calculateArea()*2+getRadius()*height;
    }

    @Override
    public double calculateCircumference() {
        return 2*super.calculateCircumference();
    }

    public double calculateVolume(){
        return super.calculateArea()*height;
    }
}

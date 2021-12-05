package com.company.oop;

public class SmartPhone extends Phone implements ICamera,IMusicPlayer{

    @Override
    public void recordVideo() {
        System.out.println("video recorded");
    }

    @Override
    public void takePhoto() {
        System.out.println("photo token");
    }

    @Override
    public void playMusic() {
        System.out.println("singing");
    }

    @Override
    public void stop() {
        System.out.println("stopped");
    }

    @Override
    public void defaultMethod() {
        System.out.println("ı am overrided");
    }
}

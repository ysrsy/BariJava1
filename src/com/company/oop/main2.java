package com.company.oop;

public class main2 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setMemory(128);
        smartPhone.playMusic();
        smartPhone.recordVideo();
        smartPhone.takePhoto();
        smartPhone.stop();
        ICamera camera = smartPhone;
        IMusicPlayer musicPlayer = smartPhone;
        Phone phone = smartPhone;
        phone.sendSms();
        phone.call();
        musicPlayer.playMusic();
        camera.takePhoto();
    }
}

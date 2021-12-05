package com.company.oop;

public abstract class Phone {
    private int memory;
    public void call(){
        System.out.println("call person");
    }
    public void sendSms(){
        System.out.println("send message");
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}

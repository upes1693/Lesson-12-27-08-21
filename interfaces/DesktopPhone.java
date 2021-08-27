package com.interfaces;

public class DesktopPhone implements Telephone {
    private int phoneNumber;
    private boolean isRinging;

    public DesktopPhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Always on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dialing to " + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering phone call");
            isRinging = false;
        }
    }

    @Override
    public boolean call(int phoneNumber) {
        if(this.phoneNumber==phoneNumber){
            isRinging=true;
            System.out.println("Ringing...");
        }
        else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

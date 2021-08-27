package com.interfaces;

public interface Telephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean call(int phoneNumber);
    boolean isRinging();
}

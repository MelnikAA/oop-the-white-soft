package Task.Wheel.Impl;

import Task.Wheel.IWheel;

public class BadWheel implements IWheel {
    @Override
    public void spin() {
        System.out.println("brbrbrbrbr");
    }
}

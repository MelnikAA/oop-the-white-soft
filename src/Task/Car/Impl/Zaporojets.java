package Task.Car.Impl;

import Task.Car.BaseCar;
import Task.Engine.Impl.Rx3;
import Task.Wheel.IWheel;
import Task.Wheel.Impl.BadWheel;
import Task.Wheel.Impl.SmolWheel;

public class Zaporojets extends BaseCar {
    public Zaporojets(String color) {
        super(color, "Zaporojets", new IWheel[]{new BadWheel(), new BadWheel(), new BadWheel(), new SmolWheel()}, new Rx3());
    }

    @Override
    public void beep() {
        System.out.println("BEEEEAAAAAAP");
    }
}

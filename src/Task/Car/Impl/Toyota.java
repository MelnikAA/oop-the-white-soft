package Task.Car.Impl;

import Task.Car.BaseCar;
import Task.Engine.Impl.Rx1;
import Task.Wheel.IWheel;
import Task.Wheel.Impl.SmolWheel;
import Task.Wheel.Impl.SpeedWheel;

public class Toyota extends BaseCar {
    public Toyota(String color) {
        super(color, "Toyota", new IWheel[]{new SpeedWheel(), new SpeedWheel(), new SpeedWheel(), new SmolWheel()}, new Rx1());
    }

    @Override
    public void beep() {
        System.out.println("boop");
    }
}

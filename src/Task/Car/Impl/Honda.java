package Task.Car.Impl;

import Task.Car.BaseCar;
import Task.Engine.Impl.Rx2;
import Task.Wheel.IWheel;
import Task.Wheel.Impl.BigWheel;
import Task.Wheel.Impl.SmolWheel;

public class Honda extends BaseCar {
    public Honda(String color) {
        super(color, "Honda", new IWheel[]{new BigWheel(), new BigWheel(), new SmolWheel(), new SmolWheel()}, new Rx2());
    }

    @Override
    public void beep() {
        super.beep();
    }
}

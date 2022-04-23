package Task.Car;

import Task.Engine.BaseEngine;
import Task.Wheel.IWheel;

public class BaseCar implements ICar {
    protected String color;
    protected String brand;
    protected IWheel[] wheels;
    protected BaseEngine engine;


    public BaseCar(String color, String brand, IWheel[] wheels, BaseEngine engine) {
        this.color = color;
        this.brand = brand;
        this.wheels = wheels;
        this.engine = engine;

    }

    @Override
    public void drive(int speed, int distance) {
        if (!engine.isStarted())
            engine.start();
        engine.consume(distance * engine.getFuelConsumption() / 100, wheels);
        System.out.format("Fuel remaining: %.3f \n", engine.getRemainingFuel());
    }

    @Override
    public void addFuel(double volume) {
        engine.addFuel(volume);
        if (engine.isFull()) {
            System.out.println("You are full");
            System.out.format("Fuel remaining: %.3f \n", engine.getRemainingFuel());
        } else {
            System.out.println("Meh I WANT MORE");
            System.out.format("Fuel remaining: %.3f \n", engine.getRemainingFuel());
        }
    }

    @Override
    public void beep() {
        System.out.println("Beep");
    }

    public void getStatus() {
        System.out.format("It's %s %s with %d wheels and %.2f fuel consuming\n", color, brand, wheels.length, engine.getFuelConsumption());
    }
}

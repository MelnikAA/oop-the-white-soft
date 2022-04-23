package Task.Engine;

import Task.Wheel.IWheel;

public class BaseEngine implements IEngine {

    protected double fuelConsumption; //расход топлива
    protected double remainingFuel; //остаток топлива

    protected double maxFuel;

    public boolean isStarted() {
        return isStarted;
    }

    protected boolean isStarted;

    public BaseEngine(double fuelConsumption, double maxFuel) {
        this.fuelConsumption = fuelConsumption;
        this.maxFuel = maxFuel;
        this.remainingFuel = maxFuel;
        this.isStarted = false;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getRemainingFuel() {
        return remainingFuel;
    }

    @Override
    public void start() {
        remainingFuel -= 0.1;
        isStarted = true;
    }

    @Override
    public void consume(double volume, IWheel[] wheels) {
        if (!isStarted){
            throw  new RuntimeException("You can't drive with turned off engine");
        }

            if (remainingFuel - volume < 0) {
                for (IWheel wheel : wheels) {
                    wheel.spin();
                }
                System.out.println("You can't drive full distance");
                remainingFuel = 0;
            } else {
                for (IWheel wheel : wheels) {
                    wheel.spin();
                }
                System.out.println("Brrrrrr");
                remainingFuel -= volume;
            }
    }

    @Override
    public void addFuel(double volume) {
        if (remainingFuel + volume > maxFuel) {
            System.out.println("You've split some fuel to the ground");
            remainingFuel = maxFuel;
        } else {
            System.out.println("Blup blup blup");
            remainingFuel += volume;
        }
    }

    @Override
    public boolean isFull() {
        return remainingFuel == maxFuel;
    }
}

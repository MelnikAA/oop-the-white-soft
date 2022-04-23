package Task.Engine;

import Task.Wheel.IWheel;

public interface IEngine {

    void start();

    void consume(double volume, IWheel[] wheels);

    void addFuel(double volume);

    boolean isFull();

}

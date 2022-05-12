package Task.Engine;

import Task.Car.BaseCar;
import Task.Engine.Impl.Rx2;
import Task.Wheel.IWheel;
import Task.Wheel.Impl.BigWheel;
import Task.Wheel.Impl.SmolWheel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseEngineTest {

    @Test
    void isStarted() {

    }

    @Test
    void getFuelConsumptionTest() {
        BaseEngine Car1= new BaseEngine(2, 50);
        assertEquals(2, Car1.getFuelConsumption());
    }

    @Test
    void getRemainingFuel() {
        BaseEngine Car1= new BaseEngine(2, 50);
        assertEquals(50, Car1.getRemainingFuel());
    }

    @Test
    void start() {
        BaseEngine Car1= new BaseEngine(2, 10);
        assertEquals(9.9, Car1.getRemainingFuel());
        assertEquals(true, Car1.isStarted());
        BaseEngine Car2= new BaseEngine(2, 10);
        Car2.remainingFuel = 0;
        assertEquals(false, Car2.isStarted());
    }

    @Test
    void consume() {
        BaseEngine Car1= new BaseEngine(2, 10);


    }

    @Test
    void addFuel() {
        BaseEngine Car1= new BaseEngine(2, 10);
        Car1.remainingFuel = 5;
        double volume = 15;
        assertEquals(10, Car1.remainingFuel);
        BaseEngine Car2= new BaseEngine(2, 30);
        Car1.remainingFuel = 5;
        assertEquals(20, Car2.remainingFuel);

    }

    @Test
    void isFull() {
        BaseEngine Car1= new BaseEngine(2, 10);
        assertEquals(10, Car1.isFull());

    }
}
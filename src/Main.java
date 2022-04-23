import Task.Car.BaseCar;
import Task.Car.Impl.Honda;
import Task.Car.Impl.Toyota;
import Task.Car.Impl.Zaporojets;

public class Main {
    public static void main(String[] args) {
        BaseCar[] cras = new BaseCar[] {new Honda("pink"), new Toyota("black"), new Zaporojets("crimson")};
        for (BaseCar cra : cras) {
            System.out.println("----------------------");
            cra.beep();
            cra.getStatus();
            cra.drive(50, 2800);
            cra.addFuel(52);
        }

    }
}


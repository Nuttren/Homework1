import transport.Car;

import java.time.Month;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 0, "Желтый", 0, "Россия", "ручная", "седан", "007", 3, true, new Car.Key(true,true));
        car1.changeTire();
        System.out.println(car1);
        Car.Key car2 = new Car.Key(true, false);
        System.out.println(car2);
    }

}
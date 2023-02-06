import transport.Car;
import transport.Bus;
import java.time.Month;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 5, 0, "Желтый", 2021, "Корея", "автоматическая", "седан", 4, true, new Car.Key(true,true));
        Car car2 = new Car("BMW", "x5", 0, 0, "Желтый", 2000, "Германия", "автоматическая", "седан", 4, true, new Car.Key(true,true));
        Car car3 = new Car("Ауди", "Q5", 0, 0, "Желтый", 2020, "Германия", "автоматическая", "седан", 4, true, new Car.Key(true,true));
        car1.changeTire();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        Car.Key car4 = new Car.Key(true, false);
        System.out.println(car4);

        Bus bus1 = new Bus ("Мерседес", "M10", 140, "Белый");
        Bus bus2 = new Bus("ПАЗ", "T34", 99, "Черный");
        Bus bus3 = new Bus ("Икарус", "X100", 150, "Красный");
        System.out.println("bus1 = " + bus1);
        System.out.println("bus2 = " + bus2);
        System.out.println("bus3 = " + bus3);
    }

}
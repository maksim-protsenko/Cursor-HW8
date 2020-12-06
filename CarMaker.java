import java.util.Random;
import java.util.UUID;

public class CarMaker {
    /* Написати клас-генератор, який повертає автомобіль з
рандомним значенням полів (generateCar()).*/

    private static UUID generateId() {
        return UUID.randomUUID();
    }

    private static Brand generateBrand() {
        int n = new Random().nextInt(Brand.values().length);
        return Brand.values()[n];
    }

    private static int generateYear() {
        return new Random().nextInt(2020 - 2000) + 2000;
    }

    private static int generateMileage() {
        return new Random().nextInt(70_000);
    }

    private static int generatePrice() {
        return new Random().nextInt(46_000 - 1000) + 35000;
    }

    public static Car generateCar() {
        UUID id = generateId();
        Brand brand = generateBrand();
        int year = generateYear();
        int mileage = generateMileage();
        int price = generatePrice();
        return new Car(id, brand, year, mileage, price);
    }
}



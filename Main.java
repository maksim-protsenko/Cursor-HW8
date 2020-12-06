import java.util.*;
import java.util.stream.Collectors;

public class Main {
/* Створити список автомобілів і провести над ними наступні операції:
- Відібрати тільки автомобілі тесла і ауді
- Відібрати тільки автомобілі молодші 2018 року
- Відібрати тільки автомобілі з пробігом менше 40000
- Відсортувати їх за ціною в порядку спадання
- Взяти три найдешевші і створити з них мапу, деключ це id автомобіля, а значення це об’єкт Car*/

    public static void main(String[] args) {
        List<Car> carsList = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            carsList.add(CarMaker.generateCar());
        }
        System.out.println(carsList);
        List<Car> selectedCars = carsList.stream()
                .filter(car -> car.getBrand().equals(Brand.TESLA) || car.getBrand().equals(Brand.AUDI))
                .filter(car -> car.getYear() > 2018)
                .filter(car -> car.getMileage() < 40000)
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList());
        long sizeOfList = selectedCars.size();

        try {
            Map<UUID, Car> cheapestCars = selectedCars.stream()
                    .skip(sizeOfList - 3)
                    .collect(Collectors.toMap(Car::getId, car -> car));
            System.out.println("Three the cheapest Tesla or Audi, which are made after 2018 year, mileage is less than 40000 miles: ");
            for (Map.Entry<UUID, Car> entry : cheapestCars.entrySet()) {
                System.out.println(entry.getValue());
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}


import java.util.UUID;

public class Car {
    /* Створити клас Car(id, brand, year, mileage, price)
    - id це java.util.UUID
    - Поле brand зробити єнамом з наступними значеннями:
    тесла, ауді, бмв, тойота, нісан. */
    private UUID id;
    private Brand brand;
    private int year;
    private int mileage;
    private int price;

    public Car(UUID id, Brand brand, int year, int mileage, int price) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car {");
        sb.append("id = ").append(id);
        sb.append(", brand = ").append(brand);
        sb.append(", year = ").append(year);
        sb.append(", mileage = ").append(mileage);
        sb.append(", price = ").append(price);
        sb.append('}');
        return sb.toString();
    }
}


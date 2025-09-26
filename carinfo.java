class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayCarInfo() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
    }
}


public class carinfo {
    public static void main(String[] args) {
        Car car1 = new Car("x", "y", 2023);
        car1.displayCarInfo();
    }
}

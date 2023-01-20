package transport;

import interfaces.Competing;
import driver.*;

public class Car extends Transport<DriverB> implements Competing {

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для " + getBrand() + " " + getModel());
    }

    @Override
    public void bestTimeOfCircle() {
        System.out.println("Лучшее время круга для " + getBrand() + " " + getModel() + "...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость для " + getBrand() + " " + getModel() + "...");
    }


}

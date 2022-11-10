package Polymorphism_Exercises.P02VehiclesExtension;

public class Car extends Vehicle {

    public final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + AC_ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    @Override
    public String drive(double distance) {
        return super.drive(distance);
    }
}

package Polymorphism_Exercises.P02VehiclesExtension;

public class Bus extends Vehicle{

    final public static double AC_ADDITIONAL_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String drive(double distance){
        setFuelConsumption(getFuelConsumption() + AC_ADDITIONAL_CONSUMPTION);
        String driveResult = super.drive(distance);
        setFuelConsumption(getFuelConsumption() - AC_ADDITIONAL_CONSUMPTION);
        return driveResult;
    }


}

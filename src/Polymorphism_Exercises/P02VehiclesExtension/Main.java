package Polymorphism_Exercises.P02VehiclesExtension;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", getVehicle(scanner));
        vehicleMap.put("Truck", getVehicle(scanner));
        vehicleMap.put("Bus", getVehicle(scanner));

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands ; i++) {
            String[] command = scanner.nextLine().split(" ");

            String commandName = command[0];
            String vehicleType = command[1];

            double argument = Double.parseDouble(command[2]);

            switch (commandName){
                case "DriveEmpty":
                    vehicleMap.get(vehicleType).driveEmpty(argument);
                case "Drive":
                    System.out.println(vehicleMap.get(vehicleType).drive(argument));
                    break;
                case "Refuel":
                    try {
                        vehicleMap.get(vehicleType).refuel(argument);
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
            }
        }
        vehicleMap.values().forEach(System.out::println);

    }

    private static Vehicle getVehicle(Scanner scanner) {
        String[] vehicleData =scanner.nextLine().split(" ");
        String vehicleType = vehicleData[0];
        double fuelAmount = Double.parseDouble(vehicleData[1]);
        double fuelConsumption = Double.parseDouble(vehicleData[2]);
        double tankCapacity = Double.parseDouble(vehicleData[3]);
        if ("Car".equals(vehicleType)) {
            return new Car(fuelAmount, fuelConsumption, tankCapacity);
        } else if ("Truck".equals(vehicleType)) {
            return new Truck(fuelAmount, fuelConsumption, tankCapacity);
        }else if ("Bus".equals(vehicleType)) {
            return new Bus(fuelAmount, fuelConsumption, tankCapacity);
        }
        throw new IllegalArgumentException("Missing car");
    }
}

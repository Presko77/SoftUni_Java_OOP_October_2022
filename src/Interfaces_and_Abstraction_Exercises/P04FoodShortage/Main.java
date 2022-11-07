package Interfaces_and_Abstraction_Exercises.P04FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyers = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] personParts = scanner.nextLine().split(" ");
            String personName = personParts[0];
            int personAge = Integer.parseInt(personParts[1]);
            if (personParts.length == 4) {
                //citizen
                String id = personParts[2];
                String birthDate = personParts[3];
                Citizen citizen = new Citizen(personName, personAge, id, birthDate);
                buyers.put(personName, citizen);
            } else {
                //rebel
                String group = personParts[2];
                Rebel rebel = new Rebel(personName, personAge, group);
                buyers.put(personName, rebel);
            }
            String nameFromConsole = scanner.nextLine();
            while (!"End".equals(nameFromConsole)){
                Buyer buyer = buyers.get(nameFromConsole);

                if (buyer != null){
                    buyer.buyFood();
                }

                nameFromConsole = scanner.nextLine();
            }
            int totalFood = buyers.values()
                    .stream()
                    .mapToInt(Buyer::getFood)
                    .sum();

            System.out.println(totalFood);
        }
    }


}

package Solid_Exercise;

import Encapsulation_Exercises.P03ShoppingSpree.Product;
import Solid_Exercise.calculator.CalorieCalculator;
import Solid_Exercise.output.Printer;
import Solid_Exercise.products.drink.Coke;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CalorieCalculator calorieCalculator = new CalorieCalculator();

        Printer printer = new Printer(calorieCalculator);

    }
}

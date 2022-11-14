package Solid_Exercise.output;

import Solid_Exercise.calculator.Calculator;
import Solid_Exercise.products.Product;

import java.util.List;

public class Printer implements  Output{

    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";
    private Calculator calculator;

    public Printer(Calculator calorieCalculator) {
        this.calculator = calorieCalculator;
    }

    public void outputSum(List<Product> products) {
        System.out.printf((SUM) + "%n", calculator.total(products));
    }

    public void outputAverage(List<Product> products) {
        System.out.printf((AVERAGE) + "%n", calculator.average(products));
    }
}

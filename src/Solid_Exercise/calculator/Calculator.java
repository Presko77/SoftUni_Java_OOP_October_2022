package Solid_Exercise.calculator;

import Solid_Exercise.products.Product;

import java.util.List;

public interface Calculator {

    double total(List<Product> products);
    double average(List<Product> products);
}

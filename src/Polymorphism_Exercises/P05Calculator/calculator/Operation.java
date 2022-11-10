package Polymorphism_Exercises.P05Calculator.calculator;

public interface Operation {
    void addOperand(int operand);
    int getResult();
    boolean isCompleted();
}
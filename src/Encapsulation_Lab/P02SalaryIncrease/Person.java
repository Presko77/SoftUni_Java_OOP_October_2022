package Encapsulation_Lab.P02SalaryIncrease;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {

        double bonusReduced = age < 30 ? bonus / 2 : bonus;
        double factor = 1.00 + bonusReduced / 100;
        salary = salary * factor;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.3f leva", firstName, lastName, salary);
    }
}
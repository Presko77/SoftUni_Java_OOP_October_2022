package Inheritance_Exercises.P06Animals.animals;

public class Dog extends Animal{
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound(){
        return "Woof!";
    }
}

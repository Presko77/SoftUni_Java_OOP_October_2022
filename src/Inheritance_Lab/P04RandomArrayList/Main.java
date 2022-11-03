package Inheritance_Lab.P04RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList randomArrayList = new RandomArrayList();
        randomArrayList.add(13);
        randomArrayList.add(12);
        randomArrayList.add(11);
        randomArrayList.add(15);

        System.out.println(randomArrayList.getRandomElement());

    }
}

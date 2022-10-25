package Working_with_Abstraction_Lab.P02Point_in_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int botLeftX = coordinates[0];
        int botLeftY = coordinates[1];
        int topRightX = coordinates[2];
        int topRightY = coordinates[3];

        Point bottomLeft = new Point(botLeftX, botLeftY);
        Point topRight = new Point(topRightX, topRightY);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int countPoints = Integer.parseInt(scanner.nextLine());

        for (int point = 1; point <= countPoints; point++) {
            int[] checkPointCoordinates = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            int x = checkPointCoordinates[0];
            int y = checkPointCoordinates[1];

            Point searchPoint = new Point(x, y);

            System.out.println(rectangle.contains(searchPoint));
        }

    }
}

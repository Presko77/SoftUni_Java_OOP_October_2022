package Working_with_Abstraction_Exercise.P05JediGalaxy;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        Field field = new Field(rows , cols);
        Galaxy galaxyMatrix = new Galaxy(field);

            int[] jediPositions = readPosition(scanner);
            int[] evilPosition = readPosition(scanner);
            int rowEvil = evilPosition[0];
            int colEvil = evilPosition[1];

            galaxyMatrix.moveEvil(rowEvil, colEvil);

            int rowJedi = jediPositions[0];
            int colJedi = jediPositions[1];

           int starsCollected = galaxyMatrix.moveJedi(rowJedi, colJedi);

        System.out.println(starsCollected);
        }

    private static int[] readPosition(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}

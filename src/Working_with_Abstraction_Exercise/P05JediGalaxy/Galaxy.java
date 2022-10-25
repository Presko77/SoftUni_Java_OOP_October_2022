package Working_with_Abstraction_Exercise.P05JediGalaxy;

public class Galaxy {
    private  Field field;

    public Galaxy(Field field) {
        this.field = field;
    }

    public int moveJedi(int rowJedi, int colJedi) {
        int starsCollected = 0;
        while (rowJedi >= 0 && colJedi < field.getColLenght()) {
            if (field.isInBounds(rowJedi, colJedi)) {
                starsCollected += field.getValue(rowJedi,colJedi);
            }

            colJedi++;
            rowJedi--;
        }
        return starsCollected;
    }

    public void moveEvil(int rowEvil, int colEvil) {
        while (rowEvil >= 0 && colEvil >= 0) {
            if (field.isInBounds(rowEvil, colEvil)) {
                field.setValue(rowEvil, colEvil, 0);
            }
            rowEvil--;
            colEvil--;
        }
    }


}

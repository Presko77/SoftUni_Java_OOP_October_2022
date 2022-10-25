package Working_with_Abstraction_Exercise.P05JediGalaxy;

public class Field {
    private int[][] starsFiled;

    public Field(int rows, int cols) {
        this.starsFiled = new int[rows][cols];
        fillInGalaxy(rows, cols, starsFiled);
    }

    private void fillInGalaxy(int rows, int cols, int[][] galaxyMatrix) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                galaxyMatrix[row][col] = value++;
            }
        }
    }

    public boolean isInBounds(int row, int col){
        return row >=0 && col >= 0 && row < starsFiled.length && col < starsFiled[row].length;
    }

    public int getValue(int row, int col){
        return  this.starsFiled[row][col];
    }

    public void setValue(int row, int col, int newValue){
        starsFiled[row][col] = newValue;
    }

    public  int getColLenght(){
        return starsFiled[1].length;
    }

}

public class Grid {
    private String[][] gridContainer;
    private String symbol;
    private int rowLowerLimit, rowUpperLimit;
    private int columnLowerLimit, columnUpperLimit;

    public Grid() {
        gridContainer = new String[][]{
                {"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"},
        };
        symbol = "X";
        rowLowerLimit = 0;
        rowUpperLimit = 2;
        columnLowerLimit = 0;
        columnUpperLimit = 2;
    }

    public boolean isValid(int row, int column) {
        if (row < rowLowerLimit || row > rowUpperLimit || column < columnLowerLimit || column > columnUpperLimit) {
            System.out.println("Invalid Locations");
            return false;
        } else if (gridContainer[row][column].equals("X") || gridContainer[row][column].equals("O")) {
            System.out.println("Current location is already occupied");
            return false;
        }
        return true;
    }

    public boolean isSet(int row, int column) {
        if (isValid(row, column)) {
            if (symbol.equals("O")) {
                gridContainer[row][column] = "O";
                symbol = "X";
            } else {
                gridContainer[row][column] = "X";
                symbol = "O";
            }
            return true;
        }
        return false;
    }

    public boolean isGameCompleted() {
        String firstDiagonalResult = gridContainer[0][0] + gridContainer[1][1] + gridContainer[2][2];
        if (firstDiagonalResult.equals("XXX") || firstDiagonalResult.equals("OOO")) {
            return true;
        }
        String secondDiagonalResult = gridContainer[0][2] + gridContainer[1][1] + gridContainer[2][0];
        if (secondDiagonalResult.equals("XXX") || secondDiagonalResult.equals("OOO")) {
            return true;
        }
        for (int i = 0; i < 3; i++) {
            String columnResult = gridContainer[0][i] + gridContainer[1][i] + gridContainer[2][i];
            if (columnResult.equals("XXX") || columnResult.equals("OOO")) {
                return true;
            }
            String rowResult = gridContainer[i][0] + gridContainer[i][1] + gridContainer[i][2];
            if (rowResult.equals("XXX") || rowResult.equals("OOO")) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(gridContainer[i][j] + " ");
            }
            System.out.println();
        }
    }
}

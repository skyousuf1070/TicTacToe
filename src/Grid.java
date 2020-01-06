public class Grid {
    private String[][] cells;
    private static final int LOWER_LIMIT = 0;
    private static final int UPPER_LIMIT = 2;

    public Grid() {
        cells = new String[][]{
                {"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"},
        };
    }

    public boolean isValid(int row, int column) {
        boolean isRowColumnOutOfGridRange = row < LOWER_LIMIT || row > UPPER_LIMIT || column < LOWER_LIMIT || column > UPPER_LIMIT;
        boolean isCellFilled = cells[row][column].equals("X") || cells[row][column].equals("O");
        if (isRowColumnOutOfGridRange) {
            System.out.println("Invalid Locations");
            return false;
        } else if (isCellFilled) {
            System.out.println("Current location is already occupied");
            return false;
        }
        return true;
    }

    public boolean isSet(int row, int column, String symbol) {
        if (isValid(row, column)) {
            cells[row][column] = symbol;
            return true;
        }
        return false;
    }

    private boolean allCharactersSame(String string)
    {
        for (int strIndex = 1; strIndex < string.length(); strIndex++)
            if (string.charAt(strIndex)=='_' && string.charAt(strIndex) != string.charAt(0))
                return false;

        return true;
    }

    public boolean isGameCompleted() {
        String firstDiagonalResult = cells[0][0] + cells[1][1] + cells[2][2];
        if (allCharactersSame(firstDiagonalResult)) {
            return true;
        }
        String secondDiagonalResult = cells[0][2] + cells[1][1] + cells[2][0];
        if (allCharactersSame(secondDiagonalResult)) {
            return true;
        }
        for (int gridIndex = LOWER_LIMIT; gridIndex <= UPPER_LIMIT; gridIndex++) {
            String columnResult = cells[0][gridIndex] + cells[1][gridIndex] + cells[2][gridIndex];
            if (allCharactersSame(columnResult)) {
                return true;
            }
            String rowResult = cells[gridIndex][0] + cells[gridIndex][1] + cells[gridIndex][2];
            if (allCharactersSame(rowResult)) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int gridRowIndex = LOWER_LIMIT; gridRowIndex <= UPPER_LIMIT; gridRowIndex++) {
            for (int gridColumnIndex = 0; gridColumnIndex < 3; gridColumnIndex++) {
                System.out.print(cells[gridRowIndex][gridColumnIndex] + " ");
            }
            System.out.println();
        }
    }
}

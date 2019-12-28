public class TicTakToe {
    public static void main(String[] args) {
        Grid grid = new Grid();
        Player player1 = new Player("Naveen", grid);
        Player player2 = new Player("Praveen", grid);
        boolean isPlayer1Turn = true;
        boolean isPlayer2Turn = false;
        while (!grid.isGameCompleted()) {
            if (isPlayer1Turn) {
                player1.play();
                isPlayer1Turn = false;
                isPlayer2Turn = true;
            } else {
                player2.play();
                isPlayer1Turn = true;
                isPlayer2Turn = false;
            }
        }
        if (isPlayer1Turn) {
            System.out.println("Winner is " + player1.getName());
        } else {
            System.out.println("Winner is " + player2.getName());
        }
    }
}

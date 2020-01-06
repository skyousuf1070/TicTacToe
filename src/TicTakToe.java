public class TicTakToe {
    private Grid grid;
    private Player player1;
    private Player player2;

    public TicTakToe() {
        grid = new Grid();
        player1 = new Player("Naveen", "X");
        player2 = new Player("Praveen", "O");
    }

    public void launchGame() {
        String whoIsPlaying = "player1";
        while (!grid.isGameCompleted()) {
            if (whoIsPlaying.equals("player1")) {
                player1.play(grid);
                whoIsPlaying = "player2";
            } else {
                player2.play(grid);
                whoIsPlaying = "player1";
            }
        }
        if (whoIsPlaying.equals(player1)) {
            System.out.println("Winner is " + player1.getName());
        } else {
            System.out.println("Winner is " + player2.getName());
        }
    }

    public static void main(String[] args) {
        new TicTakToe().launchGame();
    }
}

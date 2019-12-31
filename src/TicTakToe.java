public class TicTakToe {
    public void launchGame() {
        Grid grid = new Grid();
        Player player1 = new Player("Naveen", grid);
        Player player2 = new Player("Praveen", grid);
        Player whoIsPlaying = player1;
        while (!grid.isGameCompleted()) {
            if (whoIsPlaying.equals(player1)) {
                player1.play();
                whoIsPlaying = player2;
            } else {
                player2.play();
                whoIsPlaying = player1;
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

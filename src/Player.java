import java.util.Scanner;

public class Player {
    private String name;
    private Grid grid;
    private Scanner scanner;

    public Player(String name, Grid grid) {
        this.name = name;
        this.grid = grid;
        scanner = new Scanner(System.in);
    }

    public Player(Grid grid) {
        this.name = "Yousuf";
        this.grid = grid;
        scanner = new Scanner(System.in);
    }

    public void play() {
        System.out.println("\n\nBefore " + name + "'s Turn");
        grid.display();
        System.out.print("Enter row number and column number: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        while (!grid.isSet(row, column)) {
            System.out.print("Enter row number and column number: ");
            row = scanner.nextInt();
            column = scanner.nextInt();
        }
        System.out.println("After " + name + "'s Turn");
        grid.display();
    }

    public String getName() {
        return name;
    }
}

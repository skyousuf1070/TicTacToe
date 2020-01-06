import java.util.Scanner;

public class Player {
    private String name;
    private String symbol;

    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public Player(String symbol) {
        this.name = "Yousuf";
        this.symbol = symbol;
    }

    public void play(Grid grid) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nBefore " + name + "'s Turn");
        grid.display();
        System.out.print("Enter row number and column number: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        while (!grid.isSet(row, column, symbol)) {
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

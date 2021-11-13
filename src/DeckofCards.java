import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class DeckofCards {
    static Scanner s = new Scanner(System.in);
    private static int number;

    public static void initGame() {
        int card = 0;
        String[] suit = {"Club", "Diamond", "Spades", "Hearts"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] deck = new String[suit.length][rank.length];

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[i][j] = suit[i] + " " + rank[j];
                System.out.println(deck[i][j]);
                card++;
            }
            System.out.println(" ");

        }
        System.out.println("The total number of cards are " + card);
    }

    private static void addPlayer() {
        int number = s.nextInt();
        if (number > 2 && number <= 4) {
            System.out.println("Lets start the Game");
            System.out.println("Enter Player's name");
            for (int i = 0; i <= number; i++) {
                String fn = s.nextLine();
                for (int j = 0; j < number; j++) {
                    System.out.println(fn);
                    break;
                }
            }
        } else {
            System.out.println("Game can be played by 3 and 4 players only ");
            System.out.println("Please enter again");
            addPlayer();

        }
    }

    public static void orderPlayerTurn(int num) {
        System.out.println("Enter players order");
        for (int i = 1; i <= num; i++) {
            int turn = s.nextInt();
            System.out.println("Player"+turn+"goes"+i);;
        }
    }

    public static void main(String[] args) {
        initGame();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players");
        int num = sc.nextInt();
        addPlayer();
        orderPlayerTurn(num);

    }
}
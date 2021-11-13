import java.util.Scanner;

public class DeckofCards {
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

    public static void addPlayer() {
        System.out.println("Enter Number of Players");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (number >= 2 && number <= 4) {
            System.out.println("Lets start the Game");
        } else {
            System.out.println("Game can be played by 2 , 3 and 4 players only ");
            System.out.println("Please enter again");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To The Deck of Card Problem");
        initGame();
        addPlayer();

    }
}
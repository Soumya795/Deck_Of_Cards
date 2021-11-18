package DeckofCards;

import java.util.*;
public class CardMain {
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of players");
        num=sc.nextInt();
        if(num<2||num>4)
        {
            System.out.println("Enter the number of players more than 2 to max 4");
            num=sc.nextInt();
        }
        sc.close();
        Players add=new Players(num);
        add.sequencePlayer();
        add.distributeCard();
        add.verify();
    }
}



/*import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DeckofCards.DeckofCards {
    private static String[] suit = { "Spades", "Hearts", "Diamond", "Clubs" };
    private static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    private static String[][] deckOfCards = { suit, rank };
    private static Card[] deck = new Card[52];
    private static List<Player> playerList = new ArrayList<Player>();
    private static Scanner sc = new Scanner(System.in);
    static Scanner s = new Scanner(System.in);
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
    public static void shuffleDeckOfCards() {
        String[] suit = {"Club", "Diamond", "Spades", "Hearts"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[][] deck = new String[suit.length][rank.length];

        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            String[] tempArray = deck[i];
            for (int j = 0; j < tempArray.length; j++) {
                // Random for remaining positions.
                int r = j + rand.nextInt(tempArray.length - j);
                // swapping the elements
                String temp = tempArray[r];
                tempArray[r] = tempArray[j];
                tempArray[j] = temp;
            }
            deck[i] = tempArray;
        }
    }
    public static void distributeCards(int num) {

        //static card[] deck = new Card[52];
        playerList.stream().sorted(Comparator.comparingInt(Player::getPlayerTurn)).collect(Collectors.toList());
        for (int p = 0; p < num; p++) {
            int count = 0;
            int cardIndex = 0;
            Card[] cardSet = new Card[9];
            while (count < 9) {
                Card card = deck[cardIndex];
                cardSet[count] = card;
                cardIndex += 4;
                count++;
            }
            playerList.get(p).setCard(cardSet);
        }
    }
    public class Card {
        String suit;
        String rank;

        public Card(String suit, String rank) {
            this.rank = rank;
            this.suit = suit;
        }

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }
        public String toString() {
            return "Card [suit=" + suit + ", rank=" + rank + "]";
        }
    }

    public class Player {
        String firstname;
        String lastName;
        int playerTurn;
        Card[] card;

        public Player(String firstname, String lastName) {
            this.firstname = firstname;
            this.lastName = lastName;
            this.playerTurn = 0;
            this.card = new Card[10];
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getPlayerTurn() {
            return playerTurn;
        }

        public void setPlayerTurn(int playerTurn) {
            this.playerTurn = playerTurn;
        }

        public Card[] getCard() {
            return card;
        }

        public void setCard(Card[] card) {
            this.card = card;
        }

        @Override
        public String toString() {
            return "Player [firstname=" + firstname + ", lastName=" + lastName + ", playerTurn=" + playerTurn + ", card="
                    + Arrays.toString(card) + "]";
        }

    }
    public static void main(String[] args) {
        initGame();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players");
        int num = sc.nextInt();
        addPlayer();
        orderPlayerTurn(num);
        shuffleDeckOfCards();
distributeCards(num);

}
}*/


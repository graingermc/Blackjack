import java.util.*;
public class Dealer {

    private ArrayList<Card> Cards;

    public Dealer(){
        Cards.add(newCard());
        Cards.add(newCard());
        Cards.get(1).flip();
    }

    private Card newCard(){
        String[] numbers = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};

        int x = (int) Math.random() * 13;
        int y = (int) Math.random() * 4;

        return new Card(numbers[x], suits[y], true);
    }
}

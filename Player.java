import java.util.*;
public class Player{

    ArrayList<Card> Cards = null;

    public Player(){
        Cards.add(newCard());
        Cards.add(newCard());
    }

    public int handValue(){
        int value = 0;
        for(int i = 0; i < Cards.size(); i++){
            value += Cards.get(i).getValue();
        }
        return value;
    }

    private Card newCard(){
        String[] numbers = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};

        int x = (int) Math.random() * 13;
        int y = (int) Math.random() * 4;

        return new Card(numbers[x], suits[y], true);
    }
}

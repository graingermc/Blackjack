public class Card {

    private String number;
    private String suit;
    private Boolean faceUp;

    public Card(String newNumber, String newSuit, Boolean isFaceUp){
        number= newNumber;
        suit = newSuit;
        faceUp = isFaceUp;
    }

    public int getValue(){
        int[] cardValues = {1,2,3,4,5,6,7,8,9,10,10,10,10};
        String[] numbers = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i].equals(number)){
                if(faceUp)
                    return cardValues[i];
                else
                    return 0;
            }
        }
        return 0;
    }

    public void flip(){
        faceUp = !faceUp;
    }
}

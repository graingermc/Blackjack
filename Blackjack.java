import java.util.*;
public class Blackjack{
    public static void main(String[] args){
        int balance = 500;
        Dealer dealer = new Dealer();
        Player player = new Player();

        System.out.println(player.handValue());

    }

}

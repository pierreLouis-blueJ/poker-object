import java.util.Random;
import java.util.ArrayList;

public class Deck{
    
    public static Random random = new Random();
    public static final String [] names = {"ACE", "KING", "QUEEN", "JACK", "TEN", "NINE", "EIGHT", "SEVEN"};
    public static final String [] colors = {"COEUR", "CARREAU", "TREFLE", "PIQUE"};
    public static ArrayList<Card> deck = new ArrayList<Card>(); 
    
    public static void creationDeck(){
        for(String nom : names){ // création des 32 cartes
            for(String couleur : colors){
                Card carte = new Card(nom, couleur);
                deck.add(carte); 
            }
        }
    }
    

    public static ArrayList<Card> newRandomHand(){
        ArrayList<Card> newMain = new ArrayList<Card>(); 

        //for(Card carte : newMain){
            //System.out.println("" + carte.nom + " de "+ carte.nom);
        //}
        for(int i=0; i<5; i++){
            int x = random.nextInt(0, deck.size()-1);
            newMain.add(deck.get(x));
            deck.remove(x);
        }
        return newMain;

    }

    public static void main(String[] args){
        Deck deck1 = new Deck();
        Deck.creationDeck();
        ArrayList<Card> main = newRandomHand();
        for(Card carte : main){
            System.out.println("" + carte.nom + " de "+ carte.couleur);
        }
System.out.println(" ---- ");
        for(Card carte : deck){
            System.out.println("" + carte.nom + " de "+ carte.couleur);
        }

        }
}

import java.util.Random;
import java.util.ArrayList;

public class Deck{
    
    public static Random random = new Random(); // Pour obtenir des entiers aléatoires
    public static final String [] names = {"ACE", "KING", "QUEEN", "JACK", "TEN", "NINE", "EIGHT", "SEVEN"}; // les 8 valeurs constantes
    public static final String [] colors = {"COEUR", "CARREAU", "TREFLE", "PIQUE"}; // les 4 couleurs constantes
    public static ArrayList<Card> deck = new ArrayList<Card>(); // attribut deck de type list initialisé
    
    public void Deck(){ //constructeur qui initialise le deck à sa création
        creationDeck();
    }
    
    public static void creationDeck(){ // création des 32 cartes et ne retourne rien
        for(String nom : names){ // parcours des valeurs constantes
            for(String couleur : colors){ 
                Card carte = new Card(nom, couleur); // appel à la classe Card pour créer un objet Carte
                deck.add(carte); // et l'ajouter au deck
            }
        }
    }
    
    public static ArrayList<Card> newRandomHand(){ // retourne cinq cartes obtenues aléatoirement dans une liste
        ArrayList<Card> newMain = new ArrayList<Card>(); // initialisation

        for(int i=0; i<5; i++){ // 5 éxécutions
            int x = random.nextInt(0, deck.size()-1); // nombre choisi entre 0 et le nombre de cartes dans le deck (31 au départ)
            newMain.add(deck.get(x)); // carte ajouter dans la liste
            deck.remove(x); // la carte disparait du deck
        }
        return newMain;
    }

    public static ArrayList<Card> getRandomCards(int nbCartesManquantes){ // en paramètre le nombre de cartes ajoutées
        ArrayList<Card> ajoutCartes = new ArrayList<Card>(); 
        for(int i=0; i<=nbCartesManquantes; i++){  // même principe que newRandomHand() mais avec un nombre de cartes choisi par l'utilisateur
            int x = random.nextInt(0, deck.size()-1);
            ajoutCartes.add(deck.get(x));
            deck.remove(x);
        }
        return ajoutCartes;
    }

    /*public static void main(String[] args){ 
       
     -> permet de tester la création du deck et la création d'une main  
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
        }*/
        
}

import java.util.ArrayList;
import java.util.Scanner;
public class Player {
    
    public String nomJoueur;
    public ArrayList<Card> mainJoueur = new ArrayList<Card>(); // main du joueur de départ initialisée
    
    public Player(String nom){ //constructeur initialisant le nom du joueur
        this.nomJoueur=nom;
    }
    
    public String setHand(ArrayList<Card> main){ //enregistre une main de 5 cartes dans les données d'un joueur
        for(Card carte : main){ // Parcours de la liste de cartes données en paramètre
            mainJoueur.add(carte); // Ajout de la carte dans la main du joueur
        }

        return "";

    }

    public String getHandString(){ //affiche les cinq cartes du joueur et retourne une chaine de caractères
        StringBuiler sb = new StringBuilder(); 

        for(Card carte : mainJoueur){
            String hand = ""+ carte.nom + " " + carte.couleur + " / ";
            sb.append(hand);
        }
        return sb.toString();
    }

    public Card[] getCardsToDiscard(){ // le joueur supprime une ou plusieurs valeurs de sa main et renvoie une liste de cartes
        Scanner appel = new Scanner(System.in);
        System.out.println("Combien de cartes voulez-vous défausser");
        int nbCartesFausse = appel.nextInt(); // nombres de cartes défaussées
        Card[] fausse = new Card[nbCartesFausse]; // tableau qui possède les valeurs des cartes défaussées
       
        for(Card carte : mainJoueur){ // Affichage des cartes
            int i = 1;
            System.out.println("Carte 1 = "+ carte.nom + " de " + carte.couleur + " / ");
            i++;
        }

        for(int i = 0; i<nbCartesFausse; i++){ // Suppression d'une carte via son index dans la main du joueur
            System.out.println("Entrez le numéro de la carte que vous souhaitez retirer");
            int index = appel.nextInt(); // index = numéro de la carte
            fausse[i] = mainJoueur.get(index); // ajoute cette carte dans la fausse
            mainJoueur.remove(index); // et la supprime de la main du joueur
        }
        
        return fausse;
        }
    
        
    

    public String addCard(ArrayList<Card> nvCartes){ //ajoute une ou plusieurs cartes dans la main du Joueur
        for(Card carte : nvCartes){
            mainJoueur.add(carte);
        }
        return "";
    }

    
   /*  public static void main(String [] args){
        Card carte0 = new Card("VALET", "COEUR");
        Card carte1 = new Card("VALET", "TREFLE");
        Card carte2 = new Card("VALET", "PIQUE");
        Card carte3 = new Card("VALET", "CARREAU");

        Card carte4 = new Card("DAME", "COEUR");

        ArrayList<Card> cartesTest = new ArrayList<Card>();
        cartesTest.add(carte0);
        cartesTest.add(carte1);
        cartesTest.add(carte2);
        cartesTest.add(carte3);
        cartesTest.add(carte4);
        mainJoueur = setHand(cartesTest);


        for(Card carte : mainJoueur){
            System.out.println("" + carte.nom + " de " + carte.couleur + "");
        }
        
        
        
        //Player p1 = new Player("Nico");
        //System.out.println(p1.nomJoueur);
    } */
}

public class Player {
    
    public static String nomJoueur;
    public static ArrayList<Card> mainJoueur = new ArrayList<Card>();
    
    public Player(String nom){
        this.nomJoueur=nom;
    }
    
    public static void setHand(ArrayList<Card> main){ //enregistre cinq carte dans l'objet du Player
        for(Card carte : main){
            mainJoueur.add(carte);
        }



    }

    public static String getHandString(){ //affiche les cinq cartes du joueur
        StringBuiler sb = new StringBuilder();

        for(Card carte : mainJoueur){
            String hand = ""+ carte.nom + " " + carte.couleur + " / ";
            sb.append(hand);
        }
        return sb.toString();
    }

    //public static Card[] getCardstoDiscard(){ // le joueur supprime une ou plusieurs valeurs de sa main et renvoie une liste de cartes

    //}

    public static String addCard(ArrayList<Card> nvCartes){ //ajoute une carte dans la main du Joueur
        
        return "";
    }
    
    public static void main(String [] args){
       
        for(Card carte : mainJoueur){
            System.out.println("" + carte.nom + " de " + carte.couleur + "");
        }
        
        
        
        //Player p1 = new Player("Nico");
        //System.out.println(p1.nomJoueur);
    }
}

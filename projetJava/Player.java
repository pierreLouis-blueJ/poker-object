public class Player {
    public static String nomJoueur;
    public static Card [] mainJoueur = new Card[];
    public Player(String nom){
        this.nomJoueur=nom;
    }
    public static void setHand(Card[] tab){ //enregistre cinq carte dans l'objet du Player
        for(Card carte : tab){
            
        }



    }

    public static void getHandString(){ //affiche les cinq cartes du joueur
        for(Card carte : mainJoueur){
            System.out.println("Voici votre main : "+ carte.nom + carte.couleur);
        }
    }

    public static Card[] getCardstoDiscard(){ // le joueur supprime une ou plusieurs valeurs de sa main et renvoie une liste de cartes

    }

    public static String addCard(Card carte){ //ajoute une carte dans la main du Joueur

    }
    
    public static void main(String [] args){
        
        //Player p1 = new Player("Nico");
        //System.out.println(p1.nomJoueur);
    }
}

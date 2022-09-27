public class Player {
    
    public static String nomJoueur;
    public static Card [] mainJoueur = new Card[5];
    
    public Player(String nom){
        this.nomJoueur=nom;
    }
    
    public static void setHand(Card[] tab){ //enregistre cinq carte dans l'objet du Player
        for(Card carte : tab){
            
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

    public static String addCard(Card [] nvCartes){ //ajoute une carte dans la main du Joueur
        List<Card> mainListe = new ArrayList<>(Arrays.asList(mainJoueur));
        for(Card carte : nvCartes){
        mainListe.add(carte);
        }
        mainJoueur = new Card[ mainListe.size() ];
        mainListe.toArray(mainJoueur);
        return "";
    }
    
    public static void main(String [] args){
        Card carte1 = new Card("VALET", "COEUR");
        Card [] nvCartes = {carte1};
        mainJoueur[0] = new Card("VALET", "TREFLE");
        mainJoueur[1] = new Card("DAME", "TREFLE");
        mainJoueur[2] = new Card("ROI", "PIQUE");
        mainJoueur[3] = new Card("NEUF", "TREFLE");
        mainJoueur[4] = new Card("ACE", "CARREAU");
        for(Card carte : mainJoueur){
            System.out.println("" + carte.nom + " " + carte.couleur + "");
        }
        

        
        //Player p1 = new Player("Nico");
        //System.out.println(p1.nomJoueur);
    }
}

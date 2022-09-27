public class Deck {
    static boolean[][] tab = new boolean[8][4];
    static final String [] names = {"ACE", "KING", "QUEEN", "JACK", "TEN", "NINE", "EIGHT", "SEVEN"};
    static final String [] colors = {"COEUR", "CARREAU", "TREFLE", "PIQUE"};
    
    static ArrayList<String> noms = new ArrayList<String>(); 
    static ArrayList<String> couleurs =new ArrayList<String>();  
    
    public static void creationListes(){
    for(String nom : names){
        noms.add(nom);
    }
    
    for(String couleur : colors){
        couleurs.add(couleur);
    }
        
    }

    public int getIndexName(Card carte){
        return noms.indexOf(carte.nom);
    }

    public int getIndexCouleur(Card carte){
        return couleurs.indexOf(carte.couleur);
    }
    
    public static Card[] newRandomHand(){
        Card main [] = new Card[5];
        return main;
    }

    public static void main(String[] args){
        Deck deck1 = new Deck();
        System.out.println(tab[5][2]);
    }
}

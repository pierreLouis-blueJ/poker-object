public class Card {
    public static String nom;
    public static String couleur;
    public Card(String name, String color){
        this.nom = name;
        this.couleur = color;

    }
    
    public static void main(String[] args){
        Card carte1 = new Card("ACE", "COEUR");
        System.out.println(carte1);
    }
}
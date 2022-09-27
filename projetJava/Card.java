public class Card {
    protected String nom;
    protected String couleur;
    protected Card(String name, String color){
        this.nom = name;
        this.couleur = color;

    }
    
    public static void main(String[] args){
        Card carte1 = new Card("ACE", "COEUR");
        System.out.println(carte1.nom);
    }
}

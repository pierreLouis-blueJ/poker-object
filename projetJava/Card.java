public class Card {
    
    public String nom; //attribut nom de la carte
    public String couleur; //attribut couleur de la carte
    
    public Card(String name, String color){ //constructeur qui récupère les informations données par les paramètres
        this.nom = name; 
        this.couleur = color;

    }
    
   /* public static void main(String[] args){
        Card carte1 = new Card("ACE", "COEUR");
        System.out.println(carte1.nom);
    }*/
}

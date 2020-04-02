public class Main {
    public static void main(String[] args) {

        Attaque attaqueFortePikatchu = new Attaque("Fourme d'amber",87);
        Attaque attaqueFaiblePikatchu = new Attaque("Camembert", 17);

        Attaque attaqueForteRobert = new Attaque("Seroplex", 81);
        Attaque attaqueFaibleRobert = new Attaque("Xanax", 12);

        Pokemon pikachu = new Pokemon(1,"Pikatchu","Fromage",180, 82,100,attaqueFortePikatchu, attaqueFaiblePikatchu);
        Pokemon robert = new Pokemon(2,"Robert", "Dépressif", 170, 67, 100,attaqueForteRobert, attaqueFaibleRobert);

    }
}

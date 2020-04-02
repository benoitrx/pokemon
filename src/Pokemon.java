public class Pokemon {
    private int id;
    private String nom;
    private String type;
    private int taille;
    private int poids;
    private int nbrPointsVie;

    private Attaque attaqueForte;
    private Attaque attaqueFaible;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getNbrPointsVie() {
        return nbrPointsVie;
    }

    public void setNbrPointsVie(int nbrPointsVie) {
        this.nbrPointsVie = nbrPointsVie;
    }

    public Attaque getAttaqueForte() {
        return attaqueForte;
    }

    public void setAttaqueForte(Attaque attaqueForte) {
        this.attaqueForte = attaqueForte;
    }

    public Attaque getAttaqueFaible() {
        return attaqueFaible;
    }

    public void setAttaqueFaible(Attaque attaqueFaible) {
        this.attaqueFaible = attaqueFaible;
    }

    public Pokemon(int id, String nom, String type, int taille, int poids, int nbrPointsVie, Attaque attaqueForte, Attaque attaqueFaible) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.taille = taille;
        this.poids = poids;
        this.nbrPointsVie = nbrPointsVie;
        this.attaqueForte = attaqueForte;
        this.attaqueFaible = attaqueFaible;
    }
}

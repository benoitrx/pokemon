public class Pokemon {
    private int id;
    private String nom;
    private String type;
    private int taille;
    private int poids;
    private float nbrPointsVie;
    private float nbrPointsVieRestants;

    public float getNbrPointsVieRestants() {
        return nbrPointsVieRestants;
    }

    public void setNbrPointsVieRestants(float nbrPointsVieRestants) {
        this.nbrPointsVieRestants = nbrPointsVieRestants;
    }

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

    public float getNbrPointsVie() {
        return nbrPointsVie;
    }

    public void setNbrPointsVie(float nbrPointsVie) {
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

    public Pokemon(int id, String nom, String type, int taille, int poids, float nbrPointsVie, Attaque attaqueForte, Attaque attaqueFaible) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.taille = taille;
        this.poids = poids;
        this.nbrPointsVie = nbrPointsVie;
        this.attaqueForte = attaqueForte;
        this.attaqueFaible = attaqueFaible;
        this.nbrPointsVieRestants = nbrPointsVie;
    }

    public boolean estEnVie(){
        if (this.getNbrPointsVieRestants()>0) return true;
        else return false;
    }

    public boolean isDixPourcentPDV(){
        //si le pokemon a atteint 10% de pdv restants*
       if (((this.getNbrPointsVieRestants()/this.getNbrPointsVie())*100)>=10) return false;
        else return true;
    }

    public boolean isEnerve(){
        return true;
    }

    public void attaqueFaible(Pokemon poke){
        System.out.println();
        System.out.println(this.getNom() + " attaque " + poke.getNom() + " avec " + this.getAttaqueFaible().getNom());
        poke.setNbrPointsVieRestants(poke.getNbrPointsVieRestants()-attaqueFaible.getForce());
        System.out.println("Il reste " + poke.getNbrPointsVieRestants() + " à " + poke.getNom());
    }

    public void attaqueForte(Pokemon poke){
        System.out.println();
        System.out.println("houla ! " + this.getNom() + " s'enerve !");
        System.out.println(this.getNom() + " attaque " + poke.getNom() + " avec " + this.getAttaqueForte().getNom());
        poke.setNbrPointsVieRestants(poke.getNbrPointsVieRestants()-attaqueForte.getForce());
        System.out.println("Il reste " + poke.getNbrPointsVieRestants() + " à " + poke.getNom());
    }

    public void attaquePokemon (Pokemon autrePokemon){

        if (this.estEnVie()){
            if (!this.isDixPourcentPDV()) this.attaqueFaible(autrePokemon);
            else this.attaqueForte(autrePokemon);

            if(!autrePokemon.estEnVie()){
                System.out.println(autrePokemon.getNom() + " est mort... RIP");
                System.out.println("Longue vie au vainqueur " + this.getNom() + " !!!");
            }
        }


    }

}

public class Attaque {

    private String nom;
    private int force;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public Attaque(String nom, int force){
        this.nom = nom;
        this.force = force;
    }

}

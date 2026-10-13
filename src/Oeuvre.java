public class Oeuvre {
    private String nom;
    private int annee;
    private float largeur;
    private float hauteur;

    // --- Constructors
    public Oeuvre(String nom, int annee, float largeur, float hauteur) {
        this.nom = nom;
        this.annee = annee;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // --- Getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    // --- Overrides
    @Override
    public String toString() {
        return nom + " (" + annee + ")";
    }
}

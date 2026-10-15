public class Oeuvre {
    private String nom;
    private final int annee;
    private final float largeur;
    private final float hauteur;

    // Une oeuvre est associée à une artiste
    private Artiste artiste;

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

    public static float getLargeur() {
        return 1.0f;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setArtiste(Artiste artiste){
        this.artiste = artiste;
    }

    // --- Overrides
    @Override
    public String toString() {
        return nom + " (" + annee + ")";
    }
}

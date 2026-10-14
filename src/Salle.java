public class Salle {
    private int etage;
    private String nom;
    private final float superficie;

    // --- Constructors
    public Salle(int etage, String nom, float superficie) {
        this.etage = etage;
        this.nom = nom;
        this.superficie = superficie;
    }

    // --- Getters and setters
    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getSuperficie() {
        return superficie;
    }

    // --- Overrides
    @Override
    public String toString() {
        return "Salle : " + nom + ", étage " + etage + ", " + superficie + " m²";
    }
}

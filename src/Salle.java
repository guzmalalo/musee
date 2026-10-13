public class Salle {
    private int etage;
    private String nom;
    private float superficie;

    // --- constructeurs
    public Salle(int etage, String nom, float superficie) {
        this.etage = etage;
        this.nom = nom;
        this.superficie = superficie;
    }

    // --- getters and setters
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

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    // --- overrides


    @Override
    public String toString() {
        return "Salle{" +
                "etage=" + etage +
                ", nom='" + nom + '\'' +
                ", superficie=" + superficie +
                '}';
    }
}

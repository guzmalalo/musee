import java.util.ArrayList;

public class Salle {
    private int etage;
    private String nom;
    private final float superficie;
    private ArrayList<Oeuvre> oeuvres;

    // --- Constructors
    public Salle(int etage, String nom, float superficie) {
        this.etage = etage;
        this.nom = nom;
        this.superficie = superficie;
        this.oeuvres = new ArrayList<>();
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

    // --- methodes
    public void ajouterOeuvre(Oeuvre o){
        oeuvres.add(o);
    }

    // --- Overrides
    @Override
    public String toString() {
        String message = "Salle : " + nom + ", étage " + etage + ", " + superficie + " m²";
        message += "\nOeuvres : \n";
        for (Oeuvre o: oeuvres){
            message += o.toString();
        }
        return message;
    }
}

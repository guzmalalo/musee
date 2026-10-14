import java.time.LocalDate;

public class Artiste {
    private String nom;
    private String prenom;
    private final LocalDate dateNaissance;

    // --- Constructors
    public Artiste(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    // --- Getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    // --- Overrides
    @Override
    public String toString() {
        return "Artiste : " + prenom + " " + nom;
    }
}

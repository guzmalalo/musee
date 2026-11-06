import java.time.LocalDate;

public class Artiste implements Comparable<Artiste>{
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
    public int compareTo(Artiste autre){
        if(this.dateNaissance.equals(autre.dateNaissance) ){
            if(this.nom.equals(autre.nom)){
                return this.prenom.compareTo(autre.prenom);
            }else{
                return this.nom.compareTo(autre.nom);
            }
        }else{
            return this.dateNaissance.compareTo(autre.dateNaissance);
        }
    }

    @Override
    public String toString() {
        return "Artiste : " + prenom + " " + nom;
    }
}

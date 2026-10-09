public class Musee {
    private final String nom;

    // ---  Constructors
    public Musee(String nom) {
        this.nom = nom;
    }

    // --- Getters
    public String getNom(){
        return nom;
    }

    @Override
    public String toString() {
        return "Musee : " + nom ;
    }
}

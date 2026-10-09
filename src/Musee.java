public class Musee {
    private String nom;

    public Musee(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Musee : " + nom ;
    }
}

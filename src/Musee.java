public class Musee {
    private final String nom;
    private Adresse adresse;

    // --- Constructors
    public Musee(String nom,int numero, String rue, String codePostal, String ville) {
        this.nom = nom;
        this.adresse = new Adresse(numero, rue, codePostal, ville);
    }

    // --- Getters
    public String getNom(){
        return nom;
    }

    public void setNumero(int numero){
        adresse.setNumero(numero);
    }

    // --- Overrides
    @Override
    public String toString() {
        return "Musee : " + nom  + "Adresse: "+ adresse.toString();
    }
}

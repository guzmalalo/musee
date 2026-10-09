public class Adresse {
    private final int numero;
    private final String rue;
    private final String codePostal;
    private final String ville;

    // --- Constructors
    public Adresse(int numero, String rue, String codePostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // --- Getters
    public int getNumero() {
        return numero;
    }

    public String getRue() {
        return rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }


    // --- Overrides
    @Override
    public String toString() {
        return numero + ", Rue " + rue + ", " + ville + "," + codePostal;
    }
}

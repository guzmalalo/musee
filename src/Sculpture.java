public class Sculpture extends Oeuvre {
    private final int profondeur;
    private final String materiau;

    public Sculpture(String nom, int annee, float largeur, float hauteur, int profondeur, String materiau){
        super(nom, annee, largeur, hauteur);
        this.profondeur = profondeur;
        this.materiau = materiau;
    }

    int getProfondeur(){
        return profondeur;
    }

    String getMateriau(){
        return materiau;
    }

}

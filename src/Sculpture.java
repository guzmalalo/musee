public class Sculpture extends Oeuvre {
    private final int profondeur;
    private final String materiau;

    public Sculpture(String nom, int annee, float largeur, float hauteur, int profondeur, String materiau){
        super(nom, annee, largeur, hauteur);
        if(profondeur <=0 ){
            throw new IllegalArgumentException("La profondeur doit etre positive");
        }
        if(materiau.isEmpty()){
            throw  new IllegalArgumentException("Le materiau est vide");
        }


        this.profondeur = profondeur;
        this.materiau = materiau;
    }

    int getProfondeur(){
        return profondeur;
    }

    String getMateriau(){
        return materiau;
    }

    @Override
    public String toString(){
        return super.toString() + "- " + materiau + ", prof : " + profondeur;
    }


}

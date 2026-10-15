import java.time.LocalDate;

void main() {
    Musee m =  new Musee("Louvre", 1,"Rivoli", "75001", "Paris");

    m.ajouterSalle(0, "Récéption", 100.0f);
    m.ajouterSalle(1, "Salle Mollien", 150.0f);


    Artiste eugene = new Artiste("Delacroix", "Eugène", LocalDate.of(1798, 4, 26));
    Oeuvre liberte = new Oeuvre("La Liberté guidant le peuple", 1830, 3.25f, 2.60f);
    liberte.setArtiste(eugene);

    m.ajouterOeuvre("Salle Mollien", liberte);



    System.out.println(m);

}

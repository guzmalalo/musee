import java.time.LocalDate;

void main() {
    Musee m =  new Musee("Louvre", 1,"Rivoli", "75001", "Paris");
    Salle s = new Salle(1, "Salle Mollien", 150.0f);
    Artiste artiste = new Artiste("Delacroix", "Eugène", LocalDate.of(1798, 4, 26));
    Oeuvre o = new Oeuvre("La Liberté guidant le peuple", 1830, 3.25f, 2.60f);

    System.out.println(m);
    System.out.println(s);
    System.out.println(artiste);
    System.out.println(o);
}

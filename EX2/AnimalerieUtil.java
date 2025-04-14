import java.util.List;

public class AnimalerieUtil {
    
    public static void afficherAnimaux(List<? extends Animal> liste) {
        System.out.println("\n=== Affichage des animaux avec parler() ===");
        for (Animal animal : liste) {
            animal.parler();
        }
    }
    
    public static void ajouterChien(List<? super Chien> liste) {
        Chien nouveauChien = new Chien("Rex");
        liste.add(nouveauChien);
        System.out.println("\n=== Ajout d'un chien à la liste ===");
        System.out.println("Chien ajouté: " + nouveauChien);
    }
    
    public static void afficherTous(List<?> liste) {
        System.out.println("\n=== Affichage de tous les éléments avec toString() ===");
        for (Object obj : liste) {
            System.out.println(obj);
        }
    }
}

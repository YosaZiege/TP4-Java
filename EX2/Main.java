import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Chien> listeChiens = new ArrayList<>();
        List<Animal> listeAnimaux = new ArrayList<>();
        List<Object> listeObjets = new ArrayList<>();
        
        listeChiens.add(new Chien("Max"));
        listeChiens.add(new Chien("Rocky"));
        
        listeAnimaux.add(new Animal("Inconnu"));
        listeAnimaux.add(new Chien("Buddy"));
        listeAnimaux.add(new Chat("Felix"));
        
        listeObjets.add(new Object());
        listeObjets.add(new Animal("Toto"));
        listeObjets.add(new Chien("Rex"));
        listeObjets.add("Un simple String");
        
        System.out.println("====== TEST AVEC LISTE DE CHIENS ======");
        AnimalerieUtil.afficherAnimaux(listeChiens);
        AnimalerieUtil.ajouterChien(listeChiens);
        AnimalerieUtil.afficherTous(listeChiens);
        
        System.out.println("\n====== TEST AVEC LISTE D'ANIMAUX ======");
        AnimalerieUtil.afficherAnimaux(listeAnimaux);
        AnimalerieUtil.ajouterChien(listeAnimaux);
        AnimalerieUtil.afficherTous(listeAnimaux);
        
        System.out.println("\n====== TEST AVEC LISTE D'OBJETS ======");
        AnimalerieUtil.ajouterChien(listeObjets);
        AnimalerieUtil.afficherTous(listeObjets);
        
        System.out.println("\n====== COMMENTAIRES SUR LES RÉSULTATS ======");
        System.out.println("1. afficherAnimaux(List<? extends Animal> liste):");
        System.out.println("   - Fonctionne avec List<Chien> car Chien est une sous-classe d'Animal");
        System.out.println("   - Fonctionne avec List<Animal> car c'est exactement le type attendu");
        System.out.println("   - NE fonctionne PAS avec List<Object> car Object n'est pas une sous-classe d'Animal");
        
        System.out.println("\n2. ajouterChien(List<? super Chien> liste):");
        System.out.println("   - Fonctionne avec List<Chien> car c'est exactement le type attendu");
        System.out.println("   - Fonctionne avec List<Animal> car Animal est une superclasse de Chien");
        System.out.println("   - Fonctionne avec List<Object> car Object est une superclasse de Chien");
        
        System.out.println("\n3. afficherTous(List<?> liste):");
        System.out.println("   - Fonctionne avec n'importe quel type de liste, car <?> accepte n'importe quel type");
        System.out.println("   - Mais ne permet que d'utiliser les méthodes de Object sur les éléments");
    }
}

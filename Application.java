import java.util.List;
import java.util.Scanner;


// # TP4 - Généricité

// Realiser par RAHIOUI Youssef

// En conclusion, cet exercice m'a permis d'appliquer les concepts fondamentaux de la programmation orientée objet en Java, notamment la généricité avec l'interface IMetier<T>, l'implémentation des collections pour la gestion des données, et la création d'une application console interactive offrant les fonctionnalités CRUD (Create, Read, Update, Delete) sur les produits. La structure modulaire adoptée, séparant clairement l'interface des implémentations concrètes, favorise la maintenabilité et l'extensibilité du code, constituant ainsi une base solide pour d'éventuels développements futurs comme l'ajout de persistance des données ou d'une interface graphique plus élaborée.

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetierProduitImpl metierProduit = new MetierProduitImpl();
        
        // Ajouter quelques produits pour tester
        metierProduit.add(new Produit(1, "Ordinateur portable", "Dell", 999.99, "Ordinateur portable performant", 10));
        metierProduit.add(new Produit(2, "Smartphone", "Samsung", 799.99, "Smartphone haut de gamme", 15));
        metierProduit.add(new Produit(3, "Tablette", "Apple", 599.99, "Tablette tactile légère", 8));

        int choix = 0;
        while (choix != 5) {
            // Afficher le menu
            System.out.println("\n===== Menu =====");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par son id");
            System.out.println("3. Ajouter un nouveau produit dans la liste");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter ce programme");
            System.out.print("Votre choix: ");
            
            // Récupérer le choix de l'utilisateur
            choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne
            
            switch (choix) {
                case 1:
                    // Afficher tous les produits
                    List<Produit> produits = metierProduit.getAll();
                    if (produits.isEmpty()) {
                        System.out.println("Aucun produit disponible.");
                    } else {
                        System.out.println("Liste des produits:");
                        for (Produit p : produits) {
                            System.out.println(p);
                        }
                    }
                    break;
                
                case 2:
                    // Rechercher un produit par id
                    System.out.print("Entrez l'id du produit à rechercher: ");
                    long idRecherche = scanner.nextLong();
                    scanner.nextLine(); // Pour consommer la nouvelle ligne
                    
                    Produit produitTrouve = metierProduit.findById(idRecherche);
                    if (produitTrouve != null) {
                        System.out.println("Produit trouvé: " + produitTrouve);
                    } else {
                        System.out.println("Aucun produit trouvé avec l'id " + idRecherche);
                    }
                    break;
                
                case 3:
                    // Ajouter un nouveau produit
                    System.out.println("Ajout d'un nouveau produit:");
                    
                    System.out.print("Id: ");
                    long id = scanner.nextLong();
                    scanner.nextLine(); // Pour consommer la nouvelle ligne
                    
                    System.out.print("Nom: ");
                    String nom = scanner.nextLine();
                    
                    System.out.print("Marque: ");
                    String marque = scanner.nextLine();
                    
                    System.out.print("Prix: ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine(); // Pour consommer la nouvelle ligne
                    
                    System.out.print("Description: ");
                    String description = scanner.nextLine();
                    
                    System.out.print("Nombre en stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine(); // Pour consommer la nouvelle ligne
                    
                    Produit nouveauProduit = new Produit(id, nom, marque, prix, description, stock);
                    metierProduit.add(nouveauProduit);
                    System.out.println("Produit ajouté avec succès!");
                    break;
                
                case 4:
                    // Supprimer un produit par id
                    System.out.print("Entrez l'id du produit à supprimer: ");
                    long idSuppression = scanner.nextLong();
                    scanner.nextLine(); // Pour consommer la nouvelle ligne
                    
                    Produit produitASupprimer = metierProduit.findById(idSuppression);
                    if (produitASupprimer != null) {
                        metierProduit.delete(idSuppression);
                        System.out.println("Produit supprimé avec succès!");
                    } else {
                        System.out.println("Aucun produit trouvé avec l'id " + idSuppression);
                    }
                    break;
                
                case 5:
                    // Quitter le programme
                    System.out.println("Merci d'avoir utilisé notre application. Au revoir!");
                    break;
                
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
        
        scanner.close();
    }
}

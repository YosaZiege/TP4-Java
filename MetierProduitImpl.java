import java.util.ArrayList;
import java.util.List;

// This should be a class implementing the interface, not a class with the same name
public class MetierProduitImpl implements IMetier<Produit> {
    private List<Produit> produits;
    
    public MetierProduitImpl() {
        this.produits = new ArrayList<>();
    }
    
    @Override
    public void add(Produit produit) {
        produits.add(produit);
    }
    
    @Override
    public List<Produit> getAll() {
        return produits;
    }
    
    @Override
    public Produit findById(long id) {
        for (Produit p : produits) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
    @Override
    public void delete(long id) {
        Produit produitASupprimer = findById(id);
        if (produitASupprimer != null) {
            produits.remove(produitASupprimer);
        }
    }
}

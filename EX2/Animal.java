public class Animal {
    private String nom;
    
    public Animal(String nom) {
        this.nom = nom;
    }
    
    public void parler() {
        System.out.println("Je suis un animal");
    }
    
    @Override
    public String toString() {
        return "Animal [nom=" + nom + ", classe=" + this.getClass().getSimpleName() + "]";
    }
}

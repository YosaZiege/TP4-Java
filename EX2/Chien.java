public class Chien extends Animal {
    
    public Chien(String nom) {
        super(nom);
    }
    
    @Override
    public void parler() {
        System.out.println("Wouf !");
    }
    
    @Override
    public String toString() {
        return "Chien [" + super.toString() + "]";
    }
}

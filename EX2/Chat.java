public class Chat extends Animal {
    
    public Chat(String nom) {
        super(nom);
    }
    
    @Override
    public void parler() {
        System.out.println("Miaou !");
    }
    
    @Override
    public String toString() {
        return "Chat [" + super.toString() + "]";
    }
}

package rpg;
public class Enemy extends Personage {


    public Enemy(){
        
        this.setName("Argos");
        
    }

    
    public boolean estaVivo() {
        return this.getVida() > 0;
    }
}

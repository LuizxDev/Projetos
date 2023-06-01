package rpg;
public class Enemy extends Sistema {


    public Enemy(){
        
        this.setName("Argos");
        
    }

    
    public boolean estaVivo() {
        return this.getVida() > 0;
    }
}

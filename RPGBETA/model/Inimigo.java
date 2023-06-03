package RPGBETA.model;

public class Inimigo extends Personagens {

    public boolean estaVivo() {
        return this.getVida() > 0;
    }

}

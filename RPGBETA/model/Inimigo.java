package RPGBETA.model;

public class Inimigo extends Personagens {

    public boolean estaVivo() {
        return this.getVida() > 0;
    }

    public int ataque(Heroi heroi){
        heroi.setVida(getVida() - this.getDanoAtaque());
        return heroi.getVida();
    }

}

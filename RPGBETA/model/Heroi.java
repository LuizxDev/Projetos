package RPGBETA.model;

public class Heroi extends Personagens {


    public int usarPorcao(Heroi heroi){
        heroi.setVida(getVida() - 10);
        return heroi.getVida();
    }

    public int ataque(Inimigo inimigo){
        inimigo.setVida(getVida() - this.getDanoAtaque());
        return inimigo.getVida();
    }

    public boolean estaVivo() {
        return this.getVida() > 0;
    }

}

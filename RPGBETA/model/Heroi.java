package RPGBETA.model;

public class Heroi extends Personagens {

    public Heroi(String nome) {
        this.setNome(nome);
    }

    public int usarPorcao(Heroi heroi){
        heroi.setVida(getVida() - 10);
        return heroi.getVida();
    }

    public boolean estaVivo(Heroi heroi) {
        return heroi.getVida() > 0;
    }

}

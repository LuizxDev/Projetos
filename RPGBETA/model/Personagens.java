package RPGBETA.model;

public abstract class Personagens {

    private String nome;
    private int vida = 100; // padrao
    private int danoAtaque = 10; // padrao

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDanoAtaque() {
        return danoAtaque;
    }

}

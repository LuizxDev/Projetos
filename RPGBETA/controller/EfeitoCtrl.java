package RPGBETA.controller;

import java.util.Random;

import RPGBETA.model.Efeitos;

public class EfeitoCtrl {

    Random aleatorio = new Random();

    public String Ataque() {

        Efeitos ataque = new Efeitos();

        int indice = aleatorio.nextInt(ataque.efeitoAtaque.length);
        String efeitoAtaque = ataque.efeitoAtaque[indice];
        return efeitoAtaque;
    }

    public String Dano() {

        Efeitos dano = new Efeitos();

        int indice = aleatorio.nextInt(dano.efeitoDano.length);
        String efeitoDano = dano.efeitoDano[indice];
        return efeitoDano;
    }

    public String Porcao() {
        Efeitos frase = new Efeitos();
        return frase.porcao;
    }

}

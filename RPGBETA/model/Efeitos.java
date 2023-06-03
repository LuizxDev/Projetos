package RPGBETA.model;

public class Efeitos {

    public String[] efeitoDano = {
            "Um tremendo golpe do inimigo acerta seu personagem em \ncheio, causando uma dor lancinante, mas sua determinação se mantém inabalável.",

            "O inimigo avança com fúria, desferindo um ataque implacável contra seu \npersonagem, que consegue resistir com bravura, mostrando sua resistência \ninquebrantável.",

            "O inimigo investe com astúcia, mirando em uma fraqueza momentânea de seu \npersonagem. Embora o ataque o atinja, você permanece firme, pronto para revidar \ncom determinação." };

    public String[] efeitoAtaque = {
            "Com um movimento preciso e veloz, seu personagem desfere \num golpe poderoso, cortando o ar com fúria e acertando em cheio o inimigo, que é \nlançado para trás em uma explosão de impacto.",

            "Seu personagem canaliza sua energia interna e desencadeia um ataque devastador, \nemanando uma aura brilhante que envolve sua espada. O golpe resultante atinge o \nalvo com uma força avassaladora, deixando-o atordoado e desequilibrado.",

            "Com habilidade estratégica, seu personagem ataca de forma precisa e calculada, \nencontrando a fraqueza do inimigo. O golpe é rápido e letal, causando um dano \nsignificativo e deixando o oponente em desvantagem, sem saber como reagir." };

    public String porcao = "Após tomar a poção com coragem, seu personagem sente um poder revitalizante \npercorrer suas veias, renovando sua força e determinação.";

    public void setEfeitoAtaque(String[] efeitoAtaque) {
        this.efeitoAtaque = efeitoAtaque;
    }

    public String[] getEfeitoAtaque() {
        return efeitoAtaque;
    }

}

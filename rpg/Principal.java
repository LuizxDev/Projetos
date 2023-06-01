package rpg;
import javax.swing.JOptionPane;
import java.util.Random;
public class Principal extends Personage {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        

        Heroi heroi = new Heroi();
        Enemy inimigo = new Enemy();

        String[] efeitoDano = {"Um tremendo golpe do inimigo acerta seu personagem em \ncheio, causando uma dor lancinante, mas sua determinação se mantém inabalável.",

        "O inimigo avança com fúria, desferindo um ataque implacável contra seu \npersonagem, que consegue resistir com bravura, mostrando sua resistência \ninquebrantável.",

        "O inimigo investe com astúcia, mirando em uma fraqueza momentânea de seu \npersonagem. Embora o ataque o atinja, você permanece firme, pronto para revidar \ncom determinação."};

        String[] efeitoAtaque = {"Com um movimento preciso e veloz, seu personagem desfere \num golpe poderoso, cortando o ar com fúria e acertando em cheio o inimigo, que é \nlançado para trás em uma explosão de impacto.",

        "Seu personagem canaliza sua energia interna e desencadeia um ataque devastador, \nemanando uma aura brilhante que envolve sua espada. O golpe resultante atinge o \nalvo com uma força avassaladora, deixando-o atordoado e desequilibrado.",

        "Com habilidade estratégica, seu personagem ataca de forma precisa e calculada, \nencontrando a fraqueza do inimigo. O golpe é rápido e letal, causando um dano \nsignificativo e deixando o oponente em desvantagem, sem saber como reagir."};

        
     
        while (heroi.estaVivo() && inimigo.estaVivo()){

            
            String opcao = JOptionPane.showInputDialog("\n|Escolha uma ação| \n|1| Atacar \n  |2| Curar" +
            "\n|3| Sair do Jogo");

            int indiceDano = aleatorio.nextInt(efeitoDano.length);
        int indiceAtaque = aleatorio.nextInt(efeitoAtaque.length);

            if(opcao.equals("1")){

                inimigo.setVida(inimigo.getVida() - heroi.getDanoAtaque());
                JOptionPane.showMessageDialog(null, efeitoAtaque[indiceAtaque]);
                inimigo.status(inimigo.getVida(), inimigo.getName());
                

            }else if (opcao.equals("2")){
                heroi.usarPorçao();
                JOptionPane.showMessageDialog(null, "Após tomar a poção com coragem, seu personagem sente um poder revitalizante percorrer suas veias, renovando sua força e determinação.");
                heroi.status(heroi.getVida(), heroi.getName());

            }else if(opcao.equals("3")){
                JOptionPane.showMessageDialog(null,"Aperte em OK para sair do Jogo");
                break;
            }else{
                JOptionPane.showMessageDialog(null,"Acao invalida");
            }

            JOptionPane.showMessageDialog(null, efeitoDano[indiceDano]);

            heroi.setVida(heroi.getVida() - inimigo.getDanoAtaque());

            JOptionPane.showMessageDialog(null, "voce perdeu " + heroi.getDanoAtaque() + heart + "de vida");

            heroi.status(heroi.getVida(), heroi.getName());
            

            JOptionPane.showMessageDialog(null, "Rodada Finalizada");

        }




    }      

    

    }

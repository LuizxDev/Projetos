package rpg;
import javax.swing.JOptionPane;
public class Heroi extends Personage  {

    private final int porcao = 10;
    
    
    Enemy inimigo = new Enemy();
    
    public Heroi(){

        this.setName(JOptionPane.showInputDialog("Digite o nome do seu Heroi "));

        JOptionPane.showInternalMessageDialog(null, "Ola " + 
        this.getName() +  " Bem-vindo(a) ao mundo mágico e cheio de aventuras do nosso RPG! \nAqui, você encontrará um universo repleto de desafios, mistérios e heróis \ndestemidos como você. Prepare-se para embarcar em uma jornada épica, \nonde sua imaginação e estratégia serão suas maiores armas.");

        JOptionPane.showInternalMessageDialog(null,"Bem a sua frente apareceu um monstro ");


        this.setVida(100); //vida do heroi
        this.setDanoAtaque(10); //dano de ataque
          
    }


    

    public int usarPorçao(){

        this.setVida(this.getVida() + porcao);

        if (this.getVida() >= 100){
                this.setVida(100);
        }
        return this.getVida();     
    }


    public boolean estaVivo() {
        return this.getVida() > 0;
    }



}

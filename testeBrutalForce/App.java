package testeBrutalForce;
import java.util.Random;
public class App {
    Random random = new Random();

    private int pasword = 53;

    public void quebra(){
        
        int tentativa = 0;

        while (tentativa != pasword){
            tentativa = random.nextInt(101);
                System.out.println("tentativa: " + tentativa);
            
                if (tentativa == pasword){
                    System.out.println("A senha é: " + tentativa);
            }
        }
    }

    
}


package trabajo1grupal;
import java.util.Scanner;


public class Trabajo1Grupal {


    public static void main(String[] args) {
        Scanner tech = new Scanner(System.in);
        int Num1, Num2;
        double Division, Multiplicacion, Resta;
        
        System.out.println("Digite Num1");
        Num1 = tech.nextInt();
        System.out.println("Digite Num2");
        Num2 = tech.nextInt();
        
        Resta = Num1 - Num2;
        System.out.println("Resta: " + Resta);
        
         Division= Num1/Num2;
          System.out.println("División: "+Division);
          
          Multiplicacion = Num1 * Num2;
            System.out.println(" Multiplicacion : "+ Multiplicacion);
          
          
         
        
             
              
    }
    
}

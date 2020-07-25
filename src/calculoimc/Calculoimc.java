
package calculoimc;
import java.util.Scanner;

public class Calculoimc {

    public static void main(String[] args) {
        // TODO code application logic here
       double  peso;
       double  altura;
       
       
        Scanner leia = new Scanner (System.in);
        System.out.println("Qual é seu peso: ");
        peso = leia.nextDouble();
        System.out.println("Qual sua altura: ");
        altura = leia.nextDouble();
         
        double imc;
        imc = peso / (altura*altura);
        
        if (imc < 18){
            System.out.println("Abaixo do peso");
            
        }else if(imc >= 18.5 && imc <= 24.5){
            System.out.println("Normal");
        }else if(imc >= 24.5 && imc <= 30){
            System.out.println("Sobrepeso");
        }else if(imc >= 30 && imc <= 40){
            System.out.println("Obeso");
        }
        
        
    }
  
}

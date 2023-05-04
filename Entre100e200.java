import java.util.Scanner;

public class Entre100e200 {
    public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
       int numero = 0;

         System.out.println("Digite seu numero: ");
         numero = sc.nextInt();

          if(numero > 100 && numero < 200){
            System.out.println("Seu numero está entre 100 e 200!");
          } else if (numero < 100){
            System.out.println("Seu numero é menor que 100!");
          } else if (numero > 200) {
            System.out.println("Seu numero é maior que 200!");
          }
    
    }
}

import java.util.Scanner;
public class Dobro {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double n1 = 0, dobro = 0;

            System.out.println("Digite um numero: ");
            n1 = sc.nextDouble();
            dobro = n1 * 2;
                System.out.printf("O dobro do seu número é de: %.2f", dobro);
    }   
}

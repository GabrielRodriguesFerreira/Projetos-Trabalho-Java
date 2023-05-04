import java.util.Scanner;
public class Inverso {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int numero1, numero2, numero3;

            System.out.println("Digite o primeiro numero: ");
            numero1 = sc.nextInt();

            System.out.println("Digite o segundo numero: ");
            numero2 = sc.nextInt();

            System.out.println("Digite o terceiro numero: ");
            numero3 = sc.nextInt();

            System.out.println("Os numeros inversão é: " + numero3 + " " + numero2 + " " + numero1);

    }
}

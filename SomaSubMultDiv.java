import java.util.Scanner;
public class SomaSubMultDiv{
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        double n1 = 0, n2 = 0, soma = 0, sub = 0, multi = 0, div = 0;

                System.out.println("Digite o primeiro numero: ");
                n1 = sc.nextDouble();

                System.out.println("Digite o segundo numero: ");
                n2 = sc.nextDouble();
                    soma = n1 + n2;
                    sub = n1 - n2;
                    multi = n1 * n2;
                    div = n1/n2;
                        System.out.println("A soma dos números é de: " + soma + "\n" +
                        "A subtração dos números é de: " + sub + "\n" +
                        "A multiplicação dos números é de: " + multi + "\n" +
                        "A divisão dos números é de: " + div); 
    }
}
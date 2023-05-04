import java.util.Scanner;
public class MediaPares {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double n1 = 0, soma = 0, contas = 0, media = 0;

            do{
                System.out.println("Digite um número [0] para parar: ");
                n1 = sc.nextDouble();
                    if((n1 % 2) == 0){
                        soma += n1;
                        contas++;
                        System.out.println("A soma dos números pares por enquanto é de: " + soma);
                    }

            } while (n1 != 0);
                if (contas > 0){
                    media = soma / contas;
                    System.out.printf("A média dos números pares é de: %.2f", media);
                } else {
                    System.out.println("Números pares não identificados.");
                }

    }
}

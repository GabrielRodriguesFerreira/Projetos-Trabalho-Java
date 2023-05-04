import java.util.Scanner;
public class Dolar {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double dolar = 0, reais = 0, conv = 0;

            System.out.println("Digite o valor do dolar hoje: ");
            dolar = sc.nextDouble();

            System.out.println("Digite o valor para converter (em reais): ");
            reais = sc.nextDouble();

                conv = reais / dolar;
                    System.out.printf("Seu valor em dolar ficaria:  %.2f US$ ", conv);  
    }
}

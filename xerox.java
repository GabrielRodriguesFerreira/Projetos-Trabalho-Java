import java.util.Scanner;
public class xerox {
    public static void main (String [] agrs){
        Scanner sc = new Scanner(System.in);
        double custo100 = 0.25, custo101 = 0.20, valor = 0;
        int quantidade = 0;
            
            System.out.println("Quantas folhas deseja fazer xerox?");
            quantidade = sc.nextInt();

                if(quantidade < 100){
                    valor = quantidade * custo100;
                    System.out.printf("Você pagará: %.2f Reais", valor);
                } else if (quantidade > 100){
                    valor = quantidade * custo101;
                    System.out.printf("Você pagará: %.2f Reais", valor);
                }
    }
}

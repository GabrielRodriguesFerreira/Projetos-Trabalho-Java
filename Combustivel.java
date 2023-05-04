import java.util.Scanner;
public class Combustivel {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int Lcombus = 0;
        double distancia = 0, gastoM = 0;

            System.out.println("Quantos quilometro você dirigiu? ");
            distancia = sc.nextDouble();
            System.out.println("Agora diga quanto você gastou: ");
            Lcombus = sc.nextInt();
                gastoM = distancia/Lcombus;
                    System.out.printf("Seu consumo médio foi de %.2f Litros", gastoM);
    }         
}

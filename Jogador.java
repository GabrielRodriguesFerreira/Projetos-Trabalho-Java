import java.util.Scanner;

public class Jogador {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int idade = 0;

            System.out.println("Qual sua idade? ");
            idade = sc.nextInt();
                if(idade <= 13){
                    System.out.println("Você está na categoria INFANTIL!");
                } else if (idade > 13 || idade <= 17){
                    System.out.println("Você está na categoria JUVENIL!");
                } else if (idade > 17){
                    System.out.println("Você está na categoria SERNIO!");
                }
    }
}

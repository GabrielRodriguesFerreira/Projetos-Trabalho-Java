import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, quantidadePares = 0, quantidadeImpar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("digite um numero");
            n1 = sc.nextInt();
                if ((n1 % 2) == 0) {
                    System.out.println("Numeros pares: " + n1);
                    quantidadePares++;
                } else {
                    System.out.println("Numeros impares: " + n1);
                    quantidadeImpar++;
                }
        }
        System.out.println("Quantidade de números pares é de: " + quantidadePares);
        System.out.println("Quantidade de números impares é de: " + quantidadeImpar);
    }
}

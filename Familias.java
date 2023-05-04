import java.util.Scanner;

public class Familias {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        double salario, somaSalarios = 0, maiorSalario = 0;
        int numFilhos, numHabitantes = 10, numFilhosTotal = 0, numSalarioAteCem = 0;

        

        for (int i = 1; i <= numHabitantes; i++){
            System.out.println("Digite seu salario: ");
            salario = sc.nextDouble();

            if (salario >= 0) {
                System.out.println("Tem filhos? Quantos?");
                numFilhos = sc.nextInt();
                somaSalarios += salario;
                numFilhosTotal += numFilhos;

                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }

                if (salario <= 100) {
                    numSalarioAteCem++;
                }
            }
        }

        double mediaSalarios = somaSalarios / numHabitantes;
        double mediaFilhos = (double) numFilhosTotal / numHabitantes;
        double percentualSalarioAteCem = (double) numSalarioAteCem / numHabitantes * 100;
        
        System.out.println("Média do salário da população: " + mediaSalarios);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário: " + maiorSalario);
        System.out.println("Percentual de pessoas com salário até R$ 100,00: " + percentualSalarioAteCem + "%");
        
        sc.close();
    }
}

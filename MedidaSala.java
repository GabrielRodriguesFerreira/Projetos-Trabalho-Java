import java.util.Scanner;
public class MedidaSala {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double comprimento = 0, altura = 0, area = 0;

            System.out.println("Informe a altura: ");
            altura = sc.nextDouble();
            System.out.println("Informe o comprimento: ");
            comprimento = sc.nextDouble();
                area = comprimento * altura;
                    System.out.printf("Área de sua sala é de: %.2f m", area);
    }
}

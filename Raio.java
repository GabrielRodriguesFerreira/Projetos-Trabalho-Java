import java.util.Scanner;
public class Raio {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
           double raio;
           double area;
           String segue;

            do {
                System.out.println("Digite o raio do circulo [n] para sair");
                segue = sc.nextLine();

                    if (!segue.equalsIgnoreCase("n")){
                        raio = Double.parseDouble(segue);
                        area = Math.pow(raio, 2);
                            System.out.println("Área total é de: " + area);
                    }

            } while (!segue.equalsIgnoreCase("n"));
    }
}

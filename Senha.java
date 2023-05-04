import java.util.Scanner;
public class Senha {
    public static void main (String [] args){
        Scanner sc =  new Scanner (System.in);
        int senha = 1234, tentativas = 4;

            for (int i = 0; i <= tentativas; i++){
                System.out.println("Digite sua senha: ");
                int senhaUsu = sc.nextInt();
                    if(senhaUsu == senha){
                        System.out.println("SEJA MUITO BEM VINDO!!");
                        break;
                    } else {
                        System.out.println("SENHA INCORRETA!!!");
                        tentativas--;
                    }
            }
    }
}

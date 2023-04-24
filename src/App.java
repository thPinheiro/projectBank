
import java.util.Scanner;

import cadastroBank.contaBancaria; 
 
 class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        contaBancaria user1 = new contaBancaria();

        System.out.println("Digite o nome completo do titular: ");
        user1.setTitular(sc.nextLine());

        System.out.println("O número da conta: ");
        user1.setNumConta(sc.nextLine());

        System.out.println("O saldo da sua conta: ");
        user1.setSaldo(sc.nextDouble());

        System.out.println("\n\n-----CADASTRO DO USUARIO-----");
        System.out.println(user1.getTitular());
        System.out.println(user1.getNumConta());
        System.out.println(user1.getSaldo());



    }
}

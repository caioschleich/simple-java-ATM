import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = 0;

        //System.out.println("Olá! Pressione qualquer tecla seguida de 'Enter' para continuar ou 'S'+'Enter' para (S)air");
        //String comando = scanner.next();

        String comando = "C";

        System.out.println("Digite o número da sua agência: ");
        String agenciaCliente = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int contaCliente = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o valor do depósito inicial: ");
        double deposito = scanner.nextDouble();

        saldo = saldo + deposito;

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.printf("Sua agência é %s e sua conta %d %n", agenciaCliente, contaCliente);
        System.out.println("Seu saldo inicial é de R$ " + saldo + " e já está disponível para saque.");

    }
}
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nomeDoCliente = scanner.nextLine();

        System.out.print("Por favor, digite a agência: ");
        String agenciaDoCliente = scanner.nextLine();

        System.out.print("Por favor, digite o numero da conta: ");
        int numeroDaConta = scanner.nextInt();

        System.out.print("Por favor, digite seu saldo: ");
        double saldoDaConta = scanner.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaDoCliente + ", conta " + numeroDaConta + " e seu saldo " + saldoDaConta + " já está disponível para saque.");

        scanner.close();
    }
}

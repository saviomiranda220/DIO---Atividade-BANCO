import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o numero da conta: ");
    int Numero = sc.nextInt();
    System.out.println("Digite a agencia: ");
    String agencia = sc.next();
    String nomeCliente = (" MARIO ANDRADE ");
    double Saldo = 237.48;
    System.out.printf("Olá, " + nomeCliente + "obrigado por criar uma conta em nosso banco. ");
    System.out.printf("Sua agência é %s, conta %d, e seu saldo é %.2f. Já está disponível para saque.%n", agencia, Numero, Saldo);
    sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para nosso usuário
        //Obter pelo scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Por favor, insira o número da conta : ");
            int numero = scanner.nextInt();

            System.out.println("Por favor, insira o número da agência : ");
            String agencia = scanner.next();

            System.out.println("Inserir nome : ");
            String nomeCliente = scanner.nextLine();

            scanner.nextLine();

            System.out.println("Insira seu saldo : ");
            double saldo = scanner.nextDouble();


            System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é : " + agencia + ", conta : " + numero + ", e seu saldo : R$ " + saldo + " já está disponivel para saque.");
              
        }        
    }
}

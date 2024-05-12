import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in); 

    System.out.println("----------------------------------------");
    System.out.println("Olá, vamos criar sua conta nova! ");  
    
    System.out.println("----------------------------------------");
    System.out.println("Por favor, digite seu nome conpleto ? ");
    String nomeCliente = scanner.nextLine();

    System.out.println("----------------------------------------");
    System.out.println("Digite a agencia ?, exemplo: 546-2 ");
    String agencia = scanner.nextLine(); 

    System.out.println("----------------------------------------");
    System.out.println("Digite sua conta com 5 digitos ? ");
    int conta = scanner.nextInt();

    System.out.println("----------------------------------------");
    System.out.println("Quanto você quer depositar ? ");
    double saldo = scanner.nextDouble();           
            
    System.out.println("----------------------------------------");
            
    System.out.println("Olá " + nomeCliente + 
                        ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +
                        ", conta: " + conta + ", e seu saldo: " + saldo + " já está disponível para saque.");          

    System.out.println("----------------------------------------");
    
    }
}

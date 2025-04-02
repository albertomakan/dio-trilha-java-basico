import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    String nomeClienteInput;
    String agenciaInput;
    Integer numeroInput;
    Double saldoInput;


    public static void main(String[] args) throws Exception {
        App app = new App();
        app.criarContaBancaria();    
    }

    public void criarContaBancaria(){
        scanner = new Scanner(System.in);
         
        System.out.println("Por favor digite o nome do cliente que irá criar a conta: ");
        nomeClienteInput = scanner.nextLine().trim();

        System.out.println("Digite o número da Agência: ");
        agenciaInput = scanner.nextLine().trim();

        System.out.println("Digite o número da Conta: ");
        numeroInput = scanner.nextInt();

        System.out.println("Digite o saldo da Conta: ");
        saldoInput = scanner.nextDouble();

        System.out.println("Olá " + nomeClienteInput + "," + " obrigado por criar uma conta em nosso banco, sua agência é: "
        + agenciaInput + ", " + "conta " + numeroInput + " e seu saldo " + saldoInput+ " já está disponível para saque.");
    }
}

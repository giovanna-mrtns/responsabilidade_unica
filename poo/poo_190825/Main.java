import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("--- Criar sua conta ---");

        System.out.println("Crie um nome de usuário: ");
        String username = scanner.nextLine();

        System.out.println("Digite o seu e-mail: ");
        String email = scanner.nextLine();

        AccountService accountService = new AccountService();
        accountService.createAccount(username, email);

        scanner.close();
    }
}
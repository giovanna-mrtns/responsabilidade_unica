public class AccountService {
        
            private EmailConfirmation emailConfirmation = new EmailConfirmation();
            private AccountCreation accountCreation = new AccountCreation();

            public void createAccount(String username, String email) {

                System.out.println("Criando conta para " + username + "...");

                emailConfirmation.sendEmailConfirmation(email);
                accountCreation.logAccountCreation(username);

    }

}

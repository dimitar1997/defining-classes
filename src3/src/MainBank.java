import java.util.*;

public class MainBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        while (true){
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            if (command.equals("End")) break;
            BankAccount bankAccount;
            switch (command){
                case "Create":
                    bankAccount = new BankAccount();
                    bankAccounts.put(bankAccount.getId(), bankAccount);
                    System.out.println(String.format("Account ID%d created", bankAccount.getId()));
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);
                    bankAccount = bankAccounts.get(id);
                    if(bankAccount != null) {
                        bankAccount.deposit(amount);
                        System.out.println(String.format("Deposited %.0f to ID%d", amount, id));
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int id1 = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    bankAccount = bankAccounts.get(id1);
                    if(bankAccount != null) {
                        System.out.println(String.format("%.2f",bankAccount.getInterest(years)));
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }
        }
    }
}

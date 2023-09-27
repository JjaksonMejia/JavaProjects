//package encapsulamientoYAcceso.AccessorAndMutatorMethods.Bank;

public class CheckingAccount{
    private String name;
    private int balance;
    private String id;
  
    public CheckingAccount(String inputName, int inputBalance, String inputId){
      name = inputName;
      balance = inputBalance;
      id = inputId;
    }
  
    public int getBalance() {
      return balance;
    }
  
    public void setBalance(int newBalance) {
      balance = newBalance;
    }
  
    public void deposit(int amount) {
      if (amount > 0) {
          balance += amount;
          System.out.println("Depósito de $" + amount + " realizado con éxito.");
      } else {
          System.out.println("El monto del depósito debe ser mayor que cero.");
      }
    }

    public void withdraw(int amount) {
      if (amount > 0 && amount <= balance) {
          balance = balance - amount;
          System.out.println("Retiro de $" + amount + " realizado con éxito.");
      } else {
          System.out.println("No es posible realizar el retiro. Verifique el monto o el saldo de la cuenta.");
      }
    }
  }

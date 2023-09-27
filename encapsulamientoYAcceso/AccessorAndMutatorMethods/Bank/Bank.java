//package encapsulamientoYAcceso.AccessorAndMutatorMethods.Bank;

public class Bank{
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;
  
    public Bank(){
      accountOne = new CheckingAccount("Zeus", 100, "1");
      accountTwo = new CheckingAccount("Hades", 200, "2");
    }
  
    public static void main(String[] args){
      Bank bankOfGods = new Bank();
      System.out.println(bankOfGods.accountOne.getBalance());
      bankOfGods.accountOne.setBalance(5000);
      System.out.println(bankOfGods.accountOne.getBalance());

      // Realizar un depósito en accountOne
      bankOfGods.accountOne.deposit(500); // Depositar $500
      System.out.println("Nuevo saldo de accountOne después del depósito: " + bankOfGods.accountOne.getBalance());
      
      // Realizar un retiro en accountTwo
      bankOfGods.accountOne.withdraw(50); // Retirar $50
      System.out.println("Nuevo saldo de accountTwo después del retiro: " + bankOfGods.accountOne.getBalance());
    }
  }

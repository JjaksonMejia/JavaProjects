//package encapsulamientoYAcceso.bank2;
public class CheckingAccount {
    public String name;
    public int balance;
    public String id;

    public CheckingAccount(String inputName, int inputBalance, String inputId){
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }
    public void addFunds(int foundsToAdd){
        balance += foundsToAdd;
    }
    public void getInfo(){
        System.out.println("This checking account belongs to "+name+". It has "+balance + " dollars in it.");
    }
}

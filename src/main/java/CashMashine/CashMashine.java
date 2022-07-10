package CashMashine;

public class CashMashine {
    void setBank(Bank cash) {
        cashOperations = cash;
    }

    Bank cashOperations;

    void withdrawMoney(){
        cashOperations.withdrawMoney();
    }
    void addMoney(){
        cashOperations.addMoney();
    }
    void transferMoney(){
        cashOperations.transferMoney();
    }
}

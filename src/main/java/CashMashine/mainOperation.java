package CashMashine;

public class mainOperation {
    public static void main(String[] args){
    CashMashine cashMashine = new CashMashine();
    cashMashine.setBank(new dollar());
    cashMashine.withdrawMoney();

    cashMashine.setBank(new hryvna());
    cashMashine.addMoney();

    cashMashine.setBank(new euro());
    cashMashine.transferMoney();
    }
}

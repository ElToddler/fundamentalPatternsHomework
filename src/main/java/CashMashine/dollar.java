package CashMashine;

public class dollar implements Bank{
    currency currency = new currency();
    public void withdrawMoney() {
        System.out.print("Вы сняли ");
        currency.dollar();
    }


    public void addMoney() {
        System.out.print("Вы внесли ");
        currency.dollar();
    }


    public void transferMoney() {
        System.out.print("Вы перевели ");
        currency.dollar();
    }


}

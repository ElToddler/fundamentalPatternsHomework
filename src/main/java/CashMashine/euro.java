package CashMashine;

public class euro implements Bank{
    currency currency = new currency();
    public void withdrawMoney() {
        System.out.print("Вы сняли ");
        currency.euro();
    }


    public void addMoney() {
        System.out.print("Вы внесли ");
        currency.euro();
    }


    public void transferMoney() {
        System.out.print("Вы перевели ");
        currency.euro();
    }


}

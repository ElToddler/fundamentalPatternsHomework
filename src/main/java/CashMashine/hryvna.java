package CashMashine;

public class hryvna implements Bank{
    currency currency = new currency();
    public void withdrawMoney() {
        System.out.print("Вы сняли ");
        currency.hryvna();
    }

    public void addMoney() {
        System.out.print("Вы внесли ");
        currency.hryvna();
    }

    public void transferMoney() {
        System.out.print("Вы перевели ");
        currency.hryvna();
    }

}

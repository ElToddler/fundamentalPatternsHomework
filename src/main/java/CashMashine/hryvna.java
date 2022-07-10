package CashMashine;

public class hryvna implements Bank{
    public void withdrawMoney() {
        System.out.println("Вы сняли 1000 гривен");
    }

    public void addMoney() {
        System.out.println("Вы внесли 1000 гривен");
    }

    public void transferMoney() {
        System.out.println("Вы перевели 1000 гривен");
    }

}

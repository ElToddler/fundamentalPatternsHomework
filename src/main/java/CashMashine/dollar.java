package CashMashine;

public class dollar implements Bank{
    public void withdrawMoney() {
        System.out.println("Вы сняли 1000 долларов");
    }


    public void addMoney() {
        System.out.println("Вы внесли 1000 долларов");
    }


    public void transferMoney() {
        System.out.println("Вы перевели 1000 долларов");
    }


}

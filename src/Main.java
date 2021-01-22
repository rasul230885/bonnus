public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addBalance = 1200;
        balance += addBalance;
        if (addBalance > 1000) {
            balance += (int)(addBalance / 100);
        }
        System.out.println(balance);}
}

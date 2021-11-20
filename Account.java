public class Account {
    public int balanceAmount;
    public Account(){
        balanceAmount= 10000;
    }
    public synchronized void withdraw(int amount)throws InterruptedException{
        Thread.sleep(1000);
        balanceAmount = balanceAmount - amount;
        System.out.println(balanceAmount);
    }
}
class Mythread extends Thread{
    Account obj = null;
    Mythread (Account tobj){
        obj = tobj;
    }
    public void run(){
        try {
            obj.withdraw(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class Test{
    public static void main(String[] args) {
        Account a = new Account();
        Mythread ob1 = new Mythread(a);
        Mythread ob2 = new Mythread(a);
        ob1.start();
        ob2.start();
    }
}
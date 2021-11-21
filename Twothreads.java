public class Twothreads extends Thread{
    Twothreads(String tname){
        super(tname);
    }
    @Override
    public void run(){
        System.out.println(getName());
    }
}
class Test{
    public static void main(String[] args) {
        Twothreads obj1 = new Twothreads("Scooby");
        Twothreads obj2 = new Twothreads("Shaggy");
        obj1.start();
        obj2.start();
    }
}
public class Name_Age {
    public static void main(String[] args) throws AgeNotInRange{
        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            System.out.println("Name :: " + name);
            if (age < 18) {
                throw new AgeNotInRange("Age provided is not in desired range");
            }
            else if(age > 60){
                throw new AgeNotInRange("Age provided is not in desired range");
            }
            else{
                System.out.println("Age :: "+age);
            }
        }
        catch (AgeNotInRange ob){
            System.out.println(ob);
        }
    }

}
class AgeNotInRange extends Exception{
    public AgeNotInRange(String exp){
        super(exp);
    }
}
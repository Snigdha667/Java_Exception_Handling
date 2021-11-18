import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormatException_Handling {
    String stu_name;
    int marks_sub1;
    int marks_sub2;
    int marks_sub3;
    NumberFormatException_Handling(String stu_name, int marks_sub1, int marks_sub2, int marks_sub3) {
       this.stu_name = stu_name;
       this.marks_sub1 = marks_sub1;
       this.marks_sub2 = marks_sub2;
       this.marks_sub3 = marks_sub3;
    }
    NumberFormatException_Handling(){
        super();
    }
    Scanner s = new Scanner(System.in);
    public void error() throws NegativeValueException, ValuesOutOfRangeException {
        NumberFormatException_Handling obj1 = new NumberFormatException_Handling(s.next(), s.nextInt(), s.nextInt(), s.nextInt());
        NumberFormatException_Handling obj2 = new NumberFormatException_Handling(s.next(), s.nextInt(), s.nextInt(), s.nextInt());
        if (obj1.marks_sub1 < 0 || obj1.marks_sub2 < 0 || obj1.marks_sub3 < 0 || obj2.marks_sub1 < 0 ||
                obj2.marks_sub2 < 0 || obj2.marks_sub3 < 0) {
            throw new NegativeValueException("Input Is Negative (invalid)");
        }
        else if(obj1.marks_sub1 > 100 || obj1.marks_sub2 > 100 || obj1.marks_sub3 > 100
        || obj2.marks_sub1 > 100 || obj2.marks_sub2 > 100 || obj2.marks_sub3 > 100){
            throw new ValuesOutOfRangeException("Input is out of Range");
        }
        else {
            double avg1 = (obj1.marks_sub1 + obj1.marks_sub2 + obj1.marks_sub3) / 3;
            double avg2 = (obj2.marks_sub1 + obj2.marks_sub2 + obj2.marks_sub3) / 3;
            System.out.println("Average marks of Student 1 :: " + avg1);
            System.out.println("Average marks of Student 2 :: " + avg2);
        }
    }
    public void duplicate(){
        try{
            error();
        }
        catch (InputMismatchException | NegativeValueException | ValuesOutOfRangeException ex){
            System.out.println("Exception occurred :: " +ex);

        }
    }
    public static void main(String[] args) {
        NumberFormatException_Handling obj = new NumberFormatException_Handling();
        obj.duplicate();

    }

}
class NegativeValueException extends Exception{
    public NegativeValueException(String exp1){
        super(exp1);
    }
}
class ValuesOutOfRangeException extends Exception{
    public ValuesOutOfRangeException(String exp2){
        super(exp2);
    }
}
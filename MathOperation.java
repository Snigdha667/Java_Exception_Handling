import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            int sum = 0;
            double average = 0;
            for (int i = 0; i < args.length; i++) {
                sum += arr[i];
                average = sum / arr.length;
            }
            System.out.println("Sum is :: " + sum);
            System.out.println("Average is :: " + average);
        }
        catch (Exception obj){
            System.out.println("Exception Handled");
        }
    }

}
//Arithmetic Exception
//Number Format Exception
//Array Index Out Of Bound Exception and so on.......
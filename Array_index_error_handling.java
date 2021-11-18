import java.util.Scanner;

public class ArrayS {
    int arr[];
    int n;
    int index;
        ArrayS() {
            try {
                Scanner s = new Scanner(System.in);
                n = s.nextInt();
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(s.next());
                }
                index = s.nextInt();
            }
            catch (NumberFormatException ex1){
                System.out.println("NumberFormatException occurred");
            }
        }
        public void error()throws ArrayIndexOutOfBoundsException {
            if (index > n) {
                throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException occurred");
            }
            else{
                System.out.println(arr[index]);
            }
        }
        void errorHandling(){
            try{
                error();
            }catch (ArrayIndexOutOfBoundsException ex2){
                System.out.println("ArrayIndexOutOfBoundsException occurred");
            }
        }
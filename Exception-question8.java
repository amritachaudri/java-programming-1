import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
//Driver class
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n= sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>(n);
        int a;
        for(int i=1;i<=n;i++) {
            /* Custom exception when passed with the String value */
            try
            {
                a=sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Can only enter Integer values");
                break;
            }
            list.add(a);
        }
        for (Integer integer : list) {
            //printing the 2/3 of the passed values
            System.out.println((0.67)*integer + " ");
        }
    }
}

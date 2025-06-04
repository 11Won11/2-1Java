import java.util.*;
import java.lang.*;

public class Grain2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k;
        int grain = 0;
        System.out.print("Enter an integer value k (number of squares): ");
        k = sc.nextInt();
        grain = (int)Math.pow(2, k) - 1;
        System.out.println("The number of grains placed on the board is " + grain);
    }
}
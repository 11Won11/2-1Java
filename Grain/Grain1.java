import java.util.*;

public class Grain1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k, i = 1, j = 0;
        int grain = 0;
        System.out.print("Enter an integer value k (number of squares): ");
        k = sc.nextInt();
        while(j != k){
            grain += i;
            i *= 2;
            j++;
        }
        System.out.println("The number of grains placed on the board is " + grain);
    }
}

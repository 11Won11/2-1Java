import java.util.*;

public class Grain3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k;
        int grain = 0;
        System.out.print("Enter an integer value k (number of squares): ");
        k = sc.nextInt();
        if(k <= 0){
            grain = k;
        }
        else{
            grain = getTotalGrains(k, grain);
        }
        System.out.println("The number of grains placed on the board is " + grain);
    }
    public static int getTotalGrains(int k, int grains){
        if(k == 0){
            return grains;
        }
        long now = 1;
        for (int i = 1; i < k; i++) {
            now *= 2;
        }
        grains += now;
        return getTotalGrains(k - 1, grains);
    }
}

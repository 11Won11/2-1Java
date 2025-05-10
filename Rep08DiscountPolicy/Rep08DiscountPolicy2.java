import java.util.*;

public class Rep08DiscountPolicy2 extends Rep08DiscountPolicy1 {
    private int min, count;
    private double per, cost ,res;

    public static void main(String[] args){
        int min, count;
        double per, cost, res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the minimum: ");
        min = sc.nextInt();
        System.out.print("Enter the itemCost: ");
        cost = sc.nextDouble();
        System.out.print("Enter the discount percent: ");
        per = sc.nextDouble();
        System.out.print("Enter the item quantity: ");
        count = sc.nextInt();
        Rep08DiscountPolicy2 dis = new Rep08DiscountPolicy2(min, per);
        res = (count * cost) - dis.computeDiscount(count, cost);
        System.out.println("Res: " + res);
    }

    public Rep08DiscountPolicy2(int m, double p){
        min = m;
        per = p;
    }
    @Override
    public double computeDiscount(int count, double cost){
        if (count >= min){
            return count * cost * (per / 100.0);
        } 
        else{
            return 0.0;
        }
    }
}
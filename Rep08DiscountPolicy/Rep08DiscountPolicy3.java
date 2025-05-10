import java.util.*;

public class Rep08DiscountPolicy3 extends Rep08DiscountPolicy1 {
    private int n;

    public static void main(String[] args){
        int count, n;
        double cost, sale;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the itemCost: ");
        cost = sc.nextDouble();
        System.out.print("Enter the quantity: ");
        count = sc.nextInt();
        System.out.print("Enter the number N: ");
        n = sc.nextInt();
        Rep08DiscountPolicy3 dis = new Rep08DiscountPolicy3(n);
        sale = dis.computeDiscount(count, cost);
        System.out.println("[Result]");
        System.out.println("Total before discount: " + count * cost);
        System.out.println("Discount amount: " + sale);
        System.out.println("Final price: " + ((count * cost) - sale));
    }

    public Rep08DiscountPolicy3(int n) {
        this.n = n;
    }

    @Override
    public double computeDiscount(int count, double cost) {
        int free = count / n;
        return free * cost;
    }
}
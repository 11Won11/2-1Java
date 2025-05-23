import java.util.*;

public class Rep09vehicle1{
    private int cylinder;
    private double load_capacity;
    private double towing_capacity;
    public static void main(String[] args){
        int cylin;
        double load;
        double tow;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cylinders (1 ~ 12): ");
        cylin = sc.nextInt();
        System.out.print("Enter load capacity (1.0 ~ 10.0): ");
        load = sc.nextDouble();
        System.out.print("Enter towing capacity (1.0 ~ 20.0): ");
        tow = sc.nextDouble();
        Rep09vehicle1 vehicle = new Rep09vehicle1(cylin, load, tow);
        vehicle.printCar();
        System.out.println("Program ended.");
    }

    public Rep09vehicle1(int c, double l, double t){
        cylinder = c;
        load_capacity = l;
        towing_capacity = t;
    }

    public void printCar(){
        System.out.println();
        System.out.println("All values are vaild");
        System.out.println("Cylinders: " + cylinder);
        System.out.println("Load Capacity: " + load_capacity);
        System.out.println("Towing Capacity: " + towing_capacity);
    }
}

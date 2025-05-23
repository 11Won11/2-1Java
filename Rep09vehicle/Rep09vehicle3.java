import java.util.*;

public class Rep09vehicle3{
    private int cylinder;
    private double load_capacity;
    private double towing_capacity;
    public static void main(String[] args){
        int cylin = 0;
        double load = 0.0;
        double tow = 0.0;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter number of cylinders (1 ~ 12): ");
            cylin = sc.nextInt();
            System.out.print("Enter load capacity (1.0 ~ 10.0): ");
            load = sc.nextDouble();
            System.out.print("Enter towing capacity (1.0 ~ 20.0): ");
            tow = sc.nextDouble();
        }catch(Exception e){
            System.out.println("Invalid input format");
            System.out.println("Program ended.");
            System.exit(1);
        }
        Rep09vehicle3 vehicle = new Rep09vehicle3(cylin, load, tow);
        vehicle.printCar();
        System.out.println("Program ended.");
    }

    public Rep09vehicle3(int c, double l, double t){
        try{
            if(c > 12 || c < 1){
                throw new CylinderException("Invalid: Cylinders must be between 1 and 12.");
            }
        }catch(CylinderException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Program ended.");
            System.exit(1);
        }
        cylinder = c;
        try{
            if(l > 10.0 || l < 1.0){
                throw new  LoadException("Invalid: Load capacity must be between 1.0 and 10.0.");
            }
        }catch(LoadException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Program ended.");
            System.exit(1);
        }
        load_capacity = l;
        try{
            if(t > 20.0 || t < 1.0){
                throw new  TowingException("Invalid: Towing capacity must be between 1.0 and 20.0.");
            }
        }catch(TowingException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Program ended.");
            System.exit(1);
        }
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

class CylinderException extends Exception {
    public CylinderException(String m) {
        super(m);
    }
}

class LoadException extends Exception {
    public LoadException(String m) {
        super(m);
    }
}

class TowingException extends Exception {
    public TowingException(String m) {
        super(m);
    }
}
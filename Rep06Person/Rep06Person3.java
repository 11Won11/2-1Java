import java.util.*;

public class Rep06Person3 {
    private String name;
    private int age;

    public static void main(String[] args) {
        Rep06Person3 per = new Rep06Person3();
        String name;
        int age;
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for how many runs: ");
        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Input your name: ");
            name = sc.next();
            System.out.print("Input your age: ");
            age = sc.nextInt();
            per.setName(name);
            per.setAge(age);
            System.out.print("> Name: " + per.getName() + ", Age: " + per.getAge());
            per.checkAge();
        }
    }

    public Rep06Person3() {
        name = "0";
        age = 0;
    }

    public Rep06Person3(String n, int a) {
        name = n;
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public void setName(String first, String last) {
        name = first + " " + last;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Rep06Person3 createToddler() {
        return new Rep06Person3("A toddler", 2);
    }

    public static Rep06Person3 createPreschooler() {
        return new Rep06Person3("A preschooler", 5);
    }

    public static Rep06Person3 createAdolescent() {
        return new Rep06Person3("An adolescent", 9);
    }

    public static Rep06Person3 createTeenager() {
        return new Rep06Person3("A teenager", 15);
    }

    public void checkAge(){
        if (age < 0) {
            System.out.println("Impossible");
        } 
        else if (age <= 3) {
            System.out.println(", Age Category: " + "Toddler");
        } 
        else if (age <= 6) {
            System.out.println(", Age Category: " + "Preschooler");
        } 
        else if (age <= 12) {
            System.out.println(", Age Category: " + "Adolescent");
        } 
        else if (age <= 17) {
            System.out.println(", Age Category: " + "Teenager");
        } 
        else {
            System.out.println(", Age Category: " + "Adult");
        }
        System.out.println();
    }
}

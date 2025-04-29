import java.util.*;

public class Rep06Person2 {
    private String name;
    private int age;
    public static void main(String[] args){
        Rep06Person2 per = new Rep06Person2();
        String firstName;
        String lastName;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your first name: ");    
        firstName = sc.next();
        System.out.print("Input your last name: ");
        lastName = sc.next();
        System.out.print("Input your age: ");
        age = sc.nextInt();
        per.setName(firstName, lastName);
        per.setAge(age);
        System.out.println("Name: " + per.getName() + ", Age: " + per.getAge());
        System.out.println();
        System.out.println("[Create and display Toddler, Preschooler, Adolescent, and Teenager]");
        System.out.println();
        Rep06Person2 toddler = Rep06Person2.createToddler();
        Rep06Person2 preschooler = Rep06Person2.createPreschooler();
        Rep06Person2 adolescent = Rep06Person2.createAdolescent();
        Rep06Person2 teenager = Rep06Person2.createTeenager();
        System.out.println(toddler.getName() + ", Age is " + toddler.getAge());
        System.out.println(preschooler.getName() + ", Age is " + preschooler.getAge());
        System.out.println(adolescent.getName() + ", Age is " + adolescent.getAge());
        System.out.println(teenager.getName() + ", Age is " + teenager.getAge());
    }
    public Rep06Person2(){
        name = "0";
        age = 0;
    }
    public Rep06Person2(String n, int a){
        name = n;
        age = a;
    }
    public void setName(String n){
        name = n; 
    }
    public void setName(String first, String last){
        name = first + " " + last;
    }
    public void setAge(int a){
        age = a; 
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static Rep06Person2 createToddler(){
        return new Rep06Person2("A toddler", 2);
    }
    public static Rep06Person2 createPreschooler(){
        return new Rep06Person2("A preschooler", 5);
    }
    public static Rep06Person2 createAdolescent(){
        return new Rep06Person2("An adolescent", 9);
    }
    public static Rep06Person2 createTeenager(){
        return new Rep06Person2("A teenager", 15);
    }
}

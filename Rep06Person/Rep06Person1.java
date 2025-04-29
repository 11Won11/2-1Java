import java.util.*;

public class Rep06Person1 {
    private String name;
    private int age;
    public static void main(String[] args){
        Rep06Person1 per = new Rep06Person1();
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name: ");
        name = sc.nextLine();
        System.out.print("Input your age: ");
        age = sc.nextInt();
        per.setName(name);
        per.setAge(age);
        System.out.println("Name: " + per.getName() + ", Age: " + per.getAge());

    }
    public void setName(String n){
        name = n; 
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
}

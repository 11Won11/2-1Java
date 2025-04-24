import java.util.*;

public class Rep02Replace2{
    public static void main(String[] args){
        String line;
        char ch;
        String hate;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text.");
        line = sc.nextLine();
        for(int i = 0; i < line.length(); i++){
            ch = line.charAt(i);
            if(ch == 'h' || ch == 'H'){
                hate = line.substring(i, i+4);
                if(hate.toLowerCase().equals("hate")){
                    index = i;
                    break;
                }
            }
        }
        System.out.println("First occurrence of \"hate\" is at index: " + index);
        sc.close();
    }
}
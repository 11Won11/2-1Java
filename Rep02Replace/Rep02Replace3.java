import java.util.*;

public class Rep02Replace3{
    public static void main(String[] args){
        String line;
        char ch;
        String hate;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a line of text.");
            line = sc.nextLine();
            if(line.equals("quit")){
                break;
            }
            for(int i = 0; i < line.length(); i++){
                ch = line.charAt(i);
                if(ch == 'h' || ch == 'H'){
                    hate = line.substring(i, i+4);
                    if(hate.toLowerCase().equals("hate")){
                        line = line.replaceFirst(hate, "love");
                        i = line.length();
                    }
                }
            }
            System.out.println("I have rephrased that line to read:");
            System.out.println(line);
        }
        sc.close();
    }
}
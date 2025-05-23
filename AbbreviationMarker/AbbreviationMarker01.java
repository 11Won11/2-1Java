import java.util.*;
import java.io.*;

public class AbbreviationMarker01 {
    public static void main(String[] args){
        List<String> data = new ArrayList<>();
        List<String> word = new ArrayList<>();
        String fileName;
        int flag = 0;
        String[] abb = {"lol", "u", ":)", "iirc", "ttfn"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message file name: ");
        fileName = sc.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            for (String list : data) {
                String[] words = list.split(" ");
                StringBuilder modifiedLine = new StringBuilder();
                for (String w : words) {
                    String original = w;
                    String clean = w.replaceAll("[^a-zA-Z:)]", "");
                    String cleanLower = clean.toLowerCase();
                    boolean matched = false;
                    for (int i = 0; i < abb.length; i++) {
                        String abLower = abb[i].toLowerCase();

                        if (cleanLower.equals(abLower)) {
                            matched = true;
                            break;
                        }
                        flag = 0;
                        for (int j = 0; j < cleanLower.length(); j++) {
                            if (j >= abLower.length()) break;
                            if (cleanLower.charAt(j) != abLower.charAt(j)) {
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 0) {
                            matched = true;
                            break;
                        }
                    }
                    if (matched) {
                        modifiedLine.append("<").append(original).append("> ");
                    } else {
                        modifiedLine.append(original).append(" ");
                    }
                }
                String finalLine = modifiedLine.toString().trim();
                System.out.println(finalLine); 
                writer.write(finalLine);                  
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
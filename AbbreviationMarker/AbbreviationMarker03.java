import java.util.*;
import java.io.*;

public class AbbreviationMarker03{
    public static void main(String[] args){
        List<String> data = new ArrayList<>();
        List<String> resultLines = new ArrayList<>();
        List<String> abb = new ArrayList<>();
        String fileName, abbFile, outFile;
        int flag = 0, index = 0;;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter abbreviation file name: ");
        abbFile = sc.nextLine();
        System.out.print("Enter the message file name: ");
        fileName = sc.nextLine();
        System.out.print("Enter output file name: ");
        outFile = sc.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(abbFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                abb.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String list : data) {
            index++;
            String[] words = list.split(" ");
            StringBuilder modifiedLine = new StringBuilder();
            int abbCount = 0; 
            for (String w : words) {
                String original = w;
                String clean = w.replaceAll("[^a-zA-Z:)]", ""); 
                String cleanLower = clean.toLowerCase();
                boolean matched = false;
                for (String ab : abb) {
                    String abLower = ab.toLowerCase();
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
                    abbCount++;  
                } else {
                    modifiedLine.append(original).append(" ");
                }
            }
            String finalLine = modifiedLine.toString().trim();
            System.out.println(finalLine);
            System.out.println("Line " + index + ": " + abbCount + " abbreviation(s) found."); 
            resultLines.add(finalLine);
        }
        writeToFile(resultLines, outFile);
    }
    public static void writeToFile(List<String> lines, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
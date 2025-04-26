import java.util.*;

public class RelicGame02 {
    private int max;
    private int[] index = new int[7];
    private int[] saveData = new int[7];
    public static void main(String[] args){
        RelicGame02 game = new RelicGame02();
        int[] relicPower = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 7 relic powers: ");
        for(int i = 0; i < relicPower.length; i++){
            relicPower[i] = sc.nextInt();
            game.saveOriginalIndex(relicPower[i], i);
        }
        game.sortRelic(relicPower);
        System.out.println("Sorted relics (with original positions):");
        for(int i = 0; i < relicPower.length; i++){
            System.out.println(relicPower[i] + "(from " + game.getIndex(i) + ")");   
        }
    }
    public void maxRelic(int relicPower[], int count){
        max = 0;
        index[count] = 0;
        for(int i = count; i < relicPower.length; i++){
            if(max < relicPower[i]){
                max = relicPower[i];
                index[count] = i;
            }
        }
    }
    public void sortRelic(int relicPower[]){
        int temp;
        for(int i = 0; i < relicPower.length; i++){
            maxRelic(relicPower, i);
            temp = relicPower[i];
            relicPower[i] = relicPower[index[i]];
            relicPower[index[i]] = temp;
        }
        for(int i = 0; i < relicPower.length; i++){
            for(int j = 0; j < relicPower.length; j++){
                if(relicPower[i] == saveData[j]){
                    index[i] = j;
                    saveData[j] = -1;
                    break;
                }
            }
        }
    }
    public void saveOriginalIndex(int data, int i){
        saveData[i] = data;
    }
    public int getMax(){
        return max;
    }
    public int getIndex(int i){
        return index[i];
    }
}

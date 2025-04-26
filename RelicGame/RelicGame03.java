import java.util.*;

public class RelicGame03 {
    private int max;
    private int[] index = new int[7];
    private int[] saveData = new int[7];
    public static void main(String[] args){
        RelicGame03 game = new RelicGame03();
        int[] relicPower = new int[7];
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 7 relic powers: ");
        for(int i = 0; i < relicPower.length; i++){
            relicPower[i] = sc.nextInt();
            game.saveOriginalIndex(relicPower[i], i);
        }
        game.sortRelic(relicPower);
        System.out.print("Sorted relics: ");
        for(int i = 0; i < relicPower.length; i++){
            System.out.print(relicPower[i] + " ");   
        }
        System.out.println();
        System.out.print("Guess the original index of the strongest relic: ");
        index = sc.nextInt();
        if(game.findOriginalIndex(index)){
            System.out.println("Correct! You know the relics well.");
        }
        else{
            System.out.println("Incorrect. The strongest relic was originally at position " + game.getIndex(0) + ".");
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
    public boolean findOriginalIndex(int i){
        if(i == index[0]){
            return true;
        }
        return false;
    }
    public int getMax(){
        return max;
    }
    public int getIndex(int i){
        return index[i];
    }
}

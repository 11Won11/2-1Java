import java.util.*;

public class RelicGame01 {
    private int max;
    private int index;
    public static void main(String[] args){
        RelicGame01 game = new RelicGame01();
        int[] relicPower = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 7 relic powers: ");
        for(int i = 0; i < relicPower.length; i++){
            relicPower[i] = sc.nextInt();
        }
        game.maxRelic(relicPower);
        System.out.println("Strongest relic power: " + game.getMax());
        System.out.println("Original index: " + game.getIndex());
    }
    public void maxRelic(int relicPower[]){
        max = 0;
        index = 0;
        for(int i = 0; i < relicPower.length; i++){
            if(max < relicPower[i]){
                max = relicPower[i];
                index = i;
            }
        }
    }
    public int getMax(){
        return max;
    }
    public int getIndex(){
        return index;
    }
}

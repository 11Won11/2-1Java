import java.util.*;

public class BasketballGame1 {
    String team1Name, team2Name;
    int team1Score, team2Score;
    boolean gameFinished;
    public static void main(String[] args){
        BasketballGame1 game = new BasketballGame1("Cats", "Dogs");

        game.recordOnePoint("Cats");
        game.recordTwoPoint("Dogs");
        int catsScore = game.getScore("Cats");
        int dogsScore = game.getScore("Dogs");
        System.out.println("Cats score: " + catsScore);
        System.out.println("Dogs score: " + dogsScore);
        System.out.println("Leading team: " + game.getLeadingTeam());
        game.finishGame();
    }
    BasketballGame1(String team1, String team2){
        team1Name = team1;
        team2Name = team2;
        team1Score = 0;
        team2Score = 0;
        gameFinished = false;
    }
    public void recordOnePoint(String team){

    }
    public void recordTwoPoint(String team){

    }
    public void recordThreePoint(String team){

    }
    public void finishGame(){

    }
    public int getScore(String team){
        return 0;
    }
    public String getLeadingTeam(){
        return null;
    }
}

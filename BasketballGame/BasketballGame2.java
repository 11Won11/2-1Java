import java.util.*;

public class BasketballGame2 {
    String team1Name, team2Name;
    int team1Score, team2Score;
    boolean gameFinished;
    public static void main(String[] args){
        BasketballGame2 game = new BasketballGame2("Cats", "Dogs");

        game.recordOnePoint("Cats");
        game.recordTwoPoint("Dogs");
        game.recordThreePoint("Cats");
        int catsScore = game.getScore("Cats");
        int dogsScore = game.getScore("Dogs");
        System.out.println("Cats score: " + catsScore);
        System.out.println("Dogs score: " + dogsScore);
        System.out.println("Leading team: " + game.getLeadingTeam());
        game.finishGame();
        System.out.println("게임이 종료되어 점수를 추가할 수 없습니다.");
    }
    public BasketballGame2(String team1, String team2){
        //preconditions : team1,team2는 null이랑 공백이 아니여야함
        //postconditions : 팀이름이 설정되어 점수와 게임종료여부 초기화
        if(team1 == " " || team1 == null || team2 == " " || team2 == null){
            throw new IllegalArgumentException("팀 이름이 지정되지 않았습니다.");
        }
        team1Name = team1;
        team2Name = team2;
        team1Score = 0;
        team2Score = 0;
        gameFinished = false;
    }
    public void recordOnePoint(String team){
        //preconditions : team이름이 같아야 함
        //postconditions : 해당 팀 1점 증가
        if(team1Name.equals(team)){
            team1Score += 1;
        }
        if(team2Name.equals(team)){
            team2Score += 1;
        }
    }
    public void recordTwoPoint(String team){
        //preconditions : team이름이 같아야 함
        //postconditions : 해당 팀 1점 증가
        if(team1Name.equals(team)){
            team1Score += 2;
        }
        if(team2Name.equals(team)){
            team2Score += 2;
        }
    }
    public void recordThreePoint(String team){
        //preconditions : team이름이 같아야 함
        //postconditions : 해당 팀 1점 증가
        if(team1Name.equals(team)){
            team1Score += 3;
        }
        if(team2Name.equals(team)){
            team2Score += 3;
        }
    }
    public void finishGame(){
        //preconditions : X
        //postconditions : 게임종료 여부를 true로 반환한다.
        gameFinished = true;
    }
    public int getScore(String team){
        //preconditions : team이름이 같아야 함
        //postconditions : 해당 팀 점수 반환 아닐 시 -1
        if(team1Name.equals(team)){
            return team1Score;
        }
        if(team2Name.equals(team)){
            return team2Score;
        }
        return -1;
    }
    public String getLeadingTeam(){
        //preconditions : X
        //postconditions : 두 팀 중 더 높은 점수 가진 팀 반환
        if(team1Score > team2Score){
            return team1Name;
        }
        else if(team1Score == team2Score){
            return team1Name + " = " + team2Name;
        }
        else{
            return team2Name;
        }
    }
    private boolean isValidTeam(String team){
        //preconditions : X
        //postconditions : team이름이 같은지 확인 후 결과 반환
        if(team.equals(team1Name) || team.equals(team2Name)){
            return true; 
        }
        return false;
    }
}


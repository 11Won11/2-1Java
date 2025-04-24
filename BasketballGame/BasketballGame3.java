import java.util.*;

public class BasketballGame3 {
    String team1Name, team2Name;
    int team1Score, team2Score;
    boolean gameFinished;
    public static void main(String[] args){
        BasketballGame3 game = new BasketballGame3("Cats", "Dogs");
        System.out.println("경기가 시작되었습니다. : Cats vs Dogs");
        System.out.println("득점 입력 형식 : <팀> <점수> (예 : a 1 또는 b 2)");
        System.out.println("게임을 종료하려면 \'finish\'를 입력하세요. ");
        int count1 = 0, count2 = 0;
        String team;
        int score; 
        int index = 0;    
        Scanner sc = new Scanner(System.in);
        while(count1 < 4 || count2 < 4){
            System.out.print("Enter a score: ");
            team = sc.nextLine();
            if(team.equals("finish")){
                break;
            }
            for(int i = 0; i < team.length(); i++){
                if(team.charAt(i) == ' '){
                    index = i;
                    break;
                }
            }
            if(!team.contains(" ") || team.split(" ").length != 2){
                System.out.println("잘못된 입력 형식입니다. <팀> <점수> 형식으로 입력해주세요.");
                continue;
            }
            score = Integer.parseInt(team.substring(index+1));
            team = team.substring(0, index);
            
            if(!game.isValidTeam(team)){
                System.out.println("존재하지 않는 팀이름입니다.");
            }
            else if(score < 1 || score > 3){
                System.out.println("유효하지 않는 점수입니다. 1, 2, 또는 3만 허용됩니다.");
            }
            else{
                if(score == 1){
                    game.recordOnePoint(team);
                }
                else if(score == 2){
                    game.recordTwoPoint(team);
                }
                else{
                    game.recordThreePoint(team);
                }
                if(team.equals("a")){
                    count1++;
                }
                else{
                    count2++;
                }
                System.out.print("Cats " + game.getScore("a") + ", Dogs " + game.getScore("b") + "; ");
                System.out.println(game.getLeadingTeam() + "이(가) 우세합니다.");
            }
        }
        if(count1 == 4 && count2 == 4){
            System.out.println("각 팀이 4번씩 득점하여 게임을 자동 종료합니다.");
        }
        game.finishGame();
        System.out.println("게임 종료!");
        System.out.print("최종 결과 : Cats " + game.getScore("a") + ", Dogs " + game.getScore("b") + "; ");
        System.out.println(game.getLeadingTeam() + "이(가) 승리했습니다.");
    }
    public BasketballGame3(String team1, String team2){
        //preconditions : team1,team2는 null이랑 공백이 아니여야함
        //postconditions : 팀이름이 설정되어 점수와 게임종료여부 초기화
        if(team1 == null || team1.trim().equals("") || team2 == null || team2.trim().equals("")){
            throw new IllegalArgumentException("팀 이름이 지정되지 않았습니다.");
        }
        team1Name = team1;
        team2Name = team2;
        team1Score = 0;
        team2Score = 0;
        gameFinished = false;
    }
    public String getTeam1String(){
        //preconditions : X
        //postconditions : 팀이름 반환
        return team1Name;
    }
    public String getTeam2String(){
        //preconditions : X
        //postconditions : 팀이름 반환
        return team2Name;
    }
    public void recordOnePoint(String team){
        //preconditions : team이 a나 b여야 함
        //postconditions : 해당 팀 1점 증가
        if(team.equals("a")){
            team1Score += 1;
        }
        else if(team.equals("b")){
            team2Score += 1;
        }
    }
    public void recordTwoPoint(String team){
        //preconditions : team이 a나 b여야 함
        //postconditions : 해당 팀 2점 증가
        if(team.equals("a")){
            team1Score += 2;
        }
        else if(team.equals("b")){
            team2Score += 2;
        }
    }
    public void recordThreePoint(String team){
        //preconditions : team이 a나 b여야 함
        //postconditions : 해당 팀 3점 증가
        if(team.equals("a")){
            team1Score += 3;
        }
        else if(team.equals("b")){
            team2Score += 3;
        }
    }
    public void finishGame(){
        //preconditions : X
        //postconditions : 게임종료 여부를 true로 반환한다.
        gameFinished = true;
    }
    public int getScore(String team){
        //preconditions : team이 a나 b여야 함
        //postconditions : 해당 팀 점수 반환 아닐 시 -1
        if(team.equals("a")){
            return team1Score;
        }
        else if(team.equals("b")){
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
        //postconditions : team이름이 a나 b아니면 반환
        if(team.equals("a") || team.equals("b")){
            return true; 
        }
        return false;
    }
}
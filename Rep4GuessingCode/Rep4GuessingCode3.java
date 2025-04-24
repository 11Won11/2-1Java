import java.util.*;

public class Rep4GuessingCode3 {
    public static void main(String[] args){
        String secretCode = "53840";
        String num;
        int count = 0;
        Rep4GuessingCode3 test = new Rep4GuessingCode3();
        Scanner sc = new Scanner(System.in);
        System.out.println("비밀 코드 추측 게임에 오신 것을 환영합니다!");
        System.out.println("총 5번의 기회가 주어집니다.");
        while(count < 5){
            System.out.print("기회 "+ (count+1) +" - 5자리 숫자를 입력하세요 : ");
            num = sc.nextLine();
            if(test.checkString(num) && test.checkSize(num)){
                System.out.println("결과" + (count+1) +": 일치하는 자리 수 = " + test.checkCorrect(num, secretCode) + ", 합 = " + test.sumCorrect(num, secretCode));
                if(num.equals(secretCode)){
                    System.out.println("축하합니다! 정답을 맞추셨습니다.");
                    break;
                }
                count++;
            }
            else{
                System.out.println("오류: 5자리 숫자만 입력 가능합니다.");   
            }
        }
        System.out.println("게임 종료! 비밀 코드는 " + secretCode + "이었습니다.");
    }
    public boolean checkString(String num){
        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) >= '0' && num.charAt(i) <= '9'){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    } 

    public boolean checkSize(String num){
        if(num.length() != 5){
            return false;
        }
        else{
            return true;
        }
    }

    public int checkCorrect(String num, String secretCode){
        int count = 0;
        for(int i = 0; i < 5; i++){
            if(num.charAt(i) == secretCode.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public int sumCorrect(String num, String secretCode){
        int sumNum = 0;
        for(int i = 0; i < 5; i++){
            if(num.charAt(i) == secretCode.charAt(i)){
                sumNum += (int)secretCode.charAt(i) - 48;
            }
        }
        return sumNum;
    }
}
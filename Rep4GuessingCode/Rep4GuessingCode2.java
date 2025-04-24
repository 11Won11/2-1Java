import java.util.*;

public class Rep4GuessingCode2 {
    public static void main(String[] args){
        String secretCode = "53840";
        String num;
        Rep4GuessingCode2 test = new Rep4GuessingCode2();
        Scanner sc = new Scanner(System.in);
        System.out.println("비밀 코드 추측 게임에 오신 것을 환영합니다!");
        while(true){
            System.out.print("5자리 숫자를 입력하세요 : ");
            num = sc.nextLine();
            if(test.checkString(num) && test.checkSize(num)){
                break;
            }
            else{
                System.out.println("오류: 5자리 숫자만 입력 가능합니다.");   
            }
        }
        System.out.println("추측 결과: 일치하는 자리 수 = " + test.checkCorrect(num, secretCode) + ", 합 = " + test.sumCorrect(num, secretCode));
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
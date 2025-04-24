import java.util.*;

public class Rep4GuessingCode1 {
    public static void main(String[] args){
        String num;
        Rep4GuessingCode1 test = new Rep4GuessingCode1();
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
        System.out.println("입력한 숫자 : " + num);
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
}

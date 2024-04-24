package Oral_Test1;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Oral_Test1 {
    public static void main(String[] args) {
        String[] word ={"1. 유진씨는 일본인입니까?",
        				"2. 유진씨는 가수입니까?",
        				"3. 유진씨는 회사원입니까?",
        				"4. 유진씨의 핸드폰은 삼성입니까?",
        				"5. 지금 몇시?",
        				"6. 아이티 수업은 몇시간?",
        				"7. 집에서 센터까지 가깝습니까?",
        				"8. 일본어 수업을 몇시부터 몇시까지 입니까?",
        				"9. 오늘 날씨는 좋은가요?",
        				"10. 일본어 공부는 재밌습니까?",
        				"11. 일본인 친구가 많습니까?",
        				"12. 유진씨의 핸드폰은 낡았나요?",
        				"13. 아이티 선생님은 어떤 사람입니까?",
        				"14. 유진씨의 엄마는 어떤 사람입니까?",
        				"15. 내 가방은 무거워요. 유진씨의 가방은 어떤가요?"};
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usedWords = new ArrayList<>(); // 이미 사용된 단어들을 추적하기 위한 리스트
        
        for(int i=0; i<word.length; i++) {
            
            String randomWord;
            do {
                randomWord = word[rand.nextInt(word.length)]; // 랜덤으로 단어 선택
            } while (usedWords.contains(randomWord)); // 이미 사용된 단어인 경우 다시 선택
            
            usedWords.add(randomWord); // 사용된 단어 리스트에 추가 -> 이걸 위해 어레이리스트 사용
            System.out.print("다음 단어 : ");            
            System.out.println(randomWord); // 선택된 단어 출력
            scanner.nextLine(); // 사용자가 엔터를 누를 때까지 대기

        }
        System.out.println("모든 단어를 끝냈습니다.");
        scanner.close(); // 사용이 끝난 scanner 닫기
    }
}
package Lesson8;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lesson8_word {
    public static void main(String[] args) {
        String[] word ={"아메리카", "딸기", "언제","오렌지","칵테일","카타카나","골프",
                 "축구", "수박","스키","스노우보드","택시","테니스","어느 쪽","배(과일)",
                 "~의 중에서","버스","농구","바나나","맥주","포도","볼링","귤","복숭아",
                 "~보다","와인","개","계절","과일","겨율","고양이","~쪽/편","비행기","등산",
                 "배","소주","수영","탈 것","야구","가장/제일","봄","가을","여름"};
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
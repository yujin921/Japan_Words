package Lesson11;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lesson11 {
    public static void main(String[] args) {
        String[] word ={"설날", "생일","세일","어땠습니까?","발렌타인데이","호텔", "고등학교","여행",
        				"내일","지난주","즐겁다","비","어린이날","어제","주말","토요일","몇 월 며칠",
        				"여름 휴가", "휴일/휴가"};
        
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
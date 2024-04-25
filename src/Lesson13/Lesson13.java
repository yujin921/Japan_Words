package Lesson13;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        String[] word ={"게임", "밥", "이제부터","헬스장","그렇게 합시다","거기에서","조금","번화하다","선물",
        				"우선","서두르다","쇼핑","정말로","산책","숙제","식사","기대되다","역앞","운동하다",
        				"함께/같이","일찍","맑음","생일","바다","쉬다"};
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
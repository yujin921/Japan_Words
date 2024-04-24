package Lesson10;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        String[] word ={"2층", "저기","있습니다","(사물,식물이)있다","(사람,동물이)있다","부럽다","편의점","실례합니다만",
        				"화장실","어디","침대","원하다","아직","사이","책상","근처","학년","옆","공부 중","책장",
        				"서점","위","은행","앞","뒤","안","통행인","꽃","꽃집"};
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
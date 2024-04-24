package Lesson9;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        String[] word ={"한 개", "아이스티","감사합니다","몇 개", "얼마","어서오세요","우동","주먹밥",
        				"부탁합니다", "주세요","커피","콜라","이것으로","샐러드","그러면","~씩","저기요",
        				"도넛","햄버거","볼펜","뜨거운 커피","라면","손님","엔","전부해서","점원"};
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
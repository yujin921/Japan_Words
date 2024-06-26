package Lesson8;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lesson8_word {
    public static void main(String[] args) {
        String[] word ={"술", "목욕을 하다", "걸다", "하다","그러고 나서","풀장","자주/잘","레포트","노래하다","보다",
        				"돌아가다","이번 주말","일어나다","기다리다","읽다","오다","애인","사다","듣다","죽다","쓰다","타다",
        				"먹다","수영하다","필요하다","놀다","마시다","음악","일본 요리","들어가다","만들다","자르다","달리다",
        				"늦게","알다","찍다","자다","무엇","만나다","합쳐지다","가다","말하다"};
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
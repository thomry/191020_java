package java_main;

import java.util.Scanner;

public class MultiArrEx4 {

	public static void main(String[] args) {
		String[][] words = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<words.length; i++) {
			
			System.out.printf("Q%d. %s의 뜻은?(엔터를 누르고 정답을 입력해주세요)", i+1, words[i][0]);
			
			scanner.nextLine();
			String tmp = scanner.nextLine();
			
			
			
			if (tmp.equals(words[i][1])) {
				System.out.println("정답입니다.");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.", words[i][1]);
				System.out.println();
			}
			
			
			
			
		}
		scanner.close();

	}

}

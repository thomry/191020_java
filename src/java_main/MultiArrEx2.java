package java_main;

import java.util.*;

public class MultiArrEx2 {

	public static void main(String[] args) {
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		// 배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
		for (int i =0; i < SIZE; i++)
			for (int j = 0; j < SIZE; j++)
				bingo[i][j] = i*SIZE + j + 1;
		
		// 배열에 저장된 값 뒤섞기 (shuffle)
		for (int i = 0; i < SIZE; i++) {
			for (int j =0; j < SIZE; j++) {
				x = (int)(Math.random()*SIZE);
				y = (int)(Math.random()*SIZE);
				
				// bingo[i][j]와 임의로 선택된 bingo[x][y]를 바꾸기!
				int tmp = bingo[i][j];      // 변수 tmp에 bingo[i][j]저장
				bingo[i][j] = bingo [x][y]; // 바꾸기
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for (int i =0; i < SIZE; i++) {
				for (int j =0; j < SIZE; j++)
					System.out.printf("%2d", bingo[i][j]); //바뀐 빙고판 출력
				System.out.println(); // 줄바꿈
			}
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE*SIZE);
			String tmp = scanner.nextLine();    // 입력받은 내용을 변수 tmp에 저장
			num        = Integer.parseInt(tmp); // 입력받은 문자열을 숫자로 변환
			
			// 입력받은 값과 같은 값이 저장된 요소 찾아서 0을 저장
			outer:
				for(int i =0; i<SIZE; i++) {
					for(int j=0; j < SIZE; j++) {
						if (bingo[i][j]==num) {
							bingo[i][j] = 0;
							break outer; // 2중 반복문을 벗어나는 명령문
						}
					}
				}
			
		} while(num != 0);
		scanner.close();

	}

}
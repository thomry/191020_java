package classproj;

import java.util.*;
/*
 * Local : 국내에 거주하는 내국인
 * 1. 한국인
 * 2. 외국인
 * 		1) 주민등록번호 있는 사람
 *      2) 주민등록번호 없는 사람
 *      - 주민등록번호 xxxxxx-1xxxxxx ~ xxxxxx-4xxxxxx(한국인)
 *      - 주민등록번호 xxxxxx-7xxxxxx ~ xxxxxx-
 */

public class Local {
	
	// Field - 초기화
	String name;		// null
	int age;			// 0
	String sn; 			// 주민등록번호
	boolean isKorean;	// false
	
	Scanner scanner = new Scanner(System.in);
	
	// Method
	void setFields(String n, int a) {
		
		// 아래에 있는 setFields(String n, int a, String s)호출
		
		setFields(n, a, null);
		
		/*
		name = n;
		age = a;
		// sn = null;
		// isKorean = false;
		 * 
		 */
	}
	void setFields(String n, int a, String s) {
		name = n;
		age  = a;
		sn   = s;
		if (sn != null) {
			isKorean = sn.charAt(7) <= '4' ? true : false; // 4이하면 true이고 아니면 false이다.
		}
	}
	void output() {
		System.out.println("성명="+name);
		System.out.println("나이="+age);
		System.out.println("주민등록번호="+(sn == null ? "없음":sn));
		System.out.println(isKorean ? "한국인입니다.":"외국인입니다.");
	}
	
	void input() {
		// 입력받기
		System.out.print("성명입력 >>");
		name = scanner.nextLine();                      // 성명 +엔터처리
		System.out.print("나이입력 >>");
		age  = scanner.nextInt();                       // 나이처리+엔터남겨둠
		
		System.out.println("주민등록번호가 있습니까? (y/n) >>");
		char yesNo = scanner.next().charAt(0);          // yesNo 처리(엔터남겨둠)
		clearInputBuffer();                             // yesNo가 남겨둔 엔터처리
		if (yesNo == 'y' || yesNo == 'Y') {
			System.out.print("주민등록번호 >>");
			sn = scanner.nextLine();                    // sn+엔터처리
		}
		setFields(name,age,sn);                         // 명령안해주면 입력되기만해서 isKorean에서 계속해서 false값을 가짐
	}
	void clearInputBuffer() { //엔터처리
		scanner.nextLine();
	}

}

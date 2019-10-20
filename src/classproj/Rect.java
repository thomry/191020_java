package classproj;

/*
 * setFields[1,2] : 너비가 1, 높이가 2인 직사각형
 * setFields[1]   : 너비가 1, 높이가 1인 정사각형
 */

public class Rect {
	
	// Field
	int width;		  // 너비
	int height;		  // 높이
	boolean isSquare; // 정사각형:true, 직사각형 : false
	
	// Method
	void setFields(int a, int b) {
		width    = a;
		height   = b;
		isSquare = (a == b) ? true : false;
		
	}
	
	void setFields(int a) {
		setFields(a,a);
	}
	
	int area() {
		return width*height;
	}
	
	void output() {
		System.out.println("밑변이 "+width+"이고 높이가 "+height+"인 "+(isSquare ? "정사각형의":"직사각형의")+" 넓이는 "+area()+"입니다.");
	}

}

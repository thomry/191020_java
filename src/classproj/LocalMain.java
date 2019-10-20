package classproj;

public class LocalMain {

	public static void main(String[] args) {
		
		Local man1 = new Local();
		Local man2 = new Local();
		Local man3 = new Local();
		Local man4 = new Local();
		
		man1.setFields("alice", 20);
		man2.setFields("응우엔티엔", 21, "951212-6666111");
		man3.setFields("홍길동", 22, "961212-1234567");
		
		man1.output();
		man2.output();
		man3.output();
		
		man4.input();
		man4.output();

	}

}

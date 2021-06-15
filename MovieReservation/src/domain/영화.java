package domain;

import java.util.ArrayList;


public class 영화 {

	public static ArrayList<영화> 영화목록 = new ArrayList<>();
	String 제목;
	String 장르;
	int 영화번호;
	int 금액;
	
	
	
	public 영화() {}
	
	public 영화(String 제목, int 영화번호,int 금액) {
		this.제목 = 제목;
		
		this.영화번호 = 영화번호;
		this.금액 = 금액;
		
	}
	public void 영화1() {
		제목 = "ㅇㅇ";
		영화번호 = 11;
		금액 = 7000;
		
		영화 temp = new 영화(제목, 영화번호, 금액);
		영화.영화목록.add(temp);
		
		
	}
	public void 영화2() {
		제목 = "ㄴㄴ";
		영화번호 = 22;
		금액 = 8000;
		영화 temp = new 영화(제목, 영화번호, 금액);
		영화.영화목록.add(temp);
		
	}
	public void 영화3() {
		제목 = "ㅁㅁ";
		영화번호 = 33;
		금액 = 9000;
		영화 temp = new 영화(제목, 영화번호, 금액);
		영화.영화목록.add(temp);

	}


}

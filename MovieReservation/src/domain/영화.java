package domain;

public class 영화 {
	String 제목;
	String 장르;
	int 영화번호;
	int 금액;

	public 영화() {
	}

	public 영화(String 제목, int 영화번호, int 금액) {
		this.제목 = 제목;

		this.영화번호 = 영화번호;
		this.금액 = 금액;

	}

	public void 크루엘라() {
		제목 = "크루엘라";
		영화번호 = 11;
		금액 = 7000;

		영화 temp = new 영화(제목, 영화번호, 금액);
		list.영화목록.add(temp);

	}

	public void 컨저링3() {
		제목 = "컨저링3";
		영화번호 = 22;
		금액 = 8000;
		영화 temp = new 영화(제목, 영화번호, 금액);
		list.영화목록.add(temp);

	}

	public void 캐시트럭() {
		제목 = "캐시트럭";
		영화번호 = 33;
		금액 = 9000;
		영화 temp = new 영화(제목, 영화번호, 금액);
		list.영화목록.add(temp);

	}

}

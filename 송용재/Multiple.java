package practice;

public class Multiple {
	private int dan;

	public Multiple(int dan) {
		this.dan = dan;
	}
	
	public void showGugudan(int dan) {	// 구구단을 보여주는 함수
		for (int i = 1; i <= 9; i++) { 
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
	
	public int getNum1() {
		return dan;
	}

	public void setNum1(int dan) {
		this.dan = dan;
	}

}

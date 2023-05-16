package program2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ModelDTO {
	private static Scanner input = new Scanner(System.in);
	private static int gugu_dan;	 //구구단 '단'
	private String print;			 //프로그램 시작 출력을 알림
	private static int cal_result;   //계산기 연산 결과
	private int cal_n1, cal_n2;		 //계산기 입력 받는 숫자
	
	public ModelDTO() {				//생성자: 생성자는 제일 위에!
		this.gugu_dan = 0;
		this.cal_n1 = 0;
		this.cal_n2 = 0;
		this.cal_result = 0;
		
	}
	
	public int getCal_n1() {
		return cal_n1;
	}

	public void setCal_n1(int cal_n1) {
		this.cal_n1 = cal_n1;
	}

	public int getCal_n2() {
		return cal_n2;
	}

	public void setCal_n2(int cal_n2) {
		this.cal_n2 = cal_n2;
	}

	public static int getGugu_dan() {
		return gugu_dan;
	}

	public void setGugu_dan(int gugu_dan) {
		this.gugu_dan = gugu_dan;
	}
	
	static int getCal_result() {
		return cal_result;
	}

	public void setCal_result(int cal_result) {
		this.cal_result = cal_result;
	}
	
		
	public String getPrint() {
		
		System.out.println("[정상출력] " + print);
		
		Except.select_Ex(input,this.cal_n1,this.cal_n2);
		
		return print;

	}

	public void setPrint(String print) {
		this.print = print;
	}
	
	
	public static void cal_Operator(int cal_n1, int cal_n2) {		// 계산기 연산자 선택 함수
		
			String oper = "";
		
			System.out.println("연사자를 선택해주세요:");
			System.out.println("더하기: +, 뺴기: -, 곱하기: *, 나누기: /");
			oper = input.next();

			switch (oper) {
			case "+":
				cal_result = cal_n1 + cal_n2;
				break;
			case "-":
				cal_result = cal_n1 - cal_n2;
				break;
			case "*":
				cal_result = cal_n1 * cal_n2;
				break;
			case "/":
				cal_result = cal_n1 / cal_n2;
				break;
			default:
				System.out.println("잘못된 연사자가 입력되었습니다! ");
				cal_Operator(cal_n1, cal_n2);
			}

		}
	
}


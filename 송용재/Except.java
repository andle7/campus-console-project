package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {
	Scanner sc = new Scanner(System.in);
	
	public void gugu_MisExcept() {
		int num1 = 0;
		try {
			num1 = sc.nextInt(); // 입력받은 숫자를 num1 변수에 저장한다.
			Multiple mul = new Multiple(num1);
			if ((num1 > 999) || (num1 < 1)) // 입력받은 숫자가 조건의 범위를 만족하지 않을경우 안내 메시지 출력
				System.out.println("1 ~ 999 사이의 숫자를 입력해주세요 ");
			else {
				mul.showGugudan(num1);
			}
		} catch (InputMismatchException e) {
			// 숫자가 아닌 문자를 입력할 경우, 에러메시지 출력
			System.out.println("숫자가 아닙니다.");
		}
	}
	
	public void calNum_MisExcept() {
		double cNum1 = 0;
		double cNum2 = 0;			
		
		try {
			cNum1 = sc.nextDouble();
			cNum2 = sc.nextDouble();			
		} catch (InputMismatchException e) {
			// 숫자가 아닌 문자를 입력할 경우, 에러메시지 출력
			System.out.println("숫자를 입력해주세요.");
		}
		Calculation cal = new Calculation(cNum1, cNum2);
		
		char op;
		System.out.println("하고자 하는 연산을 입력해주세요(+, -, *, /) : ");
		op = sc.next().charAt(0); // 문자를 저장하는 것은 없어서 라인을 저장한 후 첫번째 문자를 저장
		
		switch (op) {
		case '+':
			cal.calPlus(cNum1, cNum2);
			break;
		case '-':
			cal.calMinus(cNum1, cNum2);
			break;
		case '*':
			cal.calMulti(cNum1, cNum2);
			break;
		case '/':
			cal.calDivide(cNum1, cNum2);
			break;
		default:
			System.out.println("지원하지 않는 연산입니다.");
			break;
		}
		
	}
}

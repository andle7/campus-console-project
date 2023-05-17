package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

//패키지 하위 파일 임포트 
import practice.Calculation;
import practice.Multiple;
import practice.View;
import practice.Except;

public class Combine {

	public static void main(String[] args) {
		View view = new View();	// 메뉴 객체 선언
		int input = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			view.menu();
			input = sc.nextInt();
			switch (input) {
			case 1:
				view.gugudan();	// 구구단 기능 실행
				break;
			case 2:
				view.calculation();	// 계산기 기능 실행
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("지원하는 기능이 없습니다. 숫자를 다시 입력해주세요.");
			}

		} // while문 종료

	}

}

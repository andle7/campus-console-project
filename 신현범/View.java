package program2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {

	public static void Menu() {				// 메뉴 뷰
		System.out.println("======<메 뉴>======");
		System.out.println("1번을 누르면 계산기 입니다.");
		System.out.println("2번을 누르면 구구단입니다.");
		System.out.println("3번을 누르면 프로그램을 종료 합니다.");
		System.out.println("================");
	}
	
	public static void cal_View(Scanner input, int cal_n1, int cal_n2) { 		// 계산 출력 뷰
	
		input = new Scanner(System.in);
		
		ModelDTO.cal_Operator(Except.cal_n1_Input_Ex(input, cal_n1)
							 ,Except.cal_n2_Input_Ex(input, cal_n2));
		
		System.out.println("계산결과: " + ModelDTO.getCal_result());

	}
		
		
	public static void gugu_View(int dan) {
		for (int i = 1; i < dan + 1; i++) {
			
			for (int j = 1; j < 10; j++) {
				
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
	
}

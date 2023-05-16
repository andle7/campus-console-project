package program2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {
	
	public static void select_Ex(Scanner input, int cal_n1, int cal_n2) {   // selectSwitch 예외처리 함수
		while (true) {

			try {
				Controller.selectSwitch(input, cal_n1, cal_n2);

			} catch (InputMismatchException e) {
				System.out.println("잘못된 문자를 입력했습니다!!!");
			}

		}
	}
	
	public static void gugu_Ex(Scanner input, int dan) {		// 구구단 예외처리 함수
		while (true) {
			try {
				dan = input.nextInt();
				if(dan>999 || dan<1) {
					System.out.println("1 ~ 999까지의 정수 입력만 유효");
				}
				else {
					
					View.gugu_View(dan);		// 구구단 뷰 호출
					
					break;
				}
			}
			
			catch (InputMismatchException e) { //Exception e, InputMismatchException e, IOException e
				input = new Scanner(System.in);
				System.out.println("예외발생! 잘못된 입력");
				System.out.println("1 ~ 999까지의 정수 입력만 유효");
			}

		}
	}

	public static int cal_n1_Input_Ex(Scanner input, int cal_n1) {		// 계산기 첫번째 입력 예외처리
			
		while (true) {
			try {
				
				System.out.println("첫 번쨰 숫자를 입력해주세요:");
				cal_n1 = input.nextInt();

				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 문자가 입력되었습니다! 정수를 입력해주세요!");
				System.out.println();
				input = new Scanner(System.in);
			}

		}
		
		return cal_n1;
	}

	public static int cal_n2_Input_Ex(Scanner input, int cal_n2) {		// 계산기 두번째 입력 예외처리
		
		while (true) {
			try {

				System.out.println("두 번째 숫자를 입력해주세요:");
				cal_n2 = input.nextInt();

				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 문자가 입력되었습니다! 정수를 입력해주세요!");
				System.out.println();
				input = new Scanner(System.in);
			}

		}
		
		return cal_n2;
	}
	
	
	
}

package program2;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) {
		
		ModelDTO guguObject = new ModelDTO();
		guguObject.setPrint("완료");
		System.out.println(guguObject.getPrint());
	
	}
	
	public static void selectSwitch(Scanner input,int cal_n1, int cal_n2){		// 스위치 관리 함수: 계속해서 프로그램이 종료 될 때까지 메뉴를 무한 호출
		View.Menu();
		
		int n = 0;
		
		while(true) {		// 무한 반복
			input = new Scanner(System.in);
			n = input.nextInt();
			
			switch(n) {
		
				case 1:		// 숫자 1번을 입력하면 계산기
					System.out.println("=====<계산기>=====");
					System.out.println("※숫자 2개를 입력해야합니다.");
					View.cal_View(input, cal_n1, cal_n2);
					View.Menu();
					break;
				case 2:		// 숫자 2번을 입력하면 구구단
					System.out.println("=====<구구단>======");
					System.out.println("1 ~ 999까지의 숫자 입력해주세요");
					Except.gugu_Ex(input, ModelDTO.getGugu_dan());
					View.Menu();
					break;
				case 3:		// 숫자 3번을 입력하면 프로그램 정상 종료
					input.close();
					System.out.println("프로그램을 정상적으로 종료!");
					System.exit(0);			// 프로그램정상 종료
				default:		// 잘못된  입력시 작동
					System.out.println("잘못된 문자를 입력하셨습니다.");
					selectSwitch(input,cal_n1,cal_n2);
		
			}
		}
	
	}
}

package practice;

import practice.Except;

import java.util.Scanner;

import practice.Calculation;

public class View {
	Except excep = new Except();
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("====================================");
		System.out.println("1 : 구구단, 2 : 계산기, 3 : 프로그램 종료");
		System.out.println("====================================");
		System.out.print("번호를 입력하세요 : ");
	}
	
	public void gugudan() {	// 구구단 기능 실행
		System.out.print("1 ~ 999 사이의 숫자를 입력해주세요 :  ");
		excep.gugu_MisExcept();
	}
	
	public void calculation() {
		System.out.println("숫자 2개를 입력해주세요 ");
		
		excep.calNum_MisExcept();
		
		
		
		
	}// calculation 끝

}

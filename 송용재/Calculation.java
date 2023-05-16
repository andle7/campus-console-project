package practice;

public class Calculation {
	private double num1=0;
	private double num2=0;
	
	public Calculation(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	
	public void calPlus(double num1, double num2) {
		double res=0;
		res= num1 + num2;
		System.out.println(this.num1 + " + " + this.num2 + " = " + res);
	}
	
	public void calMinus(double num1, double num2) {
		double res=0;
		res=this.num1 - this.num2;
		System.out.println(this.num1 + " - " + this.num2 + " = " + res);
	}
	
	public void calMulti(double num1, double num2) {
		double res=0;
		res=this.num1 * this.num2;
		System.out.println(this.num1 + " * " + this.num2 + " = " + res);
	}
	
	public void calDivide(double num1, double num2) {
		double res=0;
		if(this.num2 == '0') {
			System.out.println("나누는 숫자는 0이 될 수 없습니다.");
		}	else {
			res=this.num1 / this.num2;
			System.out.println(this.num1 + " / " + this.num2 + " = " + res);
		}
	}

}

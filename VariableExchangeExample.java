package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		System.out.println("x의 값은 " + x + " y의 값은 " + y);
		
		//변수 교환하기
		int temp = x; // temp 변수에  x = 3 을 저장
		x = y;  	  // 변수 x 에  y = 5 를 저장
		y = temp;     // 변수 y 에 x = 3 을 저장
		System.out.println("x의 값은 " + x + " y의 값은 " + y);

	}

}

package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		System.out.println("x�� ���� " + x + " y�� ���� " + y);
		
		//���� ��ȯ�ϱ�
		int temp = x; // temp ������  x = 3 �� ����
		x = y;  	  // ���� x ��  y = 5 �� ����
		y = temp;     // ���� y �� x = 3 �� ����
		System.out.println("x�� ���� " + x + " y�� ���� " + y);

	}

}

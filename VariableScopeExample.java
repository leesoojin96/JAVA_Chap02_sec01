package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1-10;
		} 
/* v2가 if문 범위 안에서 선언되어있기때문에 if문 안에서 사용되어야한다. -> 지역(로컬)변수
int v3 = v1 + v2 + 5; -> 범위 밖이기때문에 컴파일 에러가 발생한다. */

	}

}

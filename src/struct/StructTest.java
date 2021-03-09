package struct;

public class StructTest {
	//아래 매서드를 완성시켜주세요.
	//StructEx 타입 자료를 입력받아 4개의 변수를 
	//전부 콘솔창에 찍어 줍니다.

	public static void getStatus(StructEx ac) {
	System.out.println("아이디 :" + ac.id);
	System.out.println("체력 :" + ac.hp);
	System.out.println("레벨 :" + ac.level);
	System.out.println("공격력 :" + ac.atk);
	}	
	public static void main(String[] args) {
		StructEx W1 = new StructEx();
		//W1 내부 변수에 임의의 값을 부여해주세요.
		W1.atk = 3;
		W1.hp = 20;
		W1.level = 1;
		W1.id = "eod1";
		getStatus(W1);
		

	}

}



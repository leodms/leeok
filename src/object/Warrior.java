package object;

public class Warrior {
	//전사가 사용할 스탯을 적어 주세요.
	//체력
	//공격력
	//아이디
	public int level;
	public int hp;
	public int atk;
	public String id;
	
	
	//생성자 정의
	
	public Warrior(String userId) {
		System.out.println("전사 아이디 생성중입니다...");
		
	}
	public void getStatus( ) {
		System.out.println("아이디:" + id);
		System.out.println("아이디:" + level);
		System.out.println("아이디:" + hp);
		System.out.println("아이디:" + atk);
	}

	public void huntMonster() {
		System.out.println("사냥을 시작합니다.");
		hp -= 3;
		level += 1;

	}

}

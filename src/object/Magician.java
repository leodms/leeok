package object;

public class Magician {
	public int level;
	public int def;
	public int mana;
	public int heal;
	public String id;
	
	
	
	
		
	
		
		public Magician(String userID) {
			StructEx W1 = new StructEx();
			W1.def = 3;
			W1.hp = 20;
			W1.level = 1;
			W1.heal = 10;
			W1.id = userID;
		public void getStatus() {
			System.out.println("아이디 :" + ac.id);
			System.out.println("체력 :" + ac.def);
			System.out.println("레벨 :" + ac.level);
			System.out.println("마나 :" + ac.mana);
			
		}
		public void huntMonster() {
			System.out.println("사냥을 시작합니다.");
			hp -= 3;
			level += 1;
		public void heal() {
			hp = 20;
		}
		}

	}

}

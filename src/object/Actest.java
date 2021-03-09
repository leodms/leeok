package object;

public class Actest {

	public static void main(String[] args) {
		Warrior W1 = new Warrior( "전사");
//		W1.level = 1;
//		W1.id = "전사1";
//		W1.hp =20;
//		W1.atk =3;
		W1.getStatus();
		W1.huntMonster();
		W1.getStatus();
		Magician m1 = new Magician("마법사");
		m1.huntMonster();
		m1.getStatus();
		m1.meditation();
		m1.getStatus();
		// TODO Auto-generated method stub

	}

}

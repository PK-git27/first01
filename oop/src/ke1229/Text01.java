package ke1229;

public class Text01 {
	public static void main(String[] args) {
		
		Animal a=new Animal();//�����޲����Ĺ��캯��
		a.setname("��ʿ��");
		a.setweight(50);
		a.showInfo();
		//
		Animal b=new Animal("�˸�",40);
		b.showInfo();
	}
}

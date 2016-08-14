package m7_d29;

final class Card{
	String kind;
	int num;
	
	Card(){
		this("SPADE",1);
	}
	
	Card(String kind,int num){
		this.kind=kind;
		this.num=num;
	}
	
	public String toString(){
		return kind+" : " +num;
	}
}

public class ClassEx1 {

	public static void main(String[] args){
		Card c=new Card("HEART",3);
		Card ca=null;
		try {
			ca = Card.class.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Class cObj= c.getClass();
		
		System.out.println(c);
		System.out.println(ca);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
		
		test();
	}
	public static void test(){
		int ret1=1;
		System.out.println(ret1);
	}
}



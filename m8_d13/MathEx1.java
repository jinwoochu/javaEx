package m8_d13;


public class MathEx1 {
	public static void main(String[] args){
		double val = 90.7552;
		System.out.println("round("+ val +")= "+Math.round(val)); //�ݿø�
		
		val*=100;
		System.out.println("round("+ val +")= "+Math.round(val)); //�ݿø�
		
		System.out.println(Math.round(val)/100);
		System.out.println(Math.round(val)/100.0);
		
	}
}

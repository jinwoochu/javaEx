package m8_d13;


public class MathEx1 {
	public static void main(String[] args){
		double val = 90.7552;
		System.out.println("round("+ val +")= "+Math.round(val)); //반올림
		
		val*=100;
		System.out.println("round("+ val +")= "+Math.round(val)); //반올림
		
		System.out.println(Math.round(val)/100);
		System.out.println(Math.round(val)/100.0);
		
	}
}

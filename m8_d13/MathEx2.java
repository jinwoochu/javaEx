package m8_d13;

public class MathEx2 {
	public static void main(String[] args){
		int i=Integer.MIN_VALUE;
		
		System.out.println("i = "+i);
		System.out.println("-i = "+(-i)); //양수로 바뀌었지만 양수의 최고범위를 넘어가서
		//오버플로우가 발생한것이다.
		
		try {
			System.out.printf("negateExact(%d)=%d\n", 10, Math.negateExact(10));
			//negateExact는  부호변환 메소드이다. 
			System.out.printf("negateExact(%d)=%d\n", -10, Math.negateExact(-10));
			
			System.out.printf("negateExact(%d)= %d\n", i, Math.negateExact(i));
			//그래서 여기서 오버플로우가 발생했는데, 이것을 try-catch로 잡아서
			//오버플로우가 일어나면 long형으로 형변환 시켜서 negate를 실행시키는것이다.
			//이렇게되면 오버플로우가 일어나서 값이 바뀌는것을 방지할수 있다.
			//그냥 연산자를 통해서 값을 바꾸었다면 예외가 발생하지않아서 이렇게 따로 처리를
			//할수없지만 Math.~~Exact()를 사용하면 예외가 발생되므로 깔끔한 오류처리를 할수
			//있게 된다 ^^;;
		} catch (ArithmeticException e) {
			System.out.printf("negateExact(%d)=%d\n",(long)i,Math.negateExact((long)i));
		}
	}
}

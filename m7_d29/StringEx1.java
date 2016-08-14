package m7_d29;

public class StringEx1 {
	public static void main(String[] args){
		String str1="abc";
		String str2="abc";
		
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1==str2 ? "+(str1==str2));
		System.out.println("str1.equals(str2) ? "+str1.equals(str2));
		
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");
		
		System.out.println("String str3= new String(\"abc\");");
		System.out.println("String str4= new String(\"abc\");");
		
		System.out.println("str3==str4 ? "+(str3==str4));
		System.out.println("str3.equals(str4)?"+str3.equals(str4));
	}
}

//즉 인스턴스를 생성해서 스트링 객체를 만드는것은 새로 만든 객체를 가리키는것이기 때문에 주소가 다른것이고, 그냥 문자 리터럴을 가리킨 str1,str2는 같은곳을 가리키고 있는것이기 때문에
//당연히 주소값을 일치한다. 그리고 String클래스의 equals() 메소드는 오버라이딩을 통해서 내용이 같으면 true를 주는것이다.



package m8_d14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class ObjectsTest {
	public static void main(String[] args){
		
		String[][] str2D = new String[][]{ {"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D_2 = new String[][]{ {"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.print("str2D ={");
		for(String[] tmp:str2D)
			System.out.print(Arrays.toString(tmp));
		System.out.println("}");
		
		System.out.print("str2D_2={");
		for(String[] tmp:str2D_2)
			System.out.print(Arrays.toString(tmp));
		System.out.println("}\n");
		
		
		System.out.println("equals(str2D,str2D_2)="+Objects.equals(str2D, str2D_2));
		System.out.println("deepEquals(str2D,str2D_2)="+Objects.deepEquals(str2D, str2D_2));
		System.out.println();
		
		System.out.println("isNull(null)="+Objects.isNull(null));
		System.out.println("nonNull(null)="+Objects.nonNull(null));
		System.out.println("hashCode(null)="+Objects.hashCode(null));
		System.out.println("toString(null)="+Objects.toString(null));
		System.out.println("toString(null, \"\")="+Objects.toString(null,""));
		
		Comparator c= String.CASE_INSENSITIVE_ORDER;
		//이 비교기, 아직 자세히는 모르겠다.
		
		
		System.out.println("compare(\"aa\",\"bb\")="+Objects.compare("aa","bb",c));
		//aa가 더 작으므로 -1
		System.out.println("compare(\"bb\",\"aa\")="+Objects.compare("bb","aa",c));
		//bb가 더 크므로 1
		System.out.println("compare(\"ab\",\"AB\")="+Objects.compare("ab","AB",c));
		//대소문자 구별 안되는듯하다. 같아서 0
			
	}
}

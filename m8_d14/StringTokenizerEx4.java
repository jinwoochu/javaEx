package m8_d14;

import java.util.StringTokenizer;

public class StringTokenizerEx4 {
	public static void main(String[] args){
		String input="이천만육천구십일";
		
		System.out.println(input);
		System.out.println(hangulToNum(input));
	}
	public static long hangulToNum(String input){
		long result=0;
		long tmpResult=0;
		long num=0;
		
		final String NUMBER="영일이삼사오육칠팔구";
		final String UNIT="십백천만억조";
		final long[] UNIT_NUM={10,100,1000,10000,(long)1e8,(long)1e12};
		
		StringTokenizer st=new StringTokenizer(input,UNIT,true);
		
		while(st.hasMoreTokens()){
			String token=st.nextToken();
			//숫자인지, 단위(UNIT)인지 확인한다.
			int check=NUMBER.indexOf(token);
			
			if(check==-1){	//단위인 경우
				if("만억조".indexOf(token)==-1){
					tmpResult+=(num!=0 ? num:1)
							*UNIT_NUM[UNIT.indexOf(token)];
				}else{
					tmpResult+=num;
					result+=(tmpResult!=0 ? tmpResult:1)
							*UNIT_NUM[UNIT.indexOf(token)];
					tmpResult=0;
				}
				num=0;
			}else{		//숫자인 경우
				num=check;
			}
		}
		return result+tmpResult+num;
	}
}
/*
한글로 된 숫자를 아라비아 숫자로 변환하는 예제이다.
먼저 tmpResult는 "만억조"와 같은 큰 단위가 나오기 전까지 "십백천"단위의
값을 저장하기 위한 임시공간이고 result는 실제 결과 값을 저장하기 위한 공간이다
한글로 된 숫자를 구분자(단위)로 잘라서, 토큰이 숫자면 num에 저장하고 단위면
num에 단위(UNIT_NUM배열 중의 한 값)를 곱해서tmpResult에 저장한다. 예를 들어
"삼십"이면 3*10이 되어 30이 tmpResult에 저장된다.
그리고 "만삼천"과 같이 숫자 없이 바로 단위로 시작하는 경우에는 num의 값이
0이기 때문에 단위의 값을 곱해도 그 결과가 0이 되므로 삼항 연산자를 이용
해서 num의 값을 1로 바꾼 후 단위값을 곱하도록 하였다.

그 드음에 "만억조"와 같이 큰 단위가 나오면 tmpResult에 저장된 값에 큰 단위
값을 곱해서 result에 저장하고 tmpResult는 0으로 초기화 한다. 예를 들어
"삼십만"은 tmpResult에 저장되어 있던 30에 10000을 곱해서 result에 저장하고
tmpResult는 0으로 초기화한다.
*/

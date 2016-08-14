package m8_d14;

public class RandomEx4 {
	final static int RECORD_NUM=10;
	final static String TABLE_NAME="TEST_TABLE";
	final static String[] CODE1={"010","011","017","018","019"};
	final static String[] CODE2={"남자","여자"};
	final static String[] CODE3={"10대","20대","30대","40대","50대"};
		
	public static void main(String[] args){
		for(int i=0; i<RECORD_NUM; i++){
			System.out.println(" INSERT INTO "+TABLE_NAME
					+ "VALUES ("
					+ " '"+getRandArr(CODE1)+"'"
					+ " '"+getRandArr(CODE2)+"'"
					+ " '"+getRandArr(CODE3)+"'"
					+ " '"+getRand(100,200)		//100~200사이의 값을 얻는다.
					+ "'); ");
		}
	}
	public static String getRandArr(String[] arr){
		return arr[getRand(arr.length-1)];
	}
	//인덱스 값을 랜덤으로 받아오게 하려고 인덱스자리에 랜덤메소드 호출.
	
	public static int getRand(int n){
		return getRand(0,n);
	}
	//숫자하나만 넣으면 0~n 사이의 값을 얻게 하도록 하기 위함.
	
	
	public static int getRand(int from,int to){
		return (int)(Math.random()*Math.abs(to-from)+1)+Math.min(from,to);
	}
}

/*
데이터베이스에 넣을 테스트 데이터를 만드는 예제이다. 지금까지는 연속적인 범위 내에서 값을 
얻어왔지만, 때로는 이 예제와 같이 불연속적인 범위에 있는 값을 임의로 얻어와야 하는 경우도
있다. 이런 경우, 불연속적인 값을 배열에 저장한 후, 배열의 index를 임의로 얻어서 배열에 저장된
값을 읽어오도록 하면 된다.

 INSERT INTO TEST_TABLEVALUES ( '018' '여자' '50대' '147'); 
 INSERT INTO TEST_TABLEVALUES ( '011' '여자' '40대' '165'); 
 INSERT INTO TEST_TABLEVALUES ( '018' '여자' '40대' '102'); 
 INSERT INTO TEST_TABLEVALUES ( '011' '여자' '50대' '183'); 
 INSERT INTO TEST_TABLEVALUES ( '019' '여자' '30대' '156'); 
 INSERT INTO TEST_TABLEVALUES ( '018' '여자' '50대' '126'); 
 INSERT INTO TEST_TABLEVALUES ( '017' '여자' '20대' '121'); 
 INSERT INTO TEST_TABLEVALUES ( '017' '여자' '20대' '162'); 
 INSERT INTO TEST_TABLEVALUES ( '019' '여자' '40대' '182'); 
 INSERT INTO TEST_TABLEVALUES ( '019' '여자' '20대' '185'); 
 
 */
 

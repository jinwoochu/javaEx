package m8_d14;

public class RandomEx4 {
	final static int RECORD_NUM=10;
	final static String TABLE_NAME="TEST_TABLE";
	final static String[] CODE1={"010","011","017","018","019"};
	final static String[] CODE2={"����","����"};
	final static String[] CODE3={"10��","20��","30��","40��","50��"};
		
	public static void main(String[] args){
		for(int i=0; i<RECORD_NUM; i++){
			System.out.println(" INSERT INTO "+TABLE_NAME
					+ "VALUES ("
					+ " '"+getRandArr(CODE1)+"'"
					+ " '"+getRandArr(CODE2)+"'"
					+ " '"+getRandArr(CODE3)+"'"
					+ " '"+getRand(100,200)		//100~200������ ���� ��´�.
					+ "'); ");
		}
	}
	public static String getRandArr(String[] arr){
		return arr[getRand(arr.length-1)];
	}
	//�ε��� ���� �������� �޾ƿ��� �Ϸ��� �ε����ڸ��� �����޼ҵ� ȣ��.
	
	public static int getRand(int n){
		return getRand(0,n);
	}
	//�����ϳ��� ������ 0~n ������ ���� ��� �ϵ��� �ϱ� ����.
	
	
	public static int getRand(int from,int to){
		return (int)(Math.random()*Math.abs(to-from)+1)+Math.min(from,to);
	}
}

/*
�����ͺ��̽��� ���� �׽�Ʈ �����͸� ����� �����̴�. ���ݱ����� �������� ���� ������ ���� 
��������, ���δ� �� ������ ���� �ҿ������� ������ �ִ� ���� ���Ƿ� ���;� �ϴ� ��쵵
�ִ�. �̷� ���, �ҿ������� ���� �迭�� ������ ��, �迭�� index�� ���Ƿ� �� �迭�� �����
���� �о������ �ϸ� �ȴ�.

 INSERT INTO TEST_TABLEVALUES ( '018' '����' '50��' '147'); 
 INSERT INTO TEST_TABLEVALUES ( '011' '����' '40��' '165'); 
 INSERT INTO TEST_TABLEVALUES ( '018' '����' '40��' '102'); 
 INSERT INTO TEST_TABLEVALUES ( '011' '����' '50��' '183'); 
 INSERT INTO TEST_TABLEVALUES ( '019' '����' '30��' '156'); 
 INSERT INTO TEST_TABLEVALUES ( '018' '����' '50��' '126'); 
 INSERT INTO TEST_TABLEVALUES ( '017' '����' '20��' '121'); 
 INSERT INTO TEST_TABLEVALUES ( '017' '����' '20��' '162'); 
 INSERT INTO TEST_TABLEVALUES ( '019' '����' '40��' '182'); 
 INSERT INTO TEST_TABLEVALUES ( '019' '����' '20��' '185'); 
 
 */
 


public class ChainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest ct = new ChainTest();
		try{
			ct.test2();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * test1():�׳����ȴ��ˡ��쳣
	 * test2():����test1(),���񡰺ȴ��ˡ��쳣
	 * main()�����У�����test2(),���Բ���test2()�׳����쳣
	 */
	
	public void test1() throws DrunkException{
		throw new DrunkException("�ȾƱ𿪳�");
	}

	public void test2(){
		try{
			test1();
		}catch(DrunkException e){
			RuntimeException newException = new RuntimeException(e);
//			newException.initCause(e);
			throw newException;
		}
	}
}

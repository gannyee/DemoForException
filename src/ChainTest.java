
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
	 * test1():抛出“喝大了”异常
	 * test2():调用test1(),捕获“喝大了”异常
	 * main()方法中，调用test2(),尝试捕获test2()抛出的异常
	 */
	
	public void test1() throws DrunkException{
		throw new DrunkException("喝酒别开车");
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


public class TryCatchTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchTest tct = new TryCatchTest();
		//int result = tct.test();
/*		System.out.println("test()方法执行完毕，返回值为" + result);
		int result2 = tct.test2();
		System.out.println("我想大声告诉你这是test2");*/
		int result = tct.test3();
		System.out.println("test3运行了" + result);
		
	}
	
	/**
	 * divider(除数)
	 * result(结果)
	 */
	public int test(){
		int divider = 10;
		int result = 100;
		try{
			while(divider > -1){
				divider --;
				result = result + 100 / divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常！！");
			return -1;
		}
	}
	/**
	 * divider(除数)
	 * result(结果)
	 * try-catch捕获while循环
	 * 每次循环，divider减一，result = result + 100 / divider
	 * 如果:捕获异常，"打印输出"抛出异常了!!返回result=999
	 * 否则:返回result
	 * finally:打印输出这是finall"哈哈"
	 * @return
	 */
	public int test2(){
		int divider = 10;
		int result = 100;
		try{
			while(divider > -1){
				divider --;
				result = result + 100 / divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常！！");
			return result = 999;
		}finally{
			System.out.println("这是finally 哈哈");
			System.out.println("我是result，我的值是" + result);
		}
	}
	
	/**
	 * divider(除数)
	 * result(结果)
	 * try-catch捕获while循环
	 * 每次循环，divider减一，result = result + 100 / divider
	 * 如果:捕获异常，"打印输出"抛出异常了!!返回result=999
	 * 否则:返回result
	 * finally:打印输出这是finall"哈哈"
	 * 最后返回1111作为结果
	 */
	
	public int test3(){
		int divider = 10;
		int result = 100;
		try{
			while(divider > -1){
				divider --;
				result = result + 100 / divider;
			}
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常！！");
			
		}finally{
			System.out.println("这是finally 哈哈");
			System.out.println("我是result，我的值是" + result);
		}
		System.out.println("我是test3,我运行完了");
		return 1111;
	}
}

import java.util.*;
public class TestforException {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("请输入第一个整数:");
			int one = input.nextInt();
			System.out.println("请输入第二个整数:");
			int two = input.nextInt();
			System.out.println("两整数想除结果为:" + (one / two));
		}catch(InputMismatchException e){
			System.out.println("你应该输入整数!!");
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}catch(Exception e){
			System.out.println("我是不知名异常");
		}finally{
			//善后工作 最终要执行的代码
		}
		System.out.println("程序结束啦");
	}

}

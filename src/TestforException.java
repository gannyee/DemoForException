import java.util.*;
public class TestforException {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("�������һ������:");
			int one = input.nextInt();
			System.out.println("������ڶ�������:");
			int two = input.nextInt();
			System.out.println("������������Ϊ:" + (one / two));
		}catch(InputMismatchException e){
			System.out.println("��Ӧ����������!!");
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0");
		}catch(Exception e){
			System.out.println("���ǲ�֪���쳣");
		}finally{
			//�ƺ��� ����Ҫִ�еĴ���
		}
		System.out.println("���������");
	}

}

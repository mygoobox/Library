package function;
import java.util.Scanner;
import authenticate.*;

public class Main {

	private static Scanner input = new Scanner(System.in);
	private static boolean isAuthenticated = false;
	private static Authenticate authenticate;
	public static Function function;
	
	public static void main(String[] args)
	{		
		System.out.println("�Ϸ��Ƽ���ѧͼ���");
		System.out.println("--------------------");
		
		while (getIsAuthenticated() == false)
		{
			enterInformation();
			while (getIsAuthenticated())
			{
				if (authenticate instanceof StudentAuthenticate)
					studentMenu();
				else
					adminMenu();
		}
		}
		
	}
	
	public static void enterInformation()
	{
		System.out.println("��ѡ��������ݣ�ѧ��/����Ա����");
		System.out.println("ѧ��(1)");
		System.out.println("����Ա��2��");
		
		int identityChoose = input.nextInt();
		
		System.out.println("�����������ʺţ�");
		String user = input.next();
		System.out.println("�������������룺");
		String password = input.next();
		
		switch (identityChoose)
		{
		case 1:
			authenticate = new StudentAuthenticate(user,password);
			break;
		case 2:
			authenticate = new AdminAuthenticate(user,password);
			break;
		}
		
		isAuthenticated = authenticate.authenticate();
		if (getIsAuthenticated() == false)
			System.out.println("���������Ϣ�������������룺");
	}
	public static boolean getIsAuthenticated()
	{
		return isAuthenticated;
	}
	
	public static void setIsAuthenticated(boolean IsAuthen)
	{
		isAuthenticated = IsAuthen;
	}
	
	public static void adminMenu()
	{
		System.out.println("���ܲ˵���");
		System.out.println("������Ϣ����1��");
		System.out.println("ͼ����Ϣ����2��");
		System.out.println("�ǳ��ʺţ�0��");
		
		int functionChoose = input.nextInt();
		switch (functionChoose)
		{
		case 1:
			function = new StudentManage();
			function.execute();
			break;
		case 2:
			function = new BookManage();
			function.execute();
			break;
		case 0:
			function = new Function();
			setIsAuthenticated(false);
			break;
		}
	}
	
	public static void studentMenu()
	{
		System.out.println("���ܲ˵���");
		System.out.println("ͼ���ѯ��1��");
		System.out.println("�軹ͼ�����2��");
		System.out.println("�ǳ��ʺţ�0��");
		
		int functionChoose = input.nextInt();
		switch (functionChoose)
		{
		case 1:
			function = new FindingBook();
			function.execute();
			break;
		case 2:
			function = new BorrowedBookManage();
			function.execute();
			break;
		case 0:
			setIsAuthenticated(false);
			break;
		}
		
	}
}

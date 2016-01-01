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
		System.out.println("南方科技大学图书馆");
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
		System.out.println("请选择您的身份（学生/管理员）：");
		System.out.println("学生(1)");
		System.out.println("管理员（2）");
		
		int identityChoose = input.nextInt();
		
		System.out.println("请输入您的帐号：");
		String user = input.next();
		System.out.println("请输入您的密码：");
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
			System.out.println("您输入的信息有误，请重新输入：");
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
		System.out.println("功能菜单：");
		System.out.println("读者信息管理（1）");
		System.out.println("图书信息管理（2）");
		System.out.println("登出帐号（0）");
		
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
		System.out.println("功能菜单：");
		System.out.println("图书查询（1）");
		System.out.println("借还图书管理（2）");
		System.out.println("登出帐号（0）");
		
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

package function;

import java.util.Scanner;

public class Function {
	
	public static Scanner input = new Scanner(System.in);
	public static boolean toReturn;

	public void execute()
	{
	}
	
	public static void finish()
	{
		String name = "";
		if (Main.function instanceof FindingBook)
			name = "查询图书";
		if (Main.function instanceof BookManage)
			name = "管理图书";
		if (Main.function instanceof BorrowedBookManage)
			name = "管理借还图书";
		if (Main.function instanceof StudentManage)
			name = "管理读者信息";
		System.out.println("操作成功，请选择您接下来的操作：");
		System.out.printf("继续%s：（1）",name);
		System.out.println();
		System.out.println("返回主菜单（0）");
		
		int choose = input.nextInt();
		if (choose == 0)
			toReturn = true;
	}
}

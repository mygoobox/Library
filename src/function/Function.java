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
			name = "��ѯͼ��";
		if (Main.function instanceof BookManage)
			name = "����ͼ��";
		if (Main.function instanceof BorrowedBookManage)
			name = "����軹ͼ��";
		if (Main.function instanceof StudentManage)
			name = "���������Ϣ";
		System.out.println("�����ɹ�����ѡ�����������Ĳ�����");
		System.out.printf("����%s����1��",name);
		System.out.println();
		System.out.println("�������˵���0��");
		
		int choose = input.nextInt();
		if (choose == 0)
			toReturn = true;
	}
}

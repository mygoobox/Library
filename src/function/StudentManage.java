package function;

public class StudentManage extends Function{
		
	public void execute()
	{
		toReturn = false;
		while (toReturn == false)
		{
			System.out.println("读者信息管理：");
			System.out.println("录入新读者（1）");
			System.out.println("读者信息列表（2）");
			System.out.println("返回上级菜单（0）");

			int functionChoose = input.nextInt();
			switch (functionChoose)
			{
			case 1:
				addStudent();
				break;
			case 2:
				showStudentList();
				break;
			case 0:
				toReturn = true;
				break;
			}
		}
		
	}
		
	private void addStudent()
	{
		//此处添加具体功能
		finish();
	}
	
	private void showStudentList()
	{
		//此处添加具体功能
		finish();
	}

}

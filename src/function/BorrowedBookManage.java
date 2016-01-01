package function;

public class BorrowedBookManage extends Function{
		
	public void execute()
	{
		toReturn = false;
		while (toReturn == false)
		{
			System.out.println("借还图书管理：");
			System.out.println("借书（1）");
			System.out.println("还书（2）");
			System.out.println("预期图书处理（3）");
			System.out.println("续借（4）");
			System.out.println("返回上级菜单（0）");

			int functionChoose = input.nextInt();
			switch (functionChoose)
			{
			case 1:
				borrowBook();
				break;
			case 2:
				returnBook();
				break;
			case 3:
				dueBookList();
				break;
			case 4:
				delayBook();
			case 0:
				toReturn = true;
				break;
			}
		}
	}

	private void borrowBook()
	{
		//此处添加具体功能
		finish();
	}
	private void returnBook()
	{
		//此处添加具体功能
		finish();
	}
	private void dueBookList()
	{
		//此处添加具体功能
		finish();
	}
	private void delayBook()
	{
		//此处添加具体功能
		finish();
	}
}

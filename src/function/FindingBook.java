package function;

public class FindingBook extends Function{
		
	public void execute()
	{
		toReturn = false;
		while (toReturn == false)
		{
			System.out.println("图书查询：");
			System.out.println("在馆图书查询（1）");
			System.out.println("借阅图书查询（2）");
			System.out.println("返回上级菜单（0）");

			int functionChoose = input.nextInt();
			switch (functionChoose)
			{
			case 1:
				findingBook();
				break;
			case 2:
				myBorrowedBook();
				break;
			case 0:
				toReturn = true;
				break;
			}
		}
	}

	private void findingBook()
	{
		//此处添加具体功能
		finish();
	}
	private void myBorrowedBook()
	{
		//此处添加具体功能
		finish();
	}
}

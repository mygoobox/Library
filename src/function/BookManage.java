package function;

public class BookManage extends Function{
		
	public void execute()
	{
		toReturn = false;
		while (toReturn == false)
		{
			System.out.println("图书信息管理：");
			System.out.println("新书入馆（1）");
			System.out.println("编辑图书信息（2）");
			System.out.println("图书信息列表（3）");
			System.out.println("返回上级菜单（0）");

			int functionChoose = input.nextInt();
			switch (functionChoose)
			{
			case 1:
				addBook();
				break;
			case 2:
				editBook();
				break;
			case 3:
				showBookList();
				break;
			case 0:
				toReturn = true;
				break;
			}
		}
	}
	
	private void addBook()
	{
		//此处添加具体功能
		finish();
	}
	
	private void editBook()
	{
		//此处添加具体功能
		finish();
	}
	
	private void showBookList()
	{
		//此处添加具体功能
		finish();
	}

}

package function;

public class BookManage extends Function{
		
	public void execute()
	{
		toReturn = false;
		while (toReturn == false)
		{
			System.out.println("ͼ����Ϣ����");
			System.out.println("������ݣ�1��");
			System.out.println("�༭ͼ����Ϣ��2��");
			System.out.println("ͼ����Ϣ�б�3��");
			System.out.println("�����ϼ��˵���0��");

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
		//�˴���Ӿ��幦��
		finish();
	}
	
	private void editBook()
	{
		//�˴���Ӿ��幦��
		finish();
	}
	
	private void showBookList()
	{
		//�˴���Ӿ��幦��
		finish();
	}

}

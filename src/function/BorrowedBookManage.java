package function;

public class BorrowedBookManage extends Function{
		
	public void execute()
	{
		toReturn = false;
		while (toReturn == false)
		{
			System.out.println("�軹ͼ�����");
			System.out.println("���飨1��");
			System.out.println("���飨2��");
			System.out.println("Ԥ��ͼ�鴦��3��");
			System.out.println("���裨4��");
			System.out.println("�����ϼ��˵���0��");

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
		//�˴���Ӿ��幦��
		finish();
	}
	private void returnBook()
	{
		//�˴���Ӿ��幦��
		finish();
	}
	private void dueBookList()
	{
		//�˴���Ӿ��幦��
		finish();
	}
	private void delayBook()
	{
		//�˴���Ӿ��幦��
		finish();
	}
}

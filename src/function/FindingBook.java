package function;

public class FindingBook extends Function{
		
	public void execute()
	{
		toReturn = false;
		while (toReturn == false)
		{
			System.out.println("ͼ���ѯ��");
			System.out.println("�ڹ�ͼ���ѯ��1��");
			System.out.println("����ͼ���ѯ��2��");
			System.out.println("�����ϼ��˵���0��");

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
		//�˴���Ӿ��幦��
		finish();
	}
	private void myBorrowedBook()
	{
		//�˴���Ӿ��幦��
		finish();
	}
}

package function;

public class StudentManage extends Function{
		
	public void execute()
	{
		toReturn = false;
		while (toReturn == false)
		{
			System.out.println("������Ϣ����");
			System.out.println("¼���¶��ߣ�1��");
			System.out.println("������Ϣ�б�2��");
			System.out.println("�����ϼ��˵���0��");

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
		//�˴���Ӿ��幦��
		finish();
	}
	
	private void showStudentList()
	{
		//�˴���Ӿ��幦��
		finish();
	}

}

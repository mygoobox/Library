package authenticate;

public class AdminAuthenticate extends Authenticate{

	public AdminAuthenticate(String user,String password)
	{
		super(user,password);
	}
	
	
	public boolean authenticate()
	{
		if (getUser().equals("admin") & getPassword().equals("123456"))
			return true;
		else
			return false;
	}
	
}

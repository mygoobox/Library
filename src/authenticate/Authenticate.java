package authenticate;

public abstract class Authenticate {

	private String user;
	private String password;

	Authenticate(String user,String password)
	{
		this.user = user;
		this.password = password;
	}
	
	public boolean authenticate()
	{
		//接入数据库
		return true;
	}
	
	public String getUser()
	{
		return user;
	}
	
	public String getPassword()
	{
		return password;
	}
}

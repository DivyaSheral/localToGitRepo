package divya.selenium_maven;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void login()
	{
		System.out.print("login test");
	}
	
	@Test
	public void homePage()
	{
		System.out.print("login test");
	}
	public void createdOnLocal()
	{
		System.out.print("this method created in local and pushed to git");
	}

	public void methodForDeveleopmentBranch()
	{
		System.out.print("this method created in local and for develeopment branch");
	}
	
	public void methodformaster()
	{
		System.out.print("clone - changes-push");
	}
	
}

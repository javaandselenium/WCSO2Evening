package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.FacebookPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class FacebookLike extends BaseClass{
	@Test
	public void tc2() throws FileNotFoundException, IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasButton();
		s.skillraryDemoapplication();
		
		utilies.switchTabs(driver);
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utilies.dropDown(d.getCoursedd(),pdata.getData("course"));
		
		TestingPage t=new TestingPage(driver);
		t.facebookicon();
		
		FacebookPage fb=new FacebookPage(driver);
		fb.likebutton();
		
		Assert.assertEquals(driver.getTitle(),pdata.getData("fbtitle"));
		
		
	}

}

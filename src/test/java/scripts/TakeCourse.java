package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.SeleniumPage;
import pomPages.SkillraryLoginPage;
import pomPages.TakethiscoursePage;

public class TakeCourse extends BaseClass{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.serchtextbox(pdata.getData("courseName"));
		s.serachbutton();
		
		SeleniumPage sl=new SeleniumPage(driver);
		sl.corejavatraining();
		
		TakethiscoursePage t=new TakethiscoursePage(driver);
		utilies.frameSwitch(driver);
		t.playbutton();
		Thread.sleep(10000);
		t.pausebutton();
		utilies.frameswitchBack(driver);

		Assert.assertEquals(driver.getTitle(),pdata.getData("takecoursetitle"));
		
		
		
		
		
		
		
		
		
		
	}

}

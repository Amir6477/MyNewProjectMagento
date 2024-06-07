package Magentotestcases;

import java.io.IOException;
import org.testng.annotations.Test;

import Magentopageobject.Magentologinfunctionality;
import junit.framework.Assert;

public class Magentotestcase extends Magentobase {

	@Test
	public void LoginTest() throws IOException {
		
		Magentologinfunctionality lp=new Magentologinfunctionality(driver);
		
		lp.setIUsername(UName);
		log.info("username is entered");
		
		lp.setPassword(PWord);
		log.info("password is entered");
		lp.ClickLoginBtn();
		log.info("login btn clicking activity is completed");
	
	String  Act_title=driver.getTitle();
	String Exp_title="My Account";
	
	if(Act_title.equals(Exp_title)) {
		
		Assert.assertTrue(true);
		log.info("testcase is passed");
	}else {
		
		captureScreen("LoginTest");
		Assert.assertTrue(false);
		log.info("testcase is failed");
	}
		
	
	}
}


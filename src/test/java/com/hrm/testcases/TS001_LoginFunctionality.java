package com.hrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrm.testbase.BasePage;
import com.hrm.utilities.Randoms;

public class TS001_LoginFunctionality extends BasePage{

	@Test(priority = 1)
	public void TC001_verify_user_should_not_login_with_invalid_credential() {
		loginpage.set_username(Randoms.name());
		loginpage.set_password(Randoms.name());
		loginpage.btn_login();
		String actaul_ErrorMsg = loginpage.get_errorMsg();
		String expected_ErrorMsg = "Invalid credentials";
		Assert.assertEquals(actaul_ErrorMsg, expected_ErrorMsg, "Error Message doesn't visible or doesn't matchs.");
	}
	
}

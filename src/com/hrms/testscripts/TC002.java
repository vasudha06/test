package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
//public static void main(String args[]) throws Exception {
	
@Test
public void tc002 () throws Exception {
		
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.addemp();
		obj.delemp();
		obj.logout();
		obj.closeApplication();
		
	}

}

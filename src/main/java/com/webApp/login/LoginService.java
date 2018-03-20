package com.webApp.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("rihab_Berrich") && password.equals("dummy"))
			return true;

		return false;
	}

}

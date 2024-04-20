package com.example.cloudstorage;


public class Login {
	
	private void sendToDB(String[] data) {
		
	}
	
	protected String[] getUserDataFromDB() {
		String[] data = {"1","2"};
		return data;
	}

	
	private class Authenification {
		
		protected Boolean verifyName(String UserName) {
			return true;
		}
		
		protected Boolean verifyPassword(String UserPassword) {
			return true;
		}

	}

	private class Authorization extends Authenification{
		private void AuthorizeCLient(String UserName, String UserPassword) {
			if (verifyName(UserName) & verifyPassword(UserPassword)){
				String[] data = {"login","password"};
				sendToDB(data);
			}
		}
	}

	private class Enter extends Authorization {
		private String SignUpNewAccount(String AccountName, String Password) {
			if( verifyName(AccountName) == true &  verifyPassword(Password) == true ){
				String message = "new account created";
				String[] UserData = {Password, AccountName};
				sendToDB(UserData);
				return message;
			}
			else {
				String message = "not valid data";
				return message;
			}

	}

	private class Registration extends Authorization {
		private String SignInToAccount(String AccountName, String Password) {
			String[] DBUserData = getUserDataFromDB(); 
			if( AccountName == DBUserData[0] &  Password == DBUserData[1] ){
				String message = "Welcome!";
				return message;
			}
			else {
				String message = "user doesn't exists or data was inputed wrong";
				return message;
				}
			}
		}
	}
}
package Main;

import View.Login;
import View.AccountCreate;
import Controller.LoginController;
import Controller.AccountCreateController;

public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        LoginController logincontroller = new LoginController(login);
        login.setController(logincontroller);
        
        AccountCreate accountcreate = new AccountCreate();
        accountcreate.setVisible(true);
        AccountCreateController accountcontroller = new AccountCreateController(accountcreate);
        accountcreate.setController(accountcontroller);
        
    }
}

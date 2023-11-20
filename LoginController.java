package Controller;

import Model.LoginModel;
import View.Login;
import View.Manager;
import View.Cashier;
import javax.swing.*;

/**
 *
 * @author Samsung
 */
public class LoginController {

    private final Login login;

    public LoginController(Login login) {
        this.login = login;
    }

    public void initializeController() {
        this.login.setController(this);
    }

    public void handleLogin() {
        String username = login.getUsername().trim();
        char[] password = login.getPassword();
        String acctype = login.getAccType();

        if (username.isEmpty() || password.length == 0 || acctype.equals("Select Account Type")) {
            JOptionPane.showMessageDialog(login, "Some Fields Are Empty!");
        } else {
            try {
                if (LoginModel.authenticateUser(username, new String(password), acctype)) {
                    JOptionPane.showMessageDialog(login, "Login Details Are Correct!\nLogin as a: " + acctype);

                    if (acctype.equals("Manager")) {
                        Manager manager = new Manager();
                        manager.setVisible(true);
                        login.dispose();
                    } else if (acctype.equals("Cashier")) {
                        Cashier cashier = new Cashier();
                        cashier.setVisible(true);
                        login.dispose();
                    }

                } else {
                    JOptionPane.showMessageDialog(login, "Login Details Are Incorrect!");
                }
            } catch (RuntimeException ex) {
                JOptionPane.showMessageDialog(login, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

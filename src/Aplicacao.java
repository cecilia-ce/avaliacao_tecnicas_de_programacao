import View.Login;

import javax.swing.*;

public class Aplicacao {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() ->{
            Login login = new Login();
            login.setVisible(true);
        });

    }

}

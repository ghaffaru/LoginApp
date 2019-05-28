package login;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable
{
    @FXML private Label message;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void getUser(String user)
    {
        message.setText(user);
    }
}

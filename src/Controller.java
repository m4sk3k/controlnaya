import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button click;
    @FXML
    private Label error;
    @FXML
    private TextField login;
    @FXML
    private TextField pass;
    @FXML
    private void action(ActionEvent Enter){
        String x = login.getText();
        String y = pass.getText();
        String admin = "admin";
        String adminpass = "pass";
        if((login.getText().equals(admin)) && (pass.getText().equals(adminpass))){
            error.setText("Hello Admin!");
        }else{
            error.setText("Auth error");
        }
    }
}

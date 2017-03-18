/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class WindowController implements Initializable {

    @FXML
    private TextArea displayMain;
    @FXML
    private TextField displayName;
    @FXML
    private TextField displayCF;
    @FXML
    private TextField displayVJ;
    @FXML
    private TextField displayCC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    String show_all = "";
    String cf = "";
    String vj = "";
    String cc = "";
    String name = "";

    String cf_show = "";
    String vj_show = "";
    String cc_show = "";

    @FXML
    private void handleSubmit(ActionEvent event) throws Exception {
        String cf = displayCF.getText();
        String vj = displayVJ.getText();
        String cc = displayCC.getText();
        String name = displayName.getText();

        String cf_show = kaji.codeforces(cf);
        String vj_show = kaji.vjudge(vj);
        String cc_show = kaji.codechef(cc);

        String show = cf_show + '\n' + vj_show + '\n' + cc_show;

        show_all += name + "     " + cf_show + "                " + vj_show + "                " + cc_show + "           " + '\n';

        //display2.setText(show);
    }

    @FXML
    private void handleShow_all(ActionEvent event) {
        displayMain.setText(show_all);
    }

}

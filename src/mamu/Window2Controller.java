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
public class Window2Controller implements Initializable {

    @FXML
    private TextField displayCFcontest;
    @FXML
    private TextArea displayCCContest;
    @FXML
    private TextArea displayTF;
    @FXML
    private TextField displayCM;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCFContest(ActionEvent event) throws Exception {
        displayCFcontest.setText(kaji.codeforces_schedule());
    }

    @FXML
    private void handleCCContest(ActionEvent event) throws Exception {
        displayCCContest.setText(soup.codechef_schedule());
    }

    @FXML
    private void handleTFContest(ActionEvent event) {
        displayTF.setText(soup.toph());
    }

    @FXML
    private void handleCMContest(ActionEvent event) {
        displayCM.setText(soup.codemarshal());
    }
    
    
    
}

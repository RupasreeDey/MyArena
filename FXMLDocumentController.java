/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField display2;
    @FXML
    private TextField display1;
    @FXML
    private TextField display3;
    @FXML
    private TextField display4;
    @FXML
    private TextField display6;
    @FXML
    private TextField display5;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void actionCodeforces(ActionEvent event) {
        display1.setText("enter your username");
    }
    
      @FXML
    private void actionLogin(ActionEvent event) {
        String user = display2.getText();
        String detail="";
        try{
             detail =  search1.codeforces(user);
        }
        catch(Exception e)
        {
            
        }
        display1.setText(detail);
    }

    @FXML
    private void actionVjudge(ActionEvent event) {
        display3.setText("enter your username");
    }

    @FXML
    private void actionLogin2(ActionEvent event) {
        String user = display4.getText();
        String detail="";
        try{
             detail =  search1.vjudge(user);
        }
        catch(Exception e)
        {
            
        }
        display3.setText(detail);
    }

    @FXML
    private void actionCodechef(ActionEvent event) {
        display5.setText("enter your username");
    }

    @FXML
    private void actionLogin3(ActionEvent event) {
        String user = display6.getText();
        String detail="";
        try{
             detail =  search1.codechef(user);
        }
        catch(Exception e)
        {
            
        }
        display5.setText(detail);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ImageView back_image;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleUser(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("window.fxml"));
		Parent rootl=(Parent) fxmlLoader.load();
		Stage stage=new Stage();
                stage.setTitle("USER PROFILE WINDOW");
		stage.setScene(new Scene(rootl));
		stage.show();
    }

    @FXML
    private void handleContest(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("window2.fxml"));
		Parent rootl=(Parent) fxmlLoader.load();
		Stage stage=new Stage();
                stage.setTitle("CONTEST SCHEDULE WINDOW");
		stage.setScene(new Scene(rootl));
		stage.show();
    }
    
}

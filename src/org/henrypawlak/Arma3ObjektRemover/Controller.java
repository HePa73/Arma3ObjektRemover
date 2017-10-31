package org.henrypawlak.Arma3ObjektRemover;

import java.net.URL;
import java.util.ResourceBundle;

import org.henrypawlak.Arma3ObjektRemover.Zentrale.Zentrale;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable{
		Zentrale Z = new Zentrale(this);

		
		@FXML
		Button btAdd;
		@FXML
		TextField tfID;
		@FXML
		Button btFinish;
		@FXML
		Label lbMsg;
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
			btAdd.setOnAction(e->{
				lbMsg.setText(Z.addID(tfID.getText()));
				tfID.setText("");
				tfID.requestFocus();
			});
			tfID.setOnKeyReleased(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent event) {
					if(event.getCode() == KeyCode.ENTER) {
						lbMsg.setText(Z.addID(tfID.getText()));
						tfID.setText("");
						tfID.requestFocus();
					}
				}
			});
			btFinish.setOnAction(e->lbMsg.setText(Z.finish()));
		}
		
}

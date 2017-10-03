package pl.wjatek.clockwidget.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class MainPaneController {

	@FXML
	private Pane mainPane;
	
	public MainPaneController() {
		// TODO Auto-generated constructor stub
	}
	
	@FXML
	public void initialize() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("../view/ClockLayout.fxml"));
		Pane clockLayout = null;
		
		try {
			clockLayout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mainPane.getChildren().add(clockLayout);
	}
	
	
}

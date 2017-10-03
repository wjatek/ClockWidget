package pl.wjatek.clockwidget;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/MainPane.fxml"));
			Pane mainPane = loader.load();
			
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			
			Scene mainScene = new Scene(mainPane, 200, 200);
			mainScene.setFill(null);

			primaryStage.setScene(mainScene);
			primaryStage.setTitle("ClockWidget");
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.setX(10);
			primaryStage.setY(10);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

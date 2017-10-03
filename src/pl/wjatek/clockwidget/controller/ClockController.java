package pl.wjatek.clockwidget.controller;


import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Arc;
import javafx.util.Duration;
import pl.wjatek.clockwidget.model.Time;

public class ClockController {

	@FXML
	private Label clockLabel;
	
	@FXML
	private Arc arc;

	public ClockController() {
	}

	@FXML
	private void initialize() {
		clockLabel.setText(Time.get());
		arc.setStartAngle(90.0f);
		
		Timeline timeline = new Timeline(new KeyFrame(
		        Duration.millis(100),
		        ae -> clockUpdate()));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}

	private void clockUpdate() {
		clockLabel.setText(Time.get());
		arc.setLength(360.0f - Time.getSec() * 6.0f);
	}

}

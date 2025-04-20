import java.io.InputStream; 
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage; // you know the vibes (`db`) <- praying emote

public class Exercise16_17 extends Application {
	@Override
	public void start(Stage primStage) {
		Label text = new Label("TTHHEE TTEEXXTT"); // the text that will change color
		text.setFont(Font.font("Comic Sans", FontWeight.BOLD, 30));
		text.setTextFill(Color.BLACK);
		
		Label redLabel = new Label("Red"); // slider for RED
		Slider redSlider = new Slider();
		redSlider.setMin(0);
		redSlider.setMax(255);
		
		Label greenLabel = new Label("Green"); // slider for BL- i mean GREEN
		Slider greenSlider = new Slider(); // (i keep getting them mixed up...)
		greenSlider.setMin(0);
		greenSlider.setMax(255);
		
		Label blueLabel = new Label("Blue"); // slider BLUE!
		Slider blueSlider = new Slider();
		blueSlider.setMin(0);
		blueSlider.setMax(255);
		
		Label opaLabel = new Label("Opacity"); // opacity slider, feeling cute, not an inty like the others
		Slider opaSlider = new Slider(0, 1, 0.1);
		opaSlider.setValue(1);
		
		redSlider.valueProperty().addListener(new ChangeListener<Number>() { // change listner for ALL SLIDERSSSS
			public void changed(ObservableValue<? extends Number> ov, Number oldV, Number newV) {
				text.setTextFill(Color.rgb((int)redSlider.getValue(), (int)greenSlider.getValue(), (int)blueSlider.getValue(), opaSlider.getValue()));
			}
		});	
		
		blueSlider.valueProperty().addListener(new ChangeListener<Number>() { // same thing for blue.....
			public void changed(ObservableValue<? extends Number> ov, Number oldV, Number newV) {
				text.setTextFill(Color.rgb((int)redSlider.getValue(), (int)greenSlider.getValue(), (int)blueSlider.getValue(), opaSlider.getValue()));
			}
		});	
		
		greenSlider.valueProperty().addListener(new ChangeListener<Number>() { // you get the idea
			public void changed(ObservableValue<? extends Number> ov, Number oldV, Number newV) {
				text.setTextFill(Color.rgb((int)redSlider.getValue(), (int)greenSlider.getValue(), (int)blueSlider.getValue(), opaSlider.getValue()));
			}
		});	
		
		opaSlider.valueProperty().addListener(new ChangeListener<Number>() { // probably an easier way to do this, meh!
			public void changed(ObservableValue<? extends Number> ov, Number oldV, Number newV) {
				text.setTextFill(Color.rgb((int)redSlider.getValue(), (int)greenSlider.getValue(), (int)blueSlider.getValue(), opaSlider.getValue()));
			}
		});	
		
		
		GridPane pane = new GridPane(); // yeah I use tkinter, how can you tell?
		pane.setAlignment(Pos.CENTER);
		pane.add(text, 0, 0);
		pane.add(redLabel, 0, 1);
		pane.add(redSlider, 1, 1);
		pane.add(blueLabel, 0, 2);
		pane.add(blueSlider, 1, 2);
		pane.add(greenLabel, 0, 3);
		pane.add(greenSlider, 1, 3);
		pane.add(opaLabel, 0, 4);
		pane.add(opaSlider, 1, 4);
		
		Scene scene = new Scene(pane); // finally, scene setup
		primStage.setTitle("jingling plastic keys");
		primStage.setScene(scene);
		primStage.show();
	}

	public static void main(String[] args) { // not today, but I will use proper padding... mark my words...
		launch(args);
	}
}
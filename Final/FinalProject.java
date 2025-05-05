import java.util.*; // if you're an idiot, type 'javac %JAVA_FX% FinalProject.java'
import java.io.InputStream; // if you're still an idiot, search environment var for %JAVA_FX%
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FinalProject extends Application { // main, technically
	@Override
	public void start(Stage primStage) {
		Scene scene = new Scene(new GUI().getView());
		primStage.setTitle("Dumb Canvas");
		primStage.setScene(scene);
		primStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		System.out.println(new GUI().outputTest()); // will print after window is closed
	}
}

abstract class Abstract { // i know it makes no sense to have it here, but gotta fill my class requirements somehow
	protected Abstract() {}
	
	public String outputTest() { // test method
		return "Hello??? Let me out!!";
	}
}

class GUI extends Abstract { // the graphicz wow
	public GUI() {}
	
	public Parent getView() {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		return pane;
	}
}

class Error extends Exception { // custom errors baby!
	public Error() {}
	
	public Error(String message) {
		super(message);
	}
}

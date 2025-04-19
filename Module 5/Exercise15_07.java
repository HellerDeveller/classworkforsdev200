import java.io.InputStream; 
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage; // copy/paste from last project... idc if bad practice! having to import slivers is tedious!

public class Exercise15_07 extends Application {
	@Override
	public void start(Stage primStage) {
		Circle dot = new Circle(100); // the CIRCLE ooh oh oh
		dot.setStroke(Color.BLACK);
		dot.setFill(Color.WHITE);
		
		GridPane pane = new GridPane(); // settin up the pane and circle
		pane.setAlignment(Pos.CENTER);
		pane.add(dot, 0, 0);
		
		dot.setOnMouseReleased (new EventHandler<javafx.scene.input.MouseEvent>() { // mouse release event, turn to white
			@Override // (note to self: if using multiple handlers in the same event, you only need one override tag)
			public void handle(javafx.scene.input.MouseEvent e) {
				dot.setFill(Color.WHITE);
			}
		});
		
		dot.setOnMousePressed (new EventHandler<javafx.scene.input.MouseEvent>() { // mouse hold event, turn to black
			@Override
			public void handle(javafx.scene.input.MouseEvent e) {
				dot.setFill(Color.BLACK);
			}
		});
		
		Scene scene = new Scene(pane); // settin up scene!
		primStage.setTitle("circle brainrot");
		primStage.setScene(scene);
		primStage.show();
	}
	
	public static void main(String[] args) { // uh yeah that's it
		launch(args);
	}
}
import java.io.InputStream; 
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane; // this is so tedious
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Exercise14_01 extends Application { // the gui in question
	@Override // screw you main, **I** run the clubhouse!!
	public void start(Stage primStage) throws FileNotFoundException {
		Image image = new Image(new FileInputStream("C:\\Users\\yours\\Downloads\\14-1 Images\\Images\\flag1.gif")); // get ALL images!! (will not work for you)
		Image image2 = new Image(new FileInputStream("C:\\Users\\yours\\Downloads\\14-1 Images\\Images\\flag2.gif")); // if you want them to work for you, 
		Image image3 = new Image(new FileInputStream("C:\\Users\\yours\\Downloads\\14-1 Images\\Images\\flag6.gif")); // you will have to change the directory
		Image image4 = new Image(new FileInputStream("C:\\Users\\yours\\Downloads\\14-1 Images\\Images\\flag7.gif")); // for then, they will know their obedience
		
		ImageView imageView = new ImageView(image); // MAKE THEM ALL VIEW!!
		ImageView imageView2 = new ImageView(image2); // VIEW!
		ImageView imageView3 = new ImageView(image3); // FEW!
		ImageView imageView4 = new ImageView(image4); // BEU!
		
		GridPane pane = new GridPane(); // GRIDS! GRIDS!! GRIIIIIIIIIIIDS!!!
		pane.setAlignment(Pos.CENTER); // center makes me :D
		pane.add(imageView, 0, 0); // GRIDDDINGGGGGGGGGGG!!!!!!!!11!
		pane.add(imageView2, 1 , 0);
		pane.add(imageView3, 0, 1);
		pane.add(imageView4, 1, 1);
		
		Scene scene = new Scene(pane); // we gotta showstoppa... 
		primStage.setTitle("falgs wow");
		primStage.setScene(scene);
		primStage.show(); // we gotta present...
	}
	
	public static void main(String[] args) { // and that's how GUIs are born!
		launch(args);
	}
}
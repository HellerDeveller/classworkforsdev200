import java.util.*; // if you're an idiot, type 'javac %JAVA_FX% FinalProject.java'
import java.io.InputStream; // if you're still an idiot, search environment var for %JAVA_FX%
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Alert;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage; // if only there was a way to import all of this 
// in a single line of code but no ahaha java you so quirky

public class FinalProject extends Application { // main, technically
	@Override
	public void start(Stage primStage) { // scene setup
		Scene scene = new Scene(new GUI().getView());
		primStage.setTitle("Dumb Canvas");
		primStage.setScene(scene);
		primStage.setResizable(false);
		primStage.show();
	}
	
	public static void main(String[] args) { // main, literally
		launch(args);
		System.out.println(new GUI().outputTest()); // will print after window is closed, just to mess with you
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
	
	int pane_select = 0; // originally, i was going to have modules switch via variable. guess how well that went...
	
	public Parent getView() {
		GridPane pane = new GridPane();
		
		Rectangle sidebar = new Rectangle(0, 0, 40, 600); // green (sidebar)
		sidebar.setFill(Color.web("#006648"));
		sidebar.setStroke(Color.web("#006648"));
		
		Font btn_font = new Font("Helvetica", 15);
		
		Button home_button = new Button("homie"); // buttons
		home_button.setFont(btn_font);
		home_button.setMinWidth(135.0);
		
		Button modules_button = new Button("mods");
		modules_button.setFont(btn_font);
		modules_button.setMinWidth(135.0);
		
		Button assignments_button = new Button("AAAAAA AA A");
		assignments_button.setFont(btn_font);
		assignments_button.setMaxWidth(135.0);
		
		Button grades_button = new Button("systemic bullshiiiii");
		grades_button.setFont(btn_font);
		grades_button.setMaxWidth(135.0);
		
		Label course_sigil = new Label("777420 Hell 2"); // labels ahoy, in the order of appearance
		course_sigil.setFont(Font.font("Helvetica", FontWeight.NORMAL, FontPosture.ITALIC, 11));
		course_sigil.setTextFill(Color.GRAY);
		
		Label recent_announcements = new Label("buckle ur perchances ladies and seat belts... im taking you all for a ride"); // other announcements were supposed to be under here
		recent_announcements.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 20));
		
		Label course_label = new Label("BEEG200-DBZ-PP-777420-*.*.*"); // next to the three lines
		course_label.setFont(Font.font("Helvetica", FontWeight.NORMAL, FontPosture.REGULAR, 15));
		course_label.setTextFill(Color.web("#273540"));
		
		Label big_course_label = new Label("DBZ-Hell 2-Learn Denver Men he is come KOTA"); // terminal (as in, goofy ahh) title
		big_course_label.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 40));
		big_course_label.setTextFill(Color.GRAY);
		
		Label prof = new Label(""" 
		@@@@@@@@@@@@@@@@%..:%%@@@@@@@@@@@@@@@@@@@@@@
		@@@@@@@@@@@@@@@@@=......%=..%@@@@@@@@@@@@@@@
		@@@@@@@@@@@@@@@@@%#.#%%=..%=@@@@@@@@@@@@@@@@
		@@@@@@@@@@@@@@@@@%%#...@:.#@@@@@@@@@@@@@@@@@
		@@@@@@@@@@@@@@@@@@@%.....#@@@@@@@@@@@@@@@@@@
		@@@@@@@@@@@@@@@@%%%%%%%%%%%%@@@@@@@@@@@@@@@@
		@@@@@@@@@@@%%%%%%%%%%%%%%%%%%%%%%@@@@@@@@@@@
		@@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@@@
		@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@
		@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@
		@@@%%%%%%%%%%%%@%+========+%@%%%%%%%%%%%%@@@
		@@%%%%%%%%%%@+@=@===========+@=%%%%%%%%%%%@@
		@@%%%%%%%%@+@==%@=============@==@%%%%%%%%%@
		@%%%%%%%%@*@==#+@=============+@@@@%%%%%%%%@
		@%%%%%%%%%::::::::::::::::::::::::%%%%%%%%%@
		@%%%%%%%%*:::@@::::::::::::::@@::::%%%%%%%%%
		@%%%%%%%%::::@@::::::::::::::@@::::%%%%%%%%@
		@%%%%%%%%::::::::::::::::::::::::::#%%%%%%%@
		@@%%%%%%%::::::::::::::::::::::::::%%%%%%%@@
		@@@%%%%%%=:::::::::::::::::::::::::%%%%%%@@@
		@@@@%%%%%%::::::@@@@@@@@@@@@@:::::%%%%%%@@@@
		@@@@@@%%%%%%::::::::::::::::::::*%%%%%%@@@@@
		@@@@@@@@%%%%%%%::::::::::::::*%%%%%%@@@@@@@@
		@@@@@@@@@@@@%%%%%%%%%%%%%%%%%%%@@@@@@@@@@@@@
		"""); 
		prof.setFont(Font.font("Consolas", 8)); // that is Kota from the New Denpa Men. the game is notorious for its trainwreck english translation
		// ascii converter credit: https://codepen.io/Mikhail-Bespalov/pen/JoPqYrz
		
		Label course_desc = new Label("""
		Language is complexity. how can you reach understanding with many words and words? 
		Well do not get fear, help is away! Magister Senor Guudomann has responsibility for 
		eel hovercrafts and good elephant brothers! Learning the future consists language 
		interpreting, best use in fluidity, customer pregnancy is aimful. 
		
		It said within the now, lettuse try ! !!
		""");
		course_desc.setFont(Font.font(15)); // i wish to be a storyteller one day, but no one would understand them
		
		Label mod1 = new Label("Module 1: Unnecessary Introductions"); // module labels
		mod1.setFont(btn_font);
		Label mod2 = new Label("Module 2: Still hungover");
		mod2.setFont(btn_font);
		Label mod3 = new Label("Module 3: can you still count to 3? good cuz");
		mod3.setFont(btn_font);
		Label mod4 = new Label("Module 4: MIDTERMMMMM BIIIIIT-");
		mod4.setFont(btn_font);
		Label mod5 = new Label("Module 5: i hope you like work cuz you'd be swallowing my wide load");
		mod5.setFont(btn_font);
		Label mod6 = new Label("Module ^: it just never ends...");
		mod6.setFont(btn_font);
		Label mod7 = new Label("Module : i neEd a BReaK!!");
		mod7.setFont(btn_font);
		Label mod8 = new Label("Module e: AAAAAAAAAAAAAAAAAAAAAAA");
		mod8.setFont(btn_font);
		Label aaa = new Label("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		aaa.setFont(btn_font);
		
		Label secret = new Label("Degree please!\n(i have three wives to feed)"); // when i said i love everyone this isnt what i meant
		secret.setVisible(false);
		secret.setTextFill(Color.BLUE);
		secret.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 15));
		
		VBox box = new VBox(); // will not be changed
		box.getChildren().addAll(course_label, course_sigil, home_button, modules_button
			, assignments_button, grades_button, secret);
		box.setMargin(course_label, new Insets(0, 0, 25, 45)); //top left bottom right
		box.setMargin(course_sigil, new Insets(0, 0, 0, 47));
		box.setMargin(home_button, new Insets(0, 0, 0, 45));
		box.setMargin(modules_button, new Insets(0, 0, 0, 45));
		box.setMargin(assignments_button, new Insets(0, 0, 0, 45));
		box.setMargin(grades_button, new Insets(0, 0, 0, 45));
		box.setMargin(secret, new Insets(0, 0, 0, 45));
		
		VBox box2 = new VBox(); // home box
		box2.getChildren().addAll(recent_announcements, big_course_label, prof, course_desc);
		box2.setMargin(recent_announcements, new Insets(30, 0, 50, 0));
		box2.setMargin(big_course_label, new Insets(0, 20, 0, 0));
		box2.setMargin(prof, new Insets(0, 0, 0, 5));
		box2.setMargin(course_desc, new Insets(-260, 0, 0, 220));
		
		VBox box3 = new VBox(); // modules box
		box3.getChildren().addAll(mod1, mod2, mod3, mod4, mod5, mod6, mod7, mod8, aaa);
		box3.setSpacing(5);
		box3.setMargin(mod6, new Insets(0, 0, -15, 0));
		box3.setMargin(aaa, new Insets(-25, 0, 0, 0));
		
		pane.setAlignment(Pos.CENTER_LEFT); // grid setup (pane at top for button events to work)
		pane.add(sidebar, 0, 0);
		pane.add(box, 0, 0);
		pane.add(box2, 1, 0);

		EventHandler<ActionEvent> change_to_home = new EventHandler<ActionEvent>() { // button commands/events
			public void handle(ActionEvent e) { // these WILL prompt errors, but it still WORKS!
				pane.getChildren().remove(box3);
				pane.add(box2, 1, 0);
			}
		}; // so just ignore them for me please? :]
		home_button.setOnAction(change_to_home);
		
		EventHandler<ActionEvent> change_to_mod = new EventHandler<ActionEvent>() { // i would have them caught with try/catch...
			public void handle(ActionEvent e) { // but i can't, cuz return won't work
				pane.getChildren().remove(box2); // sad
				pane.add(box3, 1, 0);
			}
		};
		modules_button.setOnAction(change_to_mod);
		
		EventHandler<ActionEvent> change_to_ass = new EventHandler<ActionEvent>() { // i wish i can work 24/7
			public void handle(ActionEvent e) {
				Alert alert = new Alert(Alert.AlertType.WARNING);
				alert.setTitle("The joke(r) is me");
				alert.setHeaderText("10 missing assignments??");
				alert.setContentText("I have lost the game");
				alert.showAndWait();
			}
		};
		assignments_button.setOnAction(change_to_ass);
		
		EventHandler<ActionEvent> change_to_grade = new EventHandler<ActionEvent>() { // i wish i had more time
			public void handle(ActionEvent e) {
				box.getChildren().remove(grades_button);
				secret.setVisible(true);
			}
		};
		grades_button.setOnAction(change_to_grade);
		
		return pane;
	}
}

//pane.getChildren().removeIf(pane -> pane.getRowIndex(pane) == 1);
// suprise tool (ofc i cant figure out how to use it)

class Error extends Exception { // custom errors baby!
	public Error() {}
	
	public Error(String message) {
		super(message);
	}
}
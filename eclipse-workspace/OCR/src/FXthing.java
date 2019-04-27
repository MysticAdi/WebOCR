import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class FXthing extends Application {
 public static void main (String[] args)
 {
	 Application.launch(args);
 }

@Override
public void start(Stage stage) throws Exception {
	WebView myWebView = new WebView();
	WebEngine engine = myWebView.getEngine();
	
	
	Button btn = new Button("Let's Begin");
	btn.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			engine.load("http://localhost:8080//OCR");
		}
	});
	
	VBox root = new VBox();
	root.getChildren().addAll(myWebView,btn);
	
	Scene scene = new Scene(root,800,500);
	stage.setScene(scene);
	
	stage.show();
	
}
}

// Christopher Serrano 
// Professor Zareh (best Professor ever!)
// 03/17/23
// Drawing of Mickey Mouse but Gothic
//02_JavaFX_DrawShapes_v02

package drawShapesPKG;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DrawShapes extends Application {

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a circle and its properties
		Circle circle = new Circle ();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(3.0);
		circle.setFill(Color.BLUE);
		
		Rectangle r = new Rectangle();
		r.setX(250);
		r.setY(50);
		r.setWidth(200);
		r.setHeight(100);
		r.setArcWidth(20);
		r.setArcHeight(20);
		r.setFill(Color.RED);
		
		Circle MickeyHead = new Circle();
		MickeyHead.setCenterX(200);
		MickeyHead.setCenterY(350);
		MickeyHead.setRadius(100);
		MickeyHead.setStroke(Color.WHITE);
		MickeyHead.setStrokeWidth(3.0);
		MickeyHead.setFill(Color.BLACK);
		
		Circle ear1 = new Circle();
		ear1.setCenterX(130);
		ear1.setCenterY(250);
		ear1.setRadius(50);
		ear1.setStroke(Color.WHITE);
		ear1.setStrokeWidth(3.0);
		ear1.setFill(Color.BLACK);
		
		
		
		
		Circle ear2 = new Circle();
		ear2.setCenterX(270);
		ear2.setCenterY(250);
		ear2.setRadius(50);
		ear2.setStroke(Color.WHITE);
		ear2.setStrokeWidth(3.0);
		ear2.setFill(Color.BLACK);
		
		Circle eye1 = new Circle();
		eye1.setCenterX(240);
		eye1.setCenterY(350);
		eye1.setRadius(10);
		eye1.setStroke(Color.YELLOW);
		eye1.setStrokeWidth(3.0);
		eye1.setFill(Color.WHITE);
		
		Circle eye2 = new Circle ();
		eye2.setCenterX(160);
		eye2.setCenterY(350);
		eye2.setRadius(10);
		eye2.setStroke(Color.YELLOW);
		eye2.setStrokeWidth(3.0);
		eye2.setFill(Color.WHITE);
		
		Rectangle mouth = new Rectangle();
		mouth.setX(200);
		mouth.setY(330);
		mouth.setWidth(20);
		mouth.setHeight(200);
		mouth.setArcWidth(100);
		mouth.setArcHeight(300);
		mouth.setFill(Color.WHITE);
		
		
		
		
		
				
				
		
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		pane.getChildren().add(r);
		pane.getChildren().add(MickeyHead);
		pane.getChildren().add(ear1);
		pane.getChildren().add(ear2);
		pane.getChildren().add(eye1);
		pane.getChildren().add(eye2);
		pane.getChildren().add(mouth);
		
		
		
		Scene scene = new Scene(pane,500,500);
		primaryStage.setTitle("Draw Shapes");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
		

	}

}

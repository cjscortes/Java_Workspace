// Christopher Serrano
// Professor Zareh (Best Coding Professor ever!)
// 3/18/23
// 11_GUI_Elements_Calculator Pt1 + Pt2
// CIS016 
// Joke of the day: What did the programmer say to their boss? I need a Arrays! (a raise...) 

package myJavaFXpkg;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
    // all of this is from my files
    
    int secondNum = 0;
    int sum = 0;
    String logic = "";
    String text = "";
    Label myLabel = new Label();
    Button btnPlus = new Button("+");
    Button btnMinus = new Button("-");
    Button btnTimes = new Button("*");
    Button btnSeven = new Button("7");
    Button btnEight = new Button("8");
    Button btnNine = new Button("9");
    Button btnSix = new Button("6");
    Button btnFive = new Button("5");
    Button btnFour = new Button("4");
    Button btnThree = new Button("3");
    Button btnTwo = new Button("2");
    Button btnOne = new Button("1");
    Button btnEqual = new Button("=");
    Button btnDivide = new Button("DIVIDE");
    Button btnZero = new Button("0");
    Button btnClear = new Button("CLEAR");
    

    // hopefully these work here since myLabel is not defined until later on
    public void setLabel(int input) {
        if (text.length() < 21) {
            text += Integer.toString(input);
        }
        myLabel.setText(text);
    }

    public void resetLabel() {
        secondNum = 0;
        sum = 0;
        text = "";
        logic = "";
        myLabel.setText(text);
        resetHighlight();
    }

    public void resetHighlight() {
        btnPlus.setStyle("-fx-border-color: none;");
        btnMinus.setStyle("-fx-border-color: none;");
        btnDivide.setStyle("-fx-border-color: none;");
        btnTimes.setStyle("-fx-border-color: none;");
        btnClear.setStyle("fx-border-color:none;");
        
        	
    }

    public void percent() {
        double temp = Double.parseDouble(text);
        double per = temp / 100;
        String cent = Double.toString(per);
        text = "";
        myLabel.setText(cent);
    }

    public void switchSign() {
        if (myLabel.getText() == "") {
            return;
        }
        else {
            int num = Integer.parseInt(myLabel.getText());
            num *= -1;
            text = "";
            setLabel(num);
        }
    }

    public void add() {
        if (myLabel.getText() == "") {
            return;
        }
        else {
            sum = Integer.parseInt(myLabel.getText());
            text = "";
            logic = "add";
            btnPlus.setStyle("-fx-border-color: blue;");
            btnMinus.setStyle("-fx-border-color: none;");
            btnDivide.setStyle("-fx-border-color: none;");
            btnTimes.setStyle("-fx-border-color: none;");
            
            
            btnClear.setDisable(false);
            btnEqual.setDisable(false);
            btnPlus.setDisable(true);
        }
    }

    public void subtract() {
        if (myLabel.getText() == "") {
            return;
        }
        else {
            sum = Integer.parseInt(myLabel.getText());
            text = "";
            logic = "subtract";
            btnMinus.setStyle("-fx-border-color: blue;");
            btnPlus.setStyle("-fx-border-color: none;");
            btnDivide.setStyle("-fx-border-color: none;");
            btnTimes.setStyle("-fx-border-color: none;");
            
            btnClear.setDisable(false);
            btnEqual.setDisable(false);
            btnMinus.setDisable(true);
        }
    }

    public void multiply() {
        if (myLabel.getText() == "") {
            return;
        }
        else {
            sum = Integer.parseInt(myLabel.getText());
            text = "";
            logic = "multiply";
            btnTimes.setStyle("-fx-border-color: blue;");
            btnPlus.setStyle("-fx-border-color: none;");
            btnMinus.setStyle("-fx-border-color: none;");
            btnDivide.setStyle("-fx-border-color: none;");

            btnClear.setDisable(false);
            btnEqual.setDisable(false);
            btnTimes.setDisable(true);
        }
    }

    public void divide() {
        if (myLabel.getText() == "") {
            return;
        }
        else {
            sum = Integer.parseInt(myLabel.getText());
            text = "";
            logic = "divide";
            btnDivide.setStyle("-fx-border-color: blue;");
            btnPlus.setStyle("-fx-border-color: none;");
            btnMinus.setStyle("-fx-border-color: none;");
            btnTimes.setStyle("-fx-border-color: none;");
            
            
            btnClear.setDisable(false);
            btnEqual.setDisable(false);
            btnDivide.setDisable(true);
        }
    }

    public void equals() {
        if (myLabel.getText() == "") {
            return;
        }
        else {
            secondNum = Integer.parseInt(myLabel.getText());
            text = "";
            resetHighlight();

            switch(logic) {
                case "add":
                    sum += secondNum;
                    setLabel(sum);
                    break;
                case "subtract":
                    sum -= secondNum;
                    setLabel(sum);
                    break;
                case "multiply":
                    sum *= secondNum;
                    setLabel(sum);
                    break;
                case "divide":
                    try {
                        sum = quotient(sum, secondNum);
                        setLabel(sum);
                    }
                    catch (ArithmeticException ex) {
                        myLabel.setText("CANNOT DIVIDE BY ZERO");
                    }
                    break;

            }
        }

        text = "";
        btnEqual.setDisable(true);
        btnPlus.setDisable(false);
        btnMinus.setDisable(false);
        btnTimes.setDisable(false);
        btnDivide.setDisable(false);
        btnClear.setDisable(false);
    }

    public static int quotient(int number1, int number2) {
        if (number2 == 0) throw new ArithmeticException("Cannot divide by zero");

        return number1 / number2;
    }

	
    
    
   
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		// creates   a main pane to contain all parts of your code 
		Pane pane = new Pane();
		myLabel.setFont(Font.font("Impact", FontWeight.BOLD,FontPosture.REGULAR,20));
		myLabel.setStyle("-fx-border-color:yellow;");
		myLabel.setAlignment(Pos.BASELINE_RIGHT);
		myLabel.setLayoutX(10);
		myLabel.setLayoutY(10);
		myLabel.setPrefSize(250,20);
		myLabel.setText("123456789");
		pane.getChildren().add(myLabel);
		myLabel.setText(Double.toString(sum));
		

		
		// creating a GridPane for the button of the calculator 
		GridPane gridPane = new GridPane(); //
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		// sets all the buttons at the center for the GridPane 
		
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPrefSize(250, 20);
		
		gridPane.setLayoutX(10);
		gridPane.setLayoutY(60);
		
		
		//Anything below this statement will create the buttons of the calculator 
		//ROW One for Calculator 
	    gridPane.add(btnPlus, 0, 0);
	    gridPane.add(btnMinus, 1, 0);
	    gridPane.add(btnTimes, 2, 0);
	    gridPane.add(btnClear, 3, 0);
	    
	    //Row two for Calculator 
	    gridPane.add(btnSeven, 2, 1);
	    gridPane.add(btnEight,1,1);
	    gridPane.add(btnNine, 0, 1);
	    
	    //Row Three for calculator 
	    gridPane.add(btnSix, 2, 2);
	    gridPane.add(btnFive, 1, 2);
	    gridPane.add(btnFour, 0, 2);
	    
	    //Row Four for Calculator 
	    gridPane.add(btnThree, 2, 3);
	    gridPane.add(btnTwo, 1, 3);
	    gridPane.add(btnOne, 0, 3);
	    
	    //Row Five for calculator 
	    gridPane.add(btnEqual, 2, 4);  // LOOK HERE!!! On your file it was 2,0 so it was on top of the multiply button
	    gridPane.add(btnDivide, 1, 4);
	    gridPane.add(btnZero, 0, 4);
	    
	    
	    // set size for all the buttons 
	    btnPlus.setPrefSize(90, 30);
	    btnMinus.setPrefSize(90, 30);
	    btnTimes.setPrefSize(90, 30);
	    btnDivide.setPrefSize(90,30);
	    btnZero.setPrefSize(90, 30);
	    btnOne.setPrefSize(90, 30);
	    btnTwo.setPrefSize(90,30);
	    btnThree.setPrefSize(90, 30);
	    btnFour.setPrefSize(90, 30);
	    btnFive.setPrefSize(90, 30);
	    btnSix.setPrefSize(90, 30);
	    btnSeven.setPrefSize(90,30);
	    btnEight.setPrefSize(90, 30);
	    btnNine.setPrefSize(90,30);
	    btnEqual.setPrefSize(90, 30);
	    btnClear.setPrefSize(90, 30);
	    
	    
	    
	    // setting fonts for all the buttons, change it to ones likings, be creative 
	    btnPlus.setFont(Font.font("Impact",FontWeight.EXTRA_BOLD,FontPosture.REGULAR,14));
	    btnMinus.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 14));
	    btnTimes.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnDivide.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnZero.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnOne.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnTwo.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnThree.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnFour.setFont(Font.font("Impact",FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnFive.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnSix.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnSeven.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnEight.setFont(Font.font("Impact",FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnNine.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
	    btnEqual.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
        btnClear.setFont(Font.font("Impact", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,14));
		
		pane.getChildren().add(gridPane);



       // getting the buttons to function
        
        btnOne.setOnAction(e -> {
            setLabel(1);
        });
        btnTwo.setOnAction(e -> {
            setLabel(2);
        });
        btnThree.setOnAction(e -> {
            setLabel(3);
        });
        btnFour.setOnAction(e -> {
            setLabel(4);
        });
        btnFive.setOnAction(e -> {
            setLabel(5);
        });
        btnSix.setOnAction(e -> {
            setLabel(6);
        });
        btnSeven.setOnAction(e -> {
            setLabel(7);
        });
        btnEight.setOnAction(e -> {
            setLabel(8);
        });
        btnNine.setOnAction(e -> {
            setLabel(9);
        });
        btnZero.setOnAction(e -> {
            setLabel(0);
        });
        btnPlus.setOnAction(e -> {
            add();
        });
        btnMinus.setOnAction(e -> {
            subtract();
        });
        btnTimes.setOnAction(e -> {
            multiply();
        });
        btnDivide.setOnAction(e -> {
            divide();
        });
        btnEqual.setOnAction(e -> {
            equals();
        });
       // btnSign.setOnAction(e -> {
         //   switchSign();
       // });
        btnClear.setOnAction(e -> {
           resetLabel();
       });


        

		
        
		
	///
        
		Scene scene = new Scene(pane,280,250);
		primaryStage.setTitle("MyJAVAFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}

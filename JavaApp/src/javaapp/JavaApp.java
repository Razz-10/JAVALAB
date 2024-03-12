package javaapp;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaApp extends Application {

    private TextField num1Field;
    private TextField num2Field;
    private Label resultLabel;
    private int num1, num2;

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        Label num1Label = new Label("Number 1:");
        num1Field = new TextField();
        grid.add(num1Label, 0, 0);
        grid.add(num1Field, 1, 0);

        Label num2Label = new Label("Number 2:");
        num2Field = new TextField();
        grid.add(num2Label, 0, 1);
        grid.add(num2Field, 1, 1);

        Button calculateButton = new Button("Calculate");
        calculateButton.setOnMousePressed(e -> addNumbers());
        calculateButton.setOnMouseReleased(e -> subtractNumbers());
        grid.add(calculateButton, 0, 2, 2, 1);

        resultLabel = new Label();
        grid.add(resultLabel, 0, 3, 2, 1);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add and Subtract Calculator");
        primaryStage.show();
    }

    private void addNumbers() {
        try {
            num1 = Integer.parseInt(num1Field.getText());
            num2 = Integer.parseInt(num2Field.getText());
            int result = num1 + num2;
            resultLabel.setText("Result (Add): " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter integers.");
        }
    }

    private void subtractNumbers() {
        try {
            num1 = Integer.parseInt(num1Field.getText());
            num2 = Integer.parseInt(num2Field.getText());
            int result = num1 - num2;
            resultLabel.setText("Result (Subtract): " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter integers.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

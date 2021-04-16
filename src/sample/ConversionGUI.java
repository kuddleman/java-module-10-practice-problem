package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class ConversionGUI extends Application {

    private TextField inputField;
    private Button convertButton;
    private ComboBox<ConversionType> conversionTypeBox;
    private Text resultText;

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.setProperty("glass.accessible.force", "false");

        VBox primaryBox = new VBox();
        primaryBox.setAlignment(Pos.CENTER);
        primaryBox.setSpacing(20);
        primaryBox.setStyle("-fx-background-color: white");

        conversionTypeBox = new ComboBox<ConversionType>();
        ConversionType[] conversionTypeValues = ConversionType.values();
        for(ConversionType type : conversionTypeValues) {
            conversionTypeBox.getItems().add(type);
        }
        primaryBox.getChildren().add(conversionTypeBox);

        Text inputLabel = new Text("Enter the input value:");
        inputField = new TextField();
        inputField.setMaxWidth(100);
        VBox inputBox = new VBox(inputLabel, inputField);
        inputBox.setAlignment(Pos.CENTER);
        inputBox.setSpacing(20);

    }


    public static void main(String[] args) {
        launch(args);
    }
}

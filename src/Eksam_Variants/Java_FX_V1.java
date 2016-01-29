package Eksam_Variants;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by emaktse on 29.01.2016.
 */
/**
 * Joonista ring, mille suurust saab kasutaja Slideriga muuta
 */
    public class Java_FX_V1 extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
            Stage window1 = new Stage();
            VBox vBox = new VBox(40);
            vBox.setAlignment(Pos.CENTER);

            Circle circle = new Circle(50);
            circle.setStroke(Color.RED);
            circle.setFill(Color.WHITE);
            circle.setStrokeWidth(5);

            Slider slider = new Slider();
            slider.setMin(50);
            slider.setMax(200);
            slider.setShowTickMarks(true);
            slider.setShowTickLabels(true);
            slider.setMajorTickUnit(50);
            slider.setMinorTickCount(5);
            slider.valueProperty().addListener((observable, args1, args2) ->{
                circle.setRadius(slider.getValue());
            });

            vBox.getChildren().addAll(circle, slider);
            Scene scene1 = new Scene(vBox,800, 600);
            window1.setScene(scene1);
            window1.show();
        }
}

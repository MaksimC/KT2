package Eksam_Variants;

/**
 * Created by emaktse on 29.01.2016.
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Joonista Ellipse, mille ringjoone paksust saab kasutaja slideriga muuta.
 */
public class JavaFX_V2 extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window1 = new Stage();
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);

        Ellipse ellipse = new Ellipse(150, 100);
        ellipse.setCenterX(100);
        ellipse.setCenterY(100);
        ellipse.setStroke(Color.RED);
        ellipse.setFill(Color.WHITE);

        Slider slider = new Slider();
        slider.setMin(1);
        slider.setMax(100);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(10);
        slider.setMinorTickCount(5);

        slider.valueProperty().addListener((observable, args1, args2) -> {
            ellipse.setStrokeWidth(slider.getValue());
        });


        vbox.getChildren().addAll(ellipse, slider);
        Scene scene1 = new Scene(vbox, 800, 600);
        window1.setScene(scene1);
        window1.show();
    }
}

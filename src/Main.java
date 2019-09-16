import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main<Board> extends Application {

    private static final String BLANK_STRING = " ";

    private List<HBox> hBoxes = new ArrayList<>();
    private List<Label> allLabels = new ArrayList<>();
    private int gridSize = 3;
    private double spacingSize = 15;
    private double tileSize = 100;

    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("2048");

        VBox root = new VBox();
        root.setSpacing(spacingSize);
        root.setPadding(new Insets(spacingSize));
        HBox hbox;
        for(int i = 0; i < gridSize; i++) {
            hbox = getNewHboxWithTiles();
            hbox.setSpacing(spacingSize);
            hBoxes.add(hbox);
        }
        root.getChildren().addAll(hBoxes);

        Scene scene = new Scene(root);
        scene.getStylesheets().add("board.css");
        stage.setScene(scene);
        stage.show();
    }

    private HBox getNewHboxWithTiles() {
        HBox row = new HBox();
        Label label;
        List<Label> labels = new ArrayList<>();
        for(int i = 0; i < gridSize; i++){
            label = new Label(BLANK_STRING);
            label.setPrefSize(tileSize, tileSize);
            labels.add(label);
        }
        row.getChildren().addAll(labels);
        allLabels.addAll(labels);
        return row;
    }

    public static void main(String[] args) {
        launch(args);
    }

}

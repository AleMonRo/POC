import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main<Board> extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("2048");
        //stage.setWidth(400);
        //stage.setHeight(500);

        VBox root = new VBox();
        root.setSpacing(20);
        HBox c1 = new HBox();
        c1.setSpacing(25);
        HBox c2 = new HBox();
        c2.setSpacing(25);
        HBox c3 = new HBox();
        c3.setSpacing(25);

        Label t1 = new Label("A");
        Label t2 = new Label("A");
        Label t3 = new Label("A");
        c1.getChildren().addAll(t1, t2, t3);
        Label t4 = new Label("A");
        //t4.setText("65");
        //t4
        Label t5 = new Label("A");
        Label t6 = new Label("A");
        c2.getChildren().addAll(t4, t5, t6);
        Label t7 = new Label("A");
        Label t8 = new Label("A");
        Label t9 = new Label("A");
        c3.getChildren().addAll(t7, t8, t9);

        root.getChildren().addAll(c1, c2, c3);

        Scene scene = new Scene(root);
        scene.getStylesheets().add("board.css");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}

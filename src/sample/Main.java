package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    final Pane root = new Pane();
    final VBox boxOne = new VBox();

    public Pane getRoot(){
        return root;
    }

    public VBox getBoxOne(){
        return boxOne;
    }


    @Override
    public void start(Stage primaryStage) {

        final ImageView image = new ImageView("sample/bg.png");
        image.setLayoutX(500);
        image.setLayoutY(300);
        root.getChildren().add(boxOne);
        root.getChildren().add(image);
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

        //Start running:
        starter();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void starter(){
        BackGround background = new BackGround();
        background.backgroundMotion();
    }
}  
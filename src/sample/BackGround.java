package sample;

import javafx.scene.image.ImageView;

/**
 * Created by ROSA on 4/5/16.
 */
public class BackGround {

    final ImageView image = new ImageView("http://www.oracle.com/ocom/groups/public/@otn/documents/digitalasset/1917282.jpg");
    Main main;

    public void backgroundMotion(){
        image.setLayoutX(200);
        image.setLayoutY(300);
        main.getRoot().getChildren().add(main.getBoxOne());
    }


}

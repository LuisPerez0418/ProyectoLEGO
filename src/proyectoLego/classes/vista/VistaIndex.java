package vista;

// @author elias

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class VistaIndex extends Application {

     @Override
    public void start(Stage primarystage) throws Exception {
         try {
            FXMLLoader loader= new FXMLLoader(getClass()
                    .getResource("/vista/index.fxml"));
         Parent parent =loader.load();
        Scene scene = new Scene(parent);
        primarystage.initStyle(StageStyle.TRANSPARENT);
        primarystage.setScene(scene);
    
        primarystage.show();
        } catch (Exception e) {
             System.out.println(e);
        }
    }
     public static void main(String[] args) {
        launch(args);
    }

}
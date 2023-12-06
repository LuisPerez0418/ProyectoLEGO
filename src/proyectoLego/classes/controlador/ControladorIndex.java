package controlador;

import java.io.IOException;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class ControladorIndex {
    @FXML
    private AnchorPane AnchorPaneBackground;

    @FXML
    private AnchorPane anchoPane;

    @FXML
    private AnchorPane AnchorPaneNav;
    
     @FXML
    private AnchorPane AnchorPaneVistas;
   
    @FXML
    private Button buttonMRU;

    @FXML
    private Button buttonTiroParabolico;
    
      @FXML
    void cargarMRU(MouseEvent event) throws IOException {
        AnchorPane secondFXML = FXMLLoader.load(getClass().
                getResource("/vista/MRU.fxml"));
        AnchorPaneVistas.getChildren().setAll(secondFXML);
       
    }
    @FXML
    void cargarTiroParabolico(MouseEvent event)throws IOException{
        AnchorPane secondFXML = FXMLLoader.load
        (getClass().getResource("/vista/TiroParabolico.fxml"));
        AnchorPaneVistas.getChildren().setAll(secondFXML);
    }
    
}

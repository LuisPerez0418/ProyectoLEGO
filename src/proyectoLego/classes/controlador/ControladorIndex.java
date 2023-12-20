package controlador;

import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

public class ControladorIndex {

    @FXML
    private Tab tabCaidaLibre;
    @FXML
    private Tab tabMRU;
    @FXML
    private Tab tabTiroParabolico;

    @FXML
    private AnchorPane anchorPaneVistasMRU;
    @FXML
    private AnchorPane anchorPaneVistasTiroParabolico;
    @FXML
    private AnchorPane anchorPaneVistasCaidaLibre;

    @FXML
    void cargarContenido(Event event) throws IOException {
        Tab selectedTab = (Tab) event.getSource();

        if (selectedTab == tabMRU) {
            cargarFXML("/Vista/MRU.fxml", anchorPaneVistasMRU);
        } else if (selectedTab == tabTiroParabolico) {
            cargarFXML("/Vista/TiroParabolico.fxml", anchorPaneVistasTiroParabolico);
        } else if (selectedTab == tabCaidaLibre) {
            cargarFXML("/Vista/CaidaLibre.fxml", anchorPaneVistasCaidaLibre);
        }
    }

    private void cargarFXML(String fxmlPath, AnchorPane anchorPane) throws IOException {
        AnchorPane content = FXMLLoader.load(getClass().getResource(fxmlPath));
        anchorPane.getChildren().setAll(content);
    }
}

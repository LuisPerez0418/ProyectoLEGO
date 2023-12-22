package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import modelo.ModeloMovRecUni;

public class ControladorMRU {

    private modelo.ModeloMovRecUni mru;
    @FXML
    private AnchorPane anchorPaneMRU;

    //----- FXML calcular velocidad -----//
    @FXML
    private TabPane tabMRU;

    @FXML
    private ComboBox<?> comboPosFInal;
    @FXML
    private ComboBox<?> comboPosInicial;
    @FXML
    private ComboBox<?> comboTiempoFinal;
    @FXML
    private ComboBox<?> comboTiempoInicial;

    @FXML
    private Label labelPosFinal;
    @FXML
    private Label labelPosInicial;
    @FXML
    private Label labelTiempoFinal;
    @FXML
    private Label labelTiempoInicial;
    @FXML
    private Label labelRespuesta;
    
    @FXML
    private TextField textPosFinal;
    @FXML
    private TextField textPosInicial;
    @FXML
    private TextField textTiempoFinal;
    @FXML
    private TextField textTiempoInicial;

    @FXML
    private Button buttonCalcularVelocidad;
    @FXML
    private Button buttonLimpiar;

    @FXML
    void setOnActionButtonCalcularVelocidad(ActionEvent event) {
        double tiempoFinal;
        double tiempoInicial;
        double posFinal;
        double posInicial;
        try {
            tiempoFinal = Double.parseDouble(textTiempoFinal.getText());
            tiempoInicial = Double.parseDouble(textTiempoInicial.getText());
            posFinal = Double.parseDouble(textPosFinal.getText());
            posInicial = Double.parseDouble(textPosInicial.getText());
            mru = new ModeloMovRecUni(tiempoInicial, tiempoFinal, 0, posInicial, posFinal);
            
            labelRespuesta.setText(mru.calcularVelocidad() + " m/s");
        } catch (Exception e) {
        }
    }
    
    @FXML
    void setOnActionButtonLimpiar(ActionEvent event) {
        textPosFinal.setText("");
        textPosInicial.setText("");
        textTiempoFinal.setText("");
        textTiempoInicial.setText("");
        labelRespuesta.setText("");
    }
    //----- FXML calcular distancia -----//
    //----- FXML calcular tiempo -----//
}

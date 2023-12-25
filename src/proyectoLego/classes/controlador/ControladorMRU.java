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
    @FXML
    private TabPane tabMRU;
    //----- FXML calcular velocidad -----//
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
        double posInicial;
        double posFinal;
        double tiempoInicial;
        double tiempoFinal; 
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
    @FXML
    private Button buttonCalcularDistancia;
    @FXML
    private Button buttonLimpiarD;

    @FXML
    private ComboBox<?> comboVelocidadD;
    @FXML
    private ComboBox<?> comboPosInicialD;
    @FXML
    private ComboBox<?> comboTiempoFinalD;
    @FXML
    private ComboBox<?> comboTiempoInicialD;
    
    @FXML
    private Label labelPosFinalD;
    @FXML
    private Label labelPosInicialD;
    @FXML
    private Label labelRespuestaD;
    @FXML
    private Label labelTiempoFinalD;
    @FXML
    private Label labelTiempoInicialD;
    
    @FXML
    private TextField textVelocidadD;
    @FXML
    private TextField textPosInicialD;
    @FXML
    private TextField textTiempoFinalD;
    @FXML
    private TextField textTiempoInicialD;

    @FXML
    void setOnActionButtonCalcularDistancia(ActionEvent event) {
        double posInicial;
        double velocidad;
        double tiempoFinal;
        double tiempoInicial;
        try {
            tiempoFinal = Double.parseDouble(textTiempoFinalD.getText());
            tiempoInicial = Double.parseDouble(textTiempoInicialD.getText());
            velocidad = Double.parseDouble(textVelocidadD.getText());
            posInicial = Double.parseDouble(textPosInicialD.getText());
            mru = new ModeloMovRecUni(tiempoInicial, tiempoFinal, velocidad, posInicial, 0);

            labelRespuesta.setText(mru.calcularVelocidad() + " m/s");
        } catch (Exception e) {
        }
    }

    @FXML
    void setOnActionButtonLimpiarD(ActionEvent event) {
        textVelocidadD.setText("");
        textPosInicialD.setText("");
        textTiempoFinalD.setText("");
        textTiempoInicialD.setText("");
        labelRespuestaD.setText("");
    }

//----- FXML calcular tiempo -----//
    @FXML
    private Button buttonCalcularTiempo;
    @FXML
    private Button buttonLimpiarT;

    @FXML
    private ComboBox<?> comboPosFinalT;
    @FXML
    private ComboBox<?> comboPosInicialT;
    @FXML
    private ComboBox<?> comboVelocidadT;
    
    @FXML
    private Label labelPosFinalT;
    @FXML
    private Label labelPosInicialT;
    @FXML
    private Label labelRespuestaT;
    @FXML
    private Label labelVelocidadT;
    
    @FXML
    private TextField textPosFinalT;
    @FXML
    private TextField textPosInicialT;
    @FXML
    private TextField textVelocidadT;


    @FXML
    void setOnActionButtonCalcularTiempo(ActionEvent event) {
        double posInicial;
        double posFinal;
        double velocidad;
        try {
            posInicial = Double.parseDouble(textPosInicialT.getText());
            posFinal = Double.parseDouble(textPosFinalT.getText());
            velocidad = Double.parseDouble(textVelocidadT.getText());
            
            mru = new ModeloMovRecUni(0, 0, velocidad, posInicial, posFinal);

            labelRespuesta.setText(mru.calcularTiempo() + " m/s");
        } catch (Exception e) {
        }
    }

    @FXML
    void setOnActionButtonLimpiarT(ActionEvent event) {
        textVelocidadT.setText("");
        textPosInicialT.setText("");
        textPosFinalT.setText("");
        labelRespuestaT.setText("");
    }
}

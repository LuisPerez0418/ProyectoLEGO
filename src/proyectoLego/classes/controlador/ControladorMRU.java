package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import modelo.ModeloMensaje;
import modelo.ModeloMovRecUni;
import modelo.convertidor.ModeloLongitud;
import modelo.convertidor.ModeloTiempo;
import modelo.convertidor.ModeloUnidades;
import modelo.convertidor.ModeloVelocidad;

public class ControladorMRU implements Initializable {

    private modelo.ModeloMovRecUni mru = new ModeloMovRecUni();
    private ModeloTiempo mt = new ModeloTiempo();
    private ModeloLongitud ml = new ModeloLongitud();
    private ModeloVelocidad mv = new ModeloVelocidad();
    private ModeloUnidades unidades = new ModeloUnidades();
    private ModeloMensaje mensaje = new ModeloMensaje();

    @FXML
    private AnchorPane anchorPaneMRU;
    @FXML
    private TabPane tabMRU;
    //----- FXML calcular velocidad -----//
    @FXML
    private ComboBox<String> comboPosFinal;
    @FXML
    private ComboBox<String> comboPosInicial;
    @FXML
    private ComboBox<String> comboTiempoFinal;
    @FXML
    private ComboBox<String> comboTiempoInicial;

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
            tiempoInicial = mt.convertirTiempo(Double.parseDouble(textTiempoInicial.getText()),
                    comboTiempoInicial.getSelectionModel().getSelectedItem());
            tiempoFinal = mt.convertirTiempo(Double.parseDouble(textTiempoFinal.getText()),
                    comboTiempoInicial.getSelectionModel().getSelectedItem());
            posInicial = ml.convertirLongitud(Double.parseDouble(textPosInicial.getText()),
                    comboPosInicial.getSelectionModel().getSelectedItem());
            posFinal = ml.convertirLongitud(Double.parseDouble(textPosFinal.getText()),
                    comboPosFinal.getSelectionModel().getSelectedItem());
            mru = new ModeloMovRecUni(tiempoInicial, tiempoFinal, 0, posInicial, posFinal);
            mensaje.mostrar("Velocidad calculada. \n" + mru.calcularVelocidad() + "m/s");
            labelRespuesta.setText(mru.calcularVelocidad() + " m/s");
        } catch (Exception e) {
            mensaje.mostrarError("Debe rellenar todos los campos para continuar.");
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
    private ComboBox<String> comboVelocidadD;
    @FXML
    private ComboBox<String> comboPosInicialD;
    @FXML
    private ComboBox<String> comboTiempoFinalD;
    @FXML
    private ComboBox<String> comboTiempoInicialD;

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
            tiempoInicial = mt.convertirTiempo(Double.parseDouble(textTiempoInicialD.getText()),
                    comboTiempoInicialD.getSelectionModel().getSelectedItem());
            tiempoFinal = mt.convertirTiempo(Double.parseDouble(textTiempoFinalD.getText()),
                    comboTiempoInicialD.getSelectionModel().getSelectedItem());
            posInicial = ml.convertirLongitud(Double.parseDouble(textPosInicialD.getText()),
                    comboPosInicialD.getSelectionModel().getSelectedItem());
            velocidad = mv.convertirVelocidad(Double.parseDouble(textVelocidadD.getText()),
                    comboVelocidadD.getSelectionModel().getSelectedItem());
            mru = new ModeloMovRecUni(tiempoInicial, tiempoFinal, velocidad, posInicial, 0);
            mensaje.mostrar("Distancia calculada. \n" + mru.calcularPosicion()+ "m");
            labelRespuesta.setText(mru.calcularPosicion()+ " m");
        } catch (Exception e) {
            mensaje.mostrarError("Debe rellenar todos los campos para continuar.");
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
    private ComboBox<String> comboPosFinalT;
    @FXML
    private ComboBox<String> comboPosInicialT;
    @FXML
    private ComboBox<String> comboVelocidadT;

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
            posInicial = ml.convertirLongitud(Double.parseDouble(textPosInicialT.getText()),
                    comboPosInicialT.getSelectionModel().getSelectedItem());
            posFinal = ml.convertirLongitud(Double.parseDouble(textPosFinalT.getText()),
                    comboPosFinalT.getSelectionModel().getSelectedItem());
            velocidad = mv.convertirVelocidad(Double.parseDouble(textVelocidadT.getText()),
                    comboVelocidadT.getSelectionModel().getSelectedItem());
            mru = new ModeloMovRecUni(0, 0, velocidad, posInicial, posFinal);

            mensaje.mostrar("Distancia calculada. \n" + mru.calcularPosicion()+ "m");
            labelRespuesta.setText(mru.calcularPosicion()+ " m");
        } catch (Exception e) {
            mensaje.mostrarError("Debe rellenar todos los campos para continuar.");
        }
    }

    @FXML
    void setOnActionButtonLimpiarT(ActionEvent event) {
        textVelocidadT.setText("");
        textPosInicialT.setText("");
        textPosFinalT.setText("");
        labelRespuestaT.setText("");
    }

    //----- inicializador de los comboBox -----//
    public void initialize(URL url, ResourceBundle rb) {
        comboPosInicial.getItems().addAll(unidades.getValorLongitud());
        comboPosInicialD.getItems().addAll(unidades.getValorLongitud());
        comboPosInicialT.getItems().addAll(unidades.getValorLongitud());
        comboPosFinal.getItems().addAll(unidades.getValorLongitud());
        comboPosFinalT.getItems().addAll(unidades.getValorLongitud());
        comboVelocidadD.getItems().addAll(unidades.getValorVelocidad());
        comboVelocidadT.getItems().addAll(unidades.getValorVelocidad());
        comboTiempoInicial.getItems().addAll(unidades.getValorTiempo());
        comboTiempoInicialD.getItems().addAll(unidades.getValorTiempo());
        comboTiempoFinal.getItems().addAll(unidades.getValorTiempo());
        comboTiempoFinalD.getItems().addAll(unidades.getValorTiempo());
    }

}

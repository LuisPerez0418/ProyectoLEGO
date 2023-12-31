package modelo;

import javafx.scene.control.Alert;

public class ModeloMensaje {

    private Alert alerta;

    public ModeloMensaje() {
        alerta = new Alert(Alert.AlertType.NONE);
    }

    public void mostrar(String Mensaje) {
        alerta.setAlertType(Alert.AlertType.INFORMATION);
        alerta.setContentText(Mensaje);
        alerta.show();
    }
    
    public void mostrarError(String Mensaje) {
        alerta.setAlertType(Alert.AlertType.ERROR);
        alerta.setContentText(Mensaje);
        alerta.show();
    }

    public void mostrar(Exception e) {
        alerta.setAlertType(Alert.AlertType.ERROR);
        alerta.setContentText(e.getMessage());
        alerta.show();

    }

}

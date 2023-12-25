package modelo.convertidor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ModeloUnidades {

    private ObservableList<String> aceleracion
            = FXCollections.observableArrayList("m/s^2");
    private ObservableList<String> angulo
            = FXCollections.observableArrayList("grados", "rad", "vueltas");
    private ObservableList<String> longitud
            = FXCollections.observableArrayList("cm", "m", "km", "mi");
    private ObservableList<String> tiempo
            = FXCollections.observableArrayList("s", "min", "h");
    private ObservableList<String> velocidad
            = FXCollections.observableArrayList("m/s", "km/h");
    
    //----- getters -----//
    public ObservableList<String> getValorAceleracion() {
        return aceleracion;
    }
    
    public ObservableList<String> getValorAngulo() {
        return angulo;
    }
    
    public ObservableList<String> getValorLongitud() {
        return longitud;
    }
    
    public ObservableList<String> getValorTiempo() {
        return tiempo;
    }
    
    public ObservableList<String> getValorVelocidad() {
        return velocidad;
    }

}

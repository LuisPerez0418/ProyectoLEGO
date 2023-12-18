package modelo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ModeloCaidaLibre {

    private DoubleProperty velocidadInicial = new SimpleDoubleProperty();
    private DoubleProperty velocidadFinal = new SimpleDoubleProperty();
    private DoubleProperty altura = new SimpleDoubleProperty();
    private DoubleProperty tiempo = new SimpleDoubleProperty();
    private DoubleProperty tiempoDCaida = new SimpleDoubleProperty();
    private DoubleProperty gravedad = new SimpleDoubleProperty();

    public void ModeloCaidaLibre() {

    }

    public void ModeloCaidaLibre(double velocidadInicial,
            double velocidadFinal, double altura, double tiempo,
            double tiempoDCaida, double gravedad) {
        setVelocidadInicial(velocidadInicial);
        setVelocidadFinal(velocidadFinal);
        setAltura(altura);
        setTiempo(tiempo);
        setTiempoDCaida(tiempoDCaida);
        setGravedad(gravedad);

    }

    //----- Métodos setters and getters -----//
    public double getVelocidadInicial() {
        return velocidadInicial.get();
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial.set(velocidadInicial);
    }

    public double getVelocidadFinal() {
        return velocidadFinal.get();
    }

    public void setVelocidadFinal(double velocidadFinal) {
        this.velocidadFinal.set(velocidadFinal);
    }

    public double getAltura() {
        return altura.get();
    }

    public void setAltura(double altura) {
        this.altura.set(altura);
    }

    public double getTiempo() {
        return tiempo.get();
    }

    public void setTiempo(double tiempo) {
        this.tiempo.set(tiempo);
    }

    public double getTiempoDCaida() {
        return tiempoDCaida.get();
    }

    public void setTiempoDCaida(double tiempoDCaida) {
        this.tiempoDCaida.set(tiempoDCaida);
    }

    public double getGravedad() {
        return gravedad.get();
    }

    public void setGravedad(double gravedad) {
        this.gravedad.set(gravedad);
    }

    public DoubleProperty velocidadInicialProperty() {
        return velocidadInicial;

    }

    public DoubleProperty velocidadFinalProperty() {
        return velocidadFinal;

    }

    public DoubleProperty alturaProperty() {
        return altura;

    }

    public DoubleProperty tiempoProperty() {
        return tiempo;

    }

    public DoubleProperty tiempoDCaidaProperty() {
        return tiempoDCaida;

    }

    public DoubleProperty gravedadProperty() {
        return gravedad;

    }

    //----- Métodos para calcular -----//
    public double calcularAltura(){
        return (getVelocidadFinal()/2)*getTiempo();
        
    }
    public double calcularVelocidadFinal(){
        return getGravedad()*getTiempo();
    
    }
    public double  calcularTiempoDeCaida(){
        return Math.sqrt(2*getAltura()/getGravedad());
    }
    
}
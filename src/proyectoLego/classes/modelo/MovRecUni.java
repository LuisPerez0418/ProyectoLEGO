package modelo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;

public class MovRecUni {

    private DoubleProperty posInicial = new SimpleDoubleProperty();
    private DoubleProperty posFinal = new SimpleDoubleProperty();
    private DoubleProperty tiempoInicial = new SimpleDoubleProperty();
    private DoubleProperty tiempoFinal = new SimpleDoubleProperty();
    private FloatProperty velocidad = new SimpleFloatProperty();

    public MovRecUni(double tiempoInicial, double tiempoFinal, float velocidad,
            double posInicial, double posFinal) {
        setTiempoInicial(tiempoInicial);
        setTiempoFinal(tiempoFinal);
        setPosInicial(posInicial);
        setPosFinal(posFinal);
        setVelocidad(velocidad);
    }

    public MovRecUni(double tiempoInicial, double tiempoFinal, double posInicial,
            double posFinal) {
        setTiempoInicial(tiempoInicial);
        setTiempoFinal(tiempoFinal);
        setPosInicial(posInicial);
        setPosFinal(posFinal);
    }

    public MovRecUni(double tiempoInicial, float velocidad, double posInicial,
            double posFinal) {
        setTiempoInicial(tiempoInicial);
        setPosInicial(posInicial);
        setPosFinal(posFinal);
        setVelocidad(velocidad);
    }

    public MovRecUni(float velocidad, double posInicial, double posFinal) {
        setPosInicial(posInicial);
        setPosFinal(posFinal);
        setVelocidad(velocidad);
    }

    //----- Métodos getters y setters-----//
    public double getPosInicial() {
        return posInicial.get();
    }

    public void setPosInicial(double posInicial) {
        this.posInicial.set(posInicial);
    }

    public DoubleProperty posInicialProperty() {
        return posInicial;
    }

    public double getPosFinal() {
        return posFinal.get();
    }

    public void setPosFinal(double posFinal) {
        this.posFinal.set(posFinal);
    }

    public DoubleProperty posFinalProperty() {
        return posFinal;
    }

    public double getTiempoInicial() {
        return tiempoInicial.get();
    }

    public void setTiempoInicial(double tiempoInicial) {
        if (tiempoInicial < 0) {
            throw new IllegalArgumentException("El tiempo inicial no puede ser"
                    + " negativo.");
        }
        this.tiempoInicial.set(tiempoInicial);
    }

    public DoubleProperty tiempoInicialProperty() {
        return tiempoInicial;
    }

    public double getTiempoFinal() {
        return tiempoFinal.get();
    }

    public void setTiempoFinal(double tiempoFinal) {
        if (tiempoFinal < getTiempoInicial()) {
            throw new IllegalArgumentException("El tiempo final no puede ser"
                    + " mejor al tiempo inicial: " + getTiempoInicial() + ".");
        }
        this.tiempoFinal.set(tiempoFinal);
    }

    public DoubleProperty tiempoFinalProperty() {
        return tiempoFinal;
    }

    public double getVelocidad() {
        return tiempoInicial.get();
    }

    public void setVelocidad(float velocidad) {
        this.velocidad.set(velocidad);
    }

    public FloatProperty velocidadProperty() {
        return velocidad;
    }

    //----- Métodos para calcular ------//
    public double calcularVelocidad(double tiempoInicial, double tiempoFinal,
            double posInicial, double posFinal) {
        return (getPosFinal() - getPosInicial()) / (getTiempoFinal() - getTiempoInicial());
    }

    public double calcularPosicion() {
        return getPosInicial() + getVelocidad() * (getTiempoFinal() - getTiempoInicial());
    }

    public double calcularTiempo() {
        return (getPosFinal() - getPosInicial()) / getVelocidad();
    }

}

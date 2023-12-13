package modelo;

//@author elias
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class MovParabolico {

    private DoubleProperty velocidadInicial = new SimpleDoubleProperty();
    private DoubleProperty velocidadInicialEnX = new SimpleDoubleProperty();
    private DoubleProperty velocidadInicialEnY = new SimpleDoubleProperty();
    private DoubleProperty gravedad = new SimpleDoubleProperty();
    private DoubleProperty alcanceHorizontal = new SimpleDoubleProperty();
    private DoubleProperty alcanceVertical = new SimpleDoubleProperty();
    private DoubleProperty posicionInicialEnX = new SimpleDoubleProperty();
    private DoubleProperty posicionInicialEnY = new SimpleDoubleProperty();
    private DoubleProperty angulo = new SimpleDoubleProperty();

    public MovParabolico() {
    }

    /*public MovParabolico() {
        
    }*/
    //----- Métodos getters y setters-----//
    public double getVelocidadInicial() {
        return velocidadInicial.get();
    }

    public void setVelocidadInicial(double velocidadInicial) {
        if (velocidadInicial < 0) {
            throw new IllegalArgumentException("La velocidad inicial no puede "
                    + "ser negativa.");
        }
        this.velocidadInicial.set(velocidadInicial);
    }

    public DoubleProperty velocidadInicialProperty() {
        return velocidadInicial;
    }

    public double getVelocidadInicialEnX() {
        return velocidadInicialEnX.get();
    }

    public void setVelocidadInicialEnX(double velocidadInicialEnX) {
        if (velocidadInicialEnX < 0) {
            throw new IllegalArgumentException("La velocidad inicial no puede "
                    + "ser negativa.");
        }
        this.velocidadInicialEnX.set(velocidadInicialEnX);
    }

    public DoubleProperty velocidadInicialEnXProperty() {
        return velocidadInicialEnX;
    }

    public double getVelocidadInicialEnY() {
        return velocidadInicialEnY.get();
    }

    public void setVelocidadInicialEnY(double velocidadInicialEnY) {
        if (velocidadInicialEnY < 0) {
            throw new IllegalArgumentException("La velocidad inicial no puede "
                    + "ser negativa.");
        }
        this.velocidadInicialEnY.set(velocidadInicialEnY);
    }

    public DoubleProperty velocidadInicialEnYProperty() {
        return velocidadInicialEnY;
    }

    public double getGravedad() {
        return gravedad.get();
    }

    public void setGravedad(double gravedad) {
        this.gravedad.set(gravedad);
    }

    public DoubleProperty gravedadProperty() {
        return gravedad;
    }

    public double getAlcanceHorizontal() {
        return alcanceHorizontal.get();
    }

    public void setAlcanceHorizontal(double alcanceHorizontal) {
        this.alcanceHorizontal.set(alcanceHorizontal);
    }

    public DoubleProperty alcanceHorizontalProperty() {
        return alcanceHorizontal;
    }

    public double getAlcanceVertical() {
        return alcanceVertical.get();
    }

    public void setAlcanceVertical(double alcanceVertical) {
        this.alcanceVertical.set(alcanceVertical);
    }

    public DoubleProperty alcanceVerticalProperty() {
        return alcanceVertical;
    }

    public double getAngulo() {
        return angulo.get();
    }

    public void setAngulo(double angulo) {
        this.angulo.set(angulo);
    }

    public DoubleProperty anguloProperty() {
        return angulo;
    }

    public double getPosicionInicialEnX() {
        return posicionInicialEnX.get();
    }

    public void setPosicionInicialEnX(double posicionInicialEnX) {
        this.posicionInicialEnX.set(posicionInicialEnX);
    }

    public DoubleProperty posicionInicialEnXProperty() {
        return posicionInicialEnX;
    }

    public double getPosicionInicialEnY() {
        return posicionInicialEnY.get();
    }

    public void setPosicionInicialEnY(double posicionInicialEnY) {
        this.posicionInicialEnY.set(posicionInicialEnY);
    }

    public DoubleProperty posicionInicialEnYProperty() {
        return posicionInicialEnY;
    }

    //----- Métodos para calcular ------//
    // -- Tiempos -- //
    public double calcularTiempoSubida() {
        return (getVelocidadInicialEnY() / getGravedad());

    }

    public double calcularTiempoVuelo() {
        return calcularTiempoSubida() * 2;
    }

    // -- Distancias -- //
    public double calcularAlcanceHorizontalMaximo() {
        return (Math.pow(getVelocidadInicial(), 2) * Math.sin(2 * getAngulo())) / getGravedad();
    }

    public double calcularAlturaMaxima() {
        return (Math.pow(getVelocidadInicialEnY(), 2) / (2 * getGravedad()));
    }

    public double calcularAlcanceHorizontal(double tiempo) {
        return getPosicionInicialEnX() + getVelocidadInicialEnX() * tiempo;
    }

    public double calcularAltura(double tiempo) {
        return getPosicionInicialEnY() + getVelocidadInicialEnY() * tiempo - (getGravedad()/2) * Math.pow(tiempo, 2);
    }
   

    // -- Velocidades -- //
    public double calcularVelocidad() {
        return Math.sqrt(Math.pow(getVelocidadInicialEnX(), 2) + Math.pow(getVelocidadInicialEnY(), 2));
    }

    public double calcularVelocidadEnX() {
        return getVelocidadInicial() * Math.cos(getAngulo());
    }

    public double calcularVelocidadEnY() {
        return getVelocidadInicial() * Math.sin(getAngulo());
    }
    
    // -- Angulo -- //
    public double calcularAngulo() {
        return Math.asin(getVelocidadInicialEnY() / getVelocidadInicial());
    }
    
    public double calcularAngulo(int a) {
        return Math.acos(getVelocidadInicialEnX() / getVelocidadInicial());
    }
}

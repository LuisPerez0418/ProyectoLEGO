package modelo.convertidor;

public class ModeloAngulo {

    //----- Métodos de conversión -----//
    public double gradoRadian(double dato) {
        return dato * (Math.PI / 180);
    }

    public double radianGrado(double dato) {
        return dato * (180 / Math.PI);
    }

    //----- Métodos para mostrar conversión -----//
    public void mostrarGradoRadian(double dato) {
        double resultado;
        resultado = dato * (Math.PI / 180);
        System.out.println(dato + "* π / 180 = " + resultado);
    }
    
    public void mostrarRadianGrado(double dato) {
        double resultado;
        resultado = dato * (180 / Math.PI);
        System.out.println(dato + " * 180 / π = " + resultado);
    }
}

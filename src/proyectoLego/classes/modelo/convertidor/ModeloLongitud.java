package modelo.convertidor;

public class ModeloLongitud {

    //----- métodos de conversión -----//
    public double centimetroMetro(double dato) {
        return dato / 100;
    }

    public double kilometroMetro(double dato) {
        return dato * 1000;
    }

    public double millaMetro(double dato) {
        return dato * 1609;
    }

    //----- métodos para mostrar conversión -----//
    public void mostrarCentimetroMetro(double dato) {
        double resultado;
        resultado = dato / 100;
        System.out.println(dato + " / 100 = " + resultado);
    }

    public void mostrarKilometroMetro(double dato) {
        double resultado;
        resultado = dato * 1000;
        System.out.println(dato + " * 1000 = " + resultado);
    }

    public void mostrarMillaMetro(double dato) {
        double resultado;
        resultado = dato * 1609;
        System.out.println(dato + " * 1609 = " + resultado);
    }

}

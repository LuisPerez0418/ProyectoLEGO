package modelo.convertidor;

public class ModeloTiempo {
    
    public ModeloTiempo(){
        
    }
    
    //----- Métodos de conversión -----//
    public double minutoSegundo(double dato){
        return dato * 60;
    }
    
    public double horaSegundo(double dato){
        return dato * 3600;
    }
    
    //----- Métodos para mostrar conversión -----//
    public void mostrarMinutoSegundo(double dato) {
        double resultado;
        resultado = dato * 60;
        System.out.println(dato + " * 60 = " + resultado);
    }

    public void mostrarHoraMinuto(double dato) {
        double resultado;
        resultado = dato * 3600;
        System.out.println(dato + " * 3600 = " + resultado);
    }
    
    //----- método condicional sistema internacional -----//
    public double convertirTiempo(double dato, String unidad){
        return switch (unidad) {
            case "min" -> minutoSegundo(dato);
            case "h" -> horaSegundo(dato);
            default -> dato;
        };
    }
    
}

public class App {
    
    public static void main(String[] args) throws Exception {
     System.out.println("Hello, World!");

     // Crear instancias de cada tipo de vehiculo
     Auto auto = new Auto(marca:"Toyota", modelo:"Corolla", año:2020, kilometraje:15000, numPasajeros:5, t.."Gasolina");

     Camion camion = new Camion(marca: "Volvo", modelo:"FH", año:2019, kilometraje:75000, capacidadCarga..20000, 4);

     // Mostrar la información de cada vehículo
     System.out.println("Información del Auto:");
     auto.mostrarInfo();

     System.out.println("InInformación del Camion:");
     camion.mostrarInfo();
}   }

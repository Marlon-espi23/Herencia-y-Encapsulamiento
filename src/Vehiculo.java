public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
      
     // Crear instancias de cada tipo de vehiculo
     Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5,"Gasolina");
     
     Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);
     
     // Mostrar la información de cada vehículo
     System.out.println("Información del Auto:");
     auto.mostrarInfo();

     System.out.println("\nInformación del Camion:");
     camion.mostrarInfo();
}   }

public class Vehiculo {
    // Otros atributos y métodos de la clase Vehiculo

    public void realizarMantenimiento() {
        // Método base para realizar mantenimiento
        System.out.println("Realizando mantenimiento básico del vehículo...");
        // Aquí podrías incluir acciones genéricas de mantenimiento
    }
}

public class Auto extends Vehiculo {
    // Otros atributos y métodos específicos de la clase Auto

    @Override
    public void realizarMantenimiento() {
        // Sobrescribe el método realizarMantenimiento para autos
        super.realizarMantenimiento(); // Llama al método de la clase base
        System.out.println("Realizando mantenimiento específico para auto...");
        // Aquí podrías incluir acciones específicas de mantenimiento para autos
    }

    public double calcularCostoMantenimiento(double costoPorKm, double kilometrosRecorridos) {
        // Método para calcular el costo de mantenimiento del auto
        double costoTotal = costoPorKm * kilometrosRecorridos;
        return costoTotal;
    }
}

public class Camion extends Vehiculo {
    // Otros atributos y métodos específicos de la clase Camion

    @Override
    public void realizarMantenimiento() {
        // Sobrescribe el método realizarMantenimiento para camiones
        super.realizarMantenimiento(); // Llama al método de la clase base
        System.out.println("Realizando mantenimiento específico para camión...");
        // Aquí podrías incluir acciones específicas de mantenimiento para camiones
    }
}

public class  VehiculoPasajero extends Vehiculo {
    
    private int numPasajeros;

    // Constructor
     public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
     super(marca, modelo, año, kilometraje);
     this.numPasajeros
     numPasajeros;
    }

    // Getter y Setter para numPasajeros
    public int getNumPasajeros() {
     return numPasajeros;
     public void setNumPasajeros(int numPasajeros)
     this.numPasajeros numpasajeros;
    }

    // Sobrescribir el método mostrarInfo()
    @override
    public void mostrarInfo() {
     super.mostrarInfo();
     System.out.println("Número de Pasajeros:" + numPasajeros);
    }
}

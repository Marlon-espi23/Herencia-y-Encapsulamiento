public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;
    
    //constuctor
    public Vehiculo(String marca, String modelo, int año, int kilometraje) {
        this.marca marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    
    }
    //Getters y Setters
    public String getMarca() {
     return marca;   
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
    }
    public void setModelo(String modelo) {
    }
    public int getAño() {
    }
    public void setAño(int año) {
    }
    public int getKilometraje() {
    }
    public void setKilometraje(int kilometraje) {
    }
        
    // Método para mostrar la información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Kilometraje: : + kilometraje);
          
    }
        
    

    
 
}

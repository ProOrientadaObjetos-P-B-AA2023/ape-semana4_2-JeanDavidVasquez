class automotor1{
    private String cedula;
    private String marcaVehiculo;
    private int anoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    private Fabricante fabricante;

    public automotor1(String cedula, String marcaVehiculo, int anoFabricacion, double valorVehiculo, Fabricante fabricante) {
        this.cedula = cedula;
        this.marcaVehiculo = marcaVehiculo;
        this.anoFabricacion = anoFabricacion;
        this.valorVehiculo = valorVehiculo;
        this.fabricante = fabricante;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public void calcularValorMatricula(){
        this.valorMatricula= (this.valorVehiculo*0.00002)*(2023-anoFabricacion);
    }
    public double getValorMatricula(){
        return this.valorMatricula;
    }

    public void setFabricante(Fabricante fabricante){
        this.fabricante=fabricante;
    }

    public Fabricante getFabricante(){
        return fabricante;
    }

    public String toString(){
        return String.format("AUTOMOTOR"+
                        "\nCedula: %s"+
                        "\nMarca del Vehiculo: %s"+
                        "\nAño de fabricacion: %d"+
                        "\nPrecio del vehiculo: %.2f"+
                        "\nValor de la matricula: %.2f"+
                        "\nFabricante: %s",
                this.getCedula(),this.getMarcaVehiculo(),this.getAnoFabricacion(),this.getValorVehiculo(),this.getValorMatricula(),this.getFabricante());
    }
}

class Fabricante{
    private String nombreFabricante;
    private String ciudadOrigen;

    public Fabricante(String nombreFabricante, String ciudadOrigen) {
        this.nombreFabricante = nombreFabricante;
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String toString(){
        return String.format(" %s "+
                "\nCiudad de Origen: %s",this.getNombreFabricante(),this.getCiudadOrigen());
    }
}

public class Automotor {
    public static void main(String[] args) {
        Fabricante fabricante= new Fabricante("Mavesa","Loja");
        automotor1 automotor= new automotor1("1105822231", "INO", 2001,20000, fabricante);
        automotor.calcularValorMatricula();
        System.out.println(automotor);

    }
}
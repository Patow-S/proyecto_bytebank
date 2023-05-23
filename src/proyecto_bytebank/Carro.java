package proyecto_bytebank;

public class Carro{
    private int ano;
    private String modelo;
    private double precio;

    public Carro(int ano, String modelo, double precio){
        if(ano >= 1891){
            this.ano = ano;
        }else{
            System.out.println("El año informado no es válido. Por eso usaremos 2017!");
            this.ano = 2017;
        }

        if( modelo != null){
            this.modelo = modelo;
        }else{
            System.out.println("El modelo no fue informado. Por eso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(precio > 0){
            this.precio = precio;
        }else{
            System.out.println("EL precio no es válido. Por eso usaremos 40000.0!");
            this.precio = 40000.0;
        }
    }

    //Nuevo constructor AQUI!
    public Carro(String modelo, double precio){
        this(2017, modelo, precio);
    }
    // Método para imprimir los detalles del carro
    public void imprimirDetalles() {
        System.out.println("Detalles del carro:");
        System.out.println("Año: " + ano);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
    }
    
    public static void main(String[] args) {
        Carro miCarro = new Carro(2019, "Jetta", 50000.0);
        miCarro.imprimirDetalles();
    } 



}

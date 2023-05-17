package proyecto_bytebank;

public class cuenta {

	int nombre;
	String apellido;                                  
	private double saldo; 	                    // si esta private , saldo no es accesible 
	private int agencia;
	private int numero ;
	cliente titular = new cliente();

	public void depositar(double valor) { 	    // No retorna valor
		this.saldo += valor;   		            // apunta a un objeto en especifico / rm : this.saldo = this.saldo + valor;

	}

	public boolean retirar(double valor) { 	    // Retorna valor
		if (this.saldo >= valor) { 
			this.saldo -= valor;
			return true;
		}
		return false;                           /* else { return false;} */
	}

	public boolean transferir(double valor, cuenta cuenta1) {
		if (this.saldo >= valor) {
			this.saldo -= this.saldo - valor;
			cuenta1.saldo = cuenta1.saldo + valor;
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo(){  //obtener
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {    //asignar
		
		if (agencia > 0 ) {
			this.agencia = agencia; 
		} else {
			System.out.println("valores negativos , no permitido");
		}
	}
	//Buenas practicas
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(cliente titular) {
		this.titular = titular;
	}

	public static void main(String[] args) {

		cuenta primeraCuenta = new cuenta();
		primeraCuenta.saldo = 100;
		System.out.println(primeraCuenta.saldo);

		cuenta segundaCuenta = new cuenta();
		segundaCuenta.apellido = "patow";
		System.out.println(segundaCuenta.apellido);

		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);

	}
}

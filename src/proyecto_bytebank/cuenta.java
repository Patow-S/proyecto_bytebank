package proyecto_bytebank;

class Cuenta {

	int nombre;
	String apellido;                                  
	private double saldo; 	                    // si esta private , saldo no es accesible 
	private int agencia;
	private int numero ;
	Cliente titular = new Cliente();
	
	private static int total= 0; 
	
	public Cuenta (int agencia) {
    	if (agencia <= 0){ 
    		System.out.println("no se permite 0");
    	}else {
    		this.agencia = agencia;
    	}
    	total++;
    	System.out.println("Aqui se crea una nueva cuenta   ");
    	System.out.println("se van creando: " + total + " cuentas");
    }    

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

	public boolean transferir(double valor, Cuenta cuenta1) {
		if (this.saldo >= valor) {
			this.saldo -= this.saldo - valor;
			cuenta1.saldo = cuenta1.saldo + valor;
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo(){                    //obtener
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {        //asignar
		
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
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getTotal() {
		return Cuenta.total;
	}

	public static void main(String[] args) {

		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 100;
		System.out.println(primeraCuenta.saldo);

		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.apellido = "patow";
		System.out.println(segundaCuenta.apellido);

		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);

	}
}

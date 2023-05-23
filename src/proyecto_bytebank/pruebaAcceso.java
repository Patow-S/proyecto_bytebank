package proyecto_bytebank;

public class pruebaAcceso {
	public static void main(String[] args) {
		Cuenta sofiaCuenta = new Cuenta();
		sofiaCuenta.setAgencia  (-32);
		sofiaCuenta.depositar(400);
		sofiaCuenta.retirar(300);
		System.out.println(sofiaCuenta.getSaldo());
		System.out.println(sofiaCuenta.getAgencia());
		
	
		
		/*para negativos 
		sofiaCuenta.saldo = sofiaCuenta.saldo - 300;*/
		


	}

}

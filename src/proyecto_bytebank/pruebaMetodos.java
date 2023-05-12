package proyecto_bytebank;

import proyecto_bytebank.cuenta.cuenta1;

public class pruebaMetodos {
	public static void main(String[] args) {
		cuenta1 miCuenta = new cuenta1();
		miCuenta.saldo =300;
		miCuenta.depositar(200);
		
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);

		
		cuenta1 DiegoCuenta = new cuenta1();
		DiegoCuenta.depositar(1000);
		DiegoCuenta.transferir(400, miCuenta);
		
		System.out.println(DiegoCuenta.saldo);
		System.out.println(miCuenta.saldo);
		
		

		
		
	}

}

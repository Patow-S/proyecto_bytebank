package proyecto_bytebank;

import proyecto_bytebank.cuenta.cuenta1;

public class TestReferencia {
	public static void main(String[] args) {
		
		//afecta  1 y 2 , sobre-escribe
		
		cuenta1 primeraCuenta = new cuenta1();
		primeraCuenta.saldo = 200;

		
		cuenta1 segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 100;
		
		System.out.println("Saldo primera " + "cuenta: " + primeraCuenta.saldo);

		System.out.println(segundaCuenta.saldo += 400);
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
	}

}

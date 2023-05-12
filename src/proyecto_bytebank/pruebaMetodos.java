package proyecto_bytebank;

public class pruebaMetodos {
	public static void main(String[] args) {
		cuenta miCuenta = new cuenta();
		miCuenta.saldo = 300;
		miCuenta.depositar(200);

		System.out.println(miCuenta.saldo);

		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);

		cuenta DiegoCuenta = new cuenta();
		DiegoCuenta.depositar(1000);

		if (DiegoCuenta.transferir(400, miCuenta)) {
			System.out.println("transferencia exitosa");

		}
		;

		System.out.println(DiegoCuenta.saldo);
		System.out.println(miCuenta.saldo);

	}

}

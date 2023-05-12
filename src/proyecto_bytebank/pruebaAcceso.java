package proyecto_bytebank;

public class pruebaAcceso {
	public static void main(String[] args) {
		cuenta sofiaCuenta = new cuenta();
		sofiaCuenta.saldo = 400;
		sofiaCuenta.retirar(300);
		System.out.println(sofiaCuenta.saldo);

	}

}

package proyecto_bytebank;

public class testReferencia2 {
	public static void main(String[] args) {
		cliente diego = new cliente();
		diego.nombre = "Diego";
		diego.documento = "77043285";
		diego.tlf = "995 824 654";

		cuenta cuentaDeDiego = new cuenta();
		cuentaDeDiego.agencia = "1";
		cuentaDeDiego.titular = diego;

		System.out.println(cuentaDeDiego.titular.documento);
		System.out.println(cuentaDeDiego.titular);
		System.out.println(cuentaDeDiego);

	}

}

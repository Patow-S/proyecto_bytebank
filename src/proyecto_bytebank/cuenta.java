package proyecto_bytebank;

public class cuenta {
	
	
	static class cuenta1{
		int nombre;
		String apellido;
		double saldo;
		String titular;
		
		
		//No retorna valor
		 public void depositar(double valor){
			 // apunta a un objeto en especifico
			 //	rm : this.saldo = this.saldo + valor;
			 this.saldo += valor;
			}	
		 
		 //Retorna valor
		 public boolean retirar(double valor){
			 if (this.saldo >= valor ) {
				 this.saldo =- valor;
				 return true ;
			 }
			 return false;
			 /*else { return false;}*/
			}
		 
		 public boolean transferir (double valor, cuenta1 cuenta1 ) {
			 if (this.saldo>=valor) {
				 this.saldo = this.saldo - valor;
				 cuenta1.saldo = cuenta1.saldo +  valor;
				 return true;}
				 else {
					return false;
				}
				
			}
		 }
		
		

	public static void main(String[] args) {

		
		cuenta1 primeraCuenta = new cuenta1();
		primeraCuenta.saldo = 100;
		System.out.println(primeraCuenta.saldo);
		
		cuenta1 segundaCuenta = new cuenta1();
		segundaCuenta.apellido = "patow";
		System.out.println(segundaCuenta.apellido);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
	
	}
}
		
		





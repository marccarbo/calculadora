package calculadora;

	public class resta {
		private int num1;
		private int num2;
		public void Resta(int numero1, int numero2){
			num1=numero1;
			num2=numero2;
		}
		public int restar(){
			int resultado=num1-num2;
			return resultado;
		}
}

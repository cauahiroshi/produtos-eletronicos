
public class TestaEletronicos {
	public static void main (String[] args) {
		
		Eletronico celular1 = new Celular(5678); 
		Eletronico tv1 = new Televisao(6666);
		Eletronico pc1 = new Computador(1501);
		Eletronico geladeira1 = new Geladeira(2021);
		
		System.out.println("Numera��o do Celular " + celular1.getNumercao());
		System.out.println("Numera��o da TV " + tv1.getNumercao());
		System.out.println("Numera��o do PC " + pc1.getNumercao());
		System.out.println("Numera��o da Geladeira " + geladeira1.getNumercao());
		
	}
}

package exercicio_1_1;

public class Cliente {
	
	public static void main (String[] args) {
		
		Fabrica fabrica = new CriaFabrica();
		
		Produto produto = null;
		
		produto = fabrica.getProduto(CriaFabrica.SCREEN);
		
		produto.imprimir();
		
		System.out.println("------------------------------");
		
		produto = fabrica.getProduto(CriaFabrica.FILE);
		produto.imprimir();
		
		
		
	}

}

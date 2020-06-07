package exercicio_1_1;

public class CriaFabrica implements Fabrica {
	
	public static final String SCREEN = "SCREEN";
	public static final String FILE = "FILE";
	

	@Override
	public Produto getProduto(String tipoproduto) {
		
		switch (tipoproduto) {
		case SCREEN: return new ProdutoScreen();
		case FILE: return new ProdutoFile();
		}
		
		return null;
	}

}

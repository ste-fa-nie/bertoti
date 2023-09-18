public class ImpressoraX {
	private static ImpressoraX impressoraX;
	private ImpressoraX(){
	}
	public static ImpressoraX getInstance(){
		if(impressoraX == null){
			impressoraX = new ImpressoraX();
		}
		return impressoraX;
	}
	public void imprimir(String document){
		System.out.println("Imprimindo: " + documento);
	}
}

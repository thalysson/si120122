package mainClasses;

public class Link {

	private String textLink;
	private boolean linkValido;
	
	public Link(String texto){
		this.textLink = texto;
		verificaLinkValido();
		
	}
	
	/** Metodo que analisa se o texto-link é valido ou nao
	 * 
	 */
	private void verificaLinkValido(){
		this.textLink.split("//");
	}

	public boolean isLinkValido() {
		return linkValido;
	}

	public void setLinkValido(boolean linkValido) {
		this.linkValido = linkValido;
	}

}

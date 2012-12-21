package mainClasses;

public class Link {

	private String textLink;
	
	public Link(String texto){
		if(linkValido(texto)){
			this.textLink = texto;
		}
	}
	
	/** Metodo que analisa se o texto-link é valido ou nao
	 * 
	 * @param link
	 * @return boolean
	 */
	private boolean linkValido(String link){
		this.textLink.split("//");
		return false;
	}

}

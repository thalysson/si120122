package mainClasses;

import java.util.Date;

public class Link {

	private String textLink;
	private boolean linkValido;
	private Date dataLink;
	
	public Link(String texto){
		this.textLink = texto;
		setLinkValido(verificaLinkValido());
		this.dataLink = new Date();
	}
	
	/** Metodo que analisa se o texto-link é valido ou nao
	 * 
	 */
	private boolean verificaLinkValido(){
		String prefixoLink = this.textLink.split("//")[0];
		if(prefixoLink.contains("http:") || prefixoLink.contains("https:")){
			return true;
		}
		return false;
	}

	public boolean isLinkValido() {
		return linkValido;
	}

	public void setLinkValido(boolean linkValido) {
		this.linkValido = linkValido;
	}

	public Date getDataDoLink(){
		return this.dataLink;
	}
	
}

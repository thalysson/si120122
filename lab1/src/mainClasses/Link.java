package mainClasses;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Link {

	private String textLink;
	private boolean linkValido;
	
	public Link(String texto){
		this.textLink = texto;
		setLinkValido(verificaLinkValido());
		
	}
	
	/** Metodo que analisa se o texto-link é valido ou nao
	 * 
	 */
	private boolean verificaLinkValido(){
		try {
		    URL url = new URL(this.textLink);
		    URLConnection connection = url.openConnection();
		    connection.connect();
		    return true;
		} catch (MalformedURLException e) {
		    return false;
		} catch (IOException e) {
		    return false;
		}
	}

	public boolean isLinkValido() {
		return linkValido;
	}

	public void setLinkValido(boolean linkValido) {
		this.linkValido = linkValido;
	}

}

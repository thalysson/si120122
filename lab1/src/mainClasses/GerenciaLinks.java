package mainClasses;

import java.util.ArrayList;
import java.util.HashMap;

public class GerenciaLinks {

	private HashMap<Usuario, ArrayList<Link>> links;
	
	public GerenciaLinks(){
		this.links = new HashMap<Usuario, ArrayList<Link>>();
	}

	/** Metodo que retorna o numero de links que um determinado usuario postou.
	 * 
	 * @param usuario
	 * @return int numero de links de um determinado usuario.
	 */
	public int getNumLinksDeUsuario(Usuario usuario) {
		if(this.links.containsKey(usuario)){
			return links.get(usuario).size();
		}
		return 0;
	}
}

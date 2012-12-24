package mainClasses;

import java.util.ArrayList;
import java.util.List;

public class GerenciaUsuarios {

	private ArrayList<Usuario> usuarios;
	private Usuario user;
	
	public GerenciaUsuarios(){
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public int getNumeroUsuarios() {
		return this.usuarios.size();	
	}

	public void criaNovoUsuario(String login, String senha) {
		this.user = new Usuario(login, senha);
		this.usuarios.add(user);
	}

	public void usuarioPostarLink(String link) {
		this.user.postarLink(link);
	}

	public int numPostsUsuario() {
		return this.user.getNumeroLinksValidosPostados();
	}

	public boolean linkPostadoIsValido() {
		return this.user.linkPostadoIsValido();
	}

	public List<Link> getUltimasPostagensAllUsers(){
		List<Link> todosLinks = new ArrayList<Link>();
		for(Usuario user: this.usuarios){
			List<Link> linksUser = user.getLinksPostados();
			int numLinksUser = linksUser.size();
			for(int i = 0; i < numLinksUser;i++){
				todosLinks.add(linksUser.get(i));
			}
		}
		return ordenaLinks(todosLinks);
	}
	
	private List<Link> ordenaLinks(List<Link> links){
		List<Link> listaLinksOrdenada = new ArrayList<Link>();
		return listaLinksOrdenada;
	}
}

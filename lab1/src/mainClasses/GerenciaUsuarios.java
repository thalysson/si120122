package mainClasses;

import java.util.ArrayList;

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
		return this.user.getNumeroLinksPostados();
	}
	
	
}

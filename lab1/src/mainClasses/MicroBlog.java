package mainClasses;

import java.util.List;

public class MicroBlog {
	
	private GerenciaUsuarios gerenciaUsuarios;
	
	public MicroBlog(){
		gerenciaUsuarios = new GerenciaUsuarios();
	}
	
	public void criaNovoUsuario(String login, String senha) {
		this.gerenciaUsuarios.criaNovoUsuario(login,senha);
	}
	
	public int getNumeroUsuarios() {
		return this.gerenciaUsuarios.getNumeroUsuarios();
	}
	
	public void usuarioPostarLink(String link) {
		this.gerenciaUsuarios.usuarioPostarLink(link);
	}

	public int numeroPostsUsuario() {
		return this.gerenciaUsuarios.numPostsUsuario();
	}
	
	public boolean linkPostadoIsValido(){
		return this.gerenciaUsuarios.linkPostadoIsValido();
	}

	public List<Link> getUltimasPostagensAllUsers() {
		return this.gerenciaUsuarios.getUltimasPostagensAllUsers();
		
	}
	

}

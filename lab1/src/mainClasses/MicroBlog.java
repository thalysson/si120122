package mainClasses;


import java.util.ArrayList;

public class MicroBlog {
	
	private ArrayList<Usuario> usuarios;

	
	public MicroBlog(){
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public void criaNovoUsuario(String login, String senha) {
		Usuario user = new Usuario(login, senha);
		usuarios.add(user);
		
	}

	public int getNumeroUsuarios() {
		return this.usuarios.size();
		
	}

}

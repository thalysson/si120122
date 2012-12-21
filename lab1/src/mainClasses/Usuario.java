package mainClasses;

public class Usuario {
	
	private String login;
	private String senha;
	
	
	/** Construtor da classe Usuario. Recebe um login e uma senha
	 * para criar um novo usuario.
	 * @param login
	 * @param senha
	 */
	public Usuario(String login, String senha){
		setLogin(login);
		setSenha(senha);
		
	}

	/** Metodo que retorna o numero de links que o usuario postou.
	 * 
	 * @return tamanho lista de links postados
	 */
	public int getNumeroLinksPostados(){
		GerenciaLinks gerenciaLinks = new GerenciaLinks();
		return gerenciaLinks.getNumLinksDeUsuario(this);
	}
	
	/** Metodo que configura o login do usuario.
	 * 
	 * @return void
	 */
	private void setLogin(String login){
		this.login = login;
	}
	
	/** Metodo que retorna o login do usuario.
	 * 
	 * @return login
	 */
	public String getLogin(){
		return this.login;
	}
	
	/** Metodo que configura a senha do usuario.
	 * 
	 * @return void
	 */
	private void setSenha(String senha){
		this.senha = senha;
	}
	
	/** Metodo que retorna a senha do usuario.
	 * 
	 * @return senha
	 */
	public String getSenha(){
		return this.senha;
	}
	
	
}

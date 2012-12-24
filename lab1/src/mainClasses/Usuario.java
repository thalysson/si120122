package mainClasses;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String login;
	private String senha;
	private List<Link> linksPostados;
	
	/** Construtor da classe Usuario. Recebe um login e uma senha
	 * para criar um novo usuario.
	 * @param login
	 * @param senha
	 */
	public Usuario(String login, String senha){
		setLogin(login);
		setSenha(senha);
		this.linksPostados = new ArrayList<Link>();
	}

	/** Metodo que executa tarefa de atribuir uma postagem de link.
	 * 
	 * @param link
	 */
	public void postarLink(String link) {
		Link novoLink = new Link(link);
		this.linksPostados.add(novoLink);
	}
	
	public List<Link> getLinksPostados(){
		return this.linksPostados;
	}
	
	/** Metodo que retorna o numero de links que o usuario postou.
	 * 
	 * @return tamanho lista de links postados
	 */
	public int getNumeroLinksValidosPostados(){
		int contador = 0;
		for (Link link : this.linksPostados){
			if(link.isLinkValido()){
				contador++;
			}
		}
		return contador;
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

	/** Metodo que verifica se ultimo link postado é valido ou não.
	 * 
	 * @return boolean
	 */
	public boolean linkPostadoIsValido() {
		int ultimoIndice = this.linksPostados.size()-1;
		Link ultimoLinkPostado = this.linksPostados.get(ultimoIndice);
		return ultimoLinkPostado.isLinkValido();
	}
	
}

package facade;

import gerenciador.ContaPalavrasReservadas;

public class Lab3Facade {

	private ContaPalavrasReservadas contaPalavReserv;
	public static Lab3Facade lab3;
	
	private Lab3Facade(){
		this.contaPalavReserv = new ContaPalavrasReservadas();
	}
	
	public static Lab3Facade getInstance(){
		if(lab3 == null){
			lab3 = new Lab3Facade();
		}
		return lab3;
	}
	
	public Object lerKeyWords() {
		return this.contaPalavReserv.lerArquivoComKeyWords();
	}

	public Object lerKeyWords(String path) {
		return this.contaPalavReserv.lerArquivoComKeyWords(path);
	}

	public void contaKeyWords(String path){
		this.contaPalavReserv.contaKeyWords(path);
	}

	public String getMap() {
		return this.contaPalavReserv.toString();
	}
	
}

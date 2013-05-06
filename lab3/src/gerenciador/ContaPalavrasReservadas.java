package gerenciador;

import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContaPalavrasReservadas {

	private Map<String, Integer> mapKeywords;
	private String pathTxtComkeywords;
	private final static String pathDefaultForKeywords = "java keywords.txt";
	private Scanner scanner;
	private int numArquivosProcessados;

	public ContaPalavrasReservadas() {
		this(pathDefaultForKeywords);
	}

	public ContaPalavrasReservadas(String pathKeyWords) {
		setListKeywords(new HashMap<String, Integer>());
		setPathTxtComkeywords(pathKeyWords);
		lerArquivoComKeyWords();
	}

	public boolean lerArquivoComKeyWords() {
		return lerArquivoComKeyWords(getPathTxtComkeywords());
	}

	public boolean lerArquivoComKeyWords(String path) {
		try {
			// instanciando arquivo para leitura
			File file = new File(path);
			scanner = new Scanner(file);
			String linha;

			// lendo linhas
			while (scanner.hasNext()) {
				linha = scanner.next();
				String[] arrayLinha = linha.split(",");
				for (int i = 0; i < arrayLinha.length; i++) {
					getKeywords().put(arrayLinha[i], 0);
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verificaArquivoJava(String pathArquivo) {
		return pathArquivo.endsWith(".java");
	}

	public void contaKeyWords(String pathDiretorio) {
		File diretorio = new File(pathDiretorio);
		
		//limpa mapa com ocorrencias
		lerArquivoComKeyWords();
		setNumArquivosProcessados(0);
		
		// Primeiro conta palavras chave nos arquivos do diretorio principal
		contaKeyWordsDoDiretorio(diretorio);

		// Depois conta palavras chave nos arquivos dos subdiretorios
		contaKeyWordsNosSubDiretorios(diretorio);
	}

	private void contaKeyWordsNosSubDiretorios(File diretorio) {
		File[] subDiretorios = listaSubDiretorios(diretorio);
		for (File subPasta : subDiretorios) {
			contaKeyWordsNosSubDiretorios(subPasta);
			contaKeyWordsDoDiretorio(subPasta);
		}

	}

	private void contaKeyWordsDoDiretorio(File diretorio) {
		File[] arquivos = listaArquivosDeDiretorio(diretorio);
		for (File arq : arquivos) {
			fazContaEmArquivo(arq);
		}
	}

	private void fazContaEmArquivo(File file) {
		try {
			scanner = new Scanner(file);
			String linha;

			// lendo linhas
			while (scanner.hasNext()) {
				linha = scanner.next();
				// linha.contains();
				String[] arrayLinha = linha.split(" ");
				for (int i = 0; i < arrayLinha.length; i++) {

					if (getKeywords().containsKey(arrayLinha[i])) {
						int count = getKeywords().get(arrayLinha[i]);
						getKeywords().put(arrayLinha[0], count + 1);
					}
				}
			}
			setNumArquivosProcessados(getNumArquivosProcessados()+ 1);
		} catch (Exception e) {
		}

	}

	private File[] listaArquivosDeDiretorio(File diretorio) {
		return diretorio.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		});
	}

	private File[] listaSubDiretorios(File diretorio) {
		return diretorio.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		});
	}

	@Override
	public String toString() {
		String toString = "";
		int contadorAux = 0;
		for (String key : getKeywords().keySet()) {
			String linha = key + ": " + getKeywords().get(key) + " , ";
			toString = toString.concat(linha);
			contadorAux++;

			// usei esse lance do contador porque nao sou bom em swing e não sei
			// como formatar e usar layout lá.. por isso, desconsidere está gambiarra!
			if (contadorAux == 4) {
				toString = toString.concat("\r\n"); // obs: no windows, o \n
													// sozinho não funciona!
				contadorAux = 0;
			}
		}
		return toString;
	};

	public void setListKeywords(Map<String, Integer> map) {
		this.mapKeywords = map;
	}

	public Map<String, Integer> getKeywords() {
		return mapKeywords;
	}

	public String getPathTxtComkeywords() {
		return pathTxtComkeywords;
	}

	public void setPathTxtComkeywords(String pathTxtComkeywords) {
		this.pathTxtComkeywords = pathTxtComkeywords;
	}

	public int getNumArquivosProcessados() {
		return numArquivosProcessados;
	}

	public void setNumArquivosProcessados(int numArquivosProcessados) {
		this.numArquivosProcessados = numArquivosProcessados;
	}
}
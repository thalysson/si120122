package interfaceSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import facade.Lab3Facade;

public class PanelPrincipal extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JButton buttonPesquisar,buttonAnalizar;
	private JTextArea textoPath, textoNumThreads;
	private JTextField campoPath, campoNumThreads;

	
	public PanelPrincipal(){
		super(new FlowLayout(FlowLayout.CENTER));
		instanciaOsComponentes();
		configuraComponentes();
		addComponentes();
	}
	
	private void instanciaOsComponentes() {
		instanciaBotoes();
		instanciaTextsArea();
		instanciaCampos();
	}

	private void instanciaBotoes(){
		this.buttonPesquisar = new JButton("Pesquisar");
		this.buttonAnalizar = new JButton("Analisar");		
	}
	
	private void instanciaTextsArea(){
		this.textoNumThreads = new JTextArea();
		this.textoPath = new JTextArea();		
	}
	
	private void instanciaCampos(){
		this.campoPath = new JTextField(20);
		this.campoNumThreads = new JTextField();		
	}
	
	private void configuraComponentes(){
		configuraTextField();
		configuraTextsArea();
		addActionListenerEmBotoes();
	}
	
	private void configuraTextField(){
		this.campoNumThreads.setColumns(5);

	}
	
	private void configuraTextsArea(){
		this.textoNumThreads.setText("Número de threads a ser usado:");
		this.textoPath.setText("Caminho do diretório: ");
	}
	
	private void addActionListenerEmBotoes(){
		this.buttonAnalizar.addActionListener(this);
		this.buttonPesquisar.addActionListener(this);
	}
	
	private void addComponentes(){
		this.add(textoPath);
		this.add(campoPath);
		this.add(buttonPesquisar);
		this.add(textoNumThreads);
		this.add(campoNumThreads);
		this.add(buttonAnalizar);
	}
	
	public void listaOcorrenciasKeyWords(String path){
		Lab3Facade lab3 = Lab3Facade.getInstance();
		lab3.contaKeyWords(path);
		// desenha ocorrencias
		JOptionPane.showMessageDialog(null, "Ocorrencias de palavras chave:"+ "\r\n" +lab3.getMap() ,"",JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == buttonPesquisar){
			JanelaPesquisarArquivos pesquisar = new JanelaPesquisarArquivos();
			this.campoPath.setText(pesquisar.getPathPasta());
		}

		if(evento.getSource() == buttonAnalizar){
			if(this.campoPath.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Selecione um diretório!" ,"",JOptionPane.ERROR_MESSAGE);				
			}else{
				listaOcorrenciasKeyWords(this.campoPath.getText());				
			}
		}
	}
	
}

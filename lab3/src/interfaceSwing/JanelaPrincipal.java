package interfaceSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;

	public JanelaPrincipal() {
		super("SI120122 - Lab3");
		configuraJanela();
	}
	
	public JanelaPrincipal(JPanel panel){
		this();
		this.setContentPane(panel);
	}

	public void configuraJanela() {
		this.setSize(500, 200);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

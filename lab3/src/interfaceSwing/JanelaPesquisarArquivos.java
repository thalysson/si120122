package interfaceSwing;

import javax.swing.JFileChooser;

public class JanelaPesquisarArquivos extends JFileChooser {

	private static final long serialVersionUID = 1L;
	private String pathPasta;

	public JanelaPesquisarArquivos() {
		this.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		this.setDialogTitle("Selecione caminho dos arquivos .java");
		this.setAcceptAllFileFilterUsed(false);

		if (this.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			setPathPasta(this.getSelectedFile().getAbsolutePath());
		}
	}

	public String getPathPasta() {
		return pathPasta;
	}

	public void setPathPasta(String pathPasta) {
		this.pathPasta = pathPasta;
	}
}
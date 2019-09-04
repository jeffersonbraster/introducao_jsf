package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ManagedBean(name = "pessoaBean")
@SessionScoped
public class PessoaBean {

	private String nome;	
	private String senha;
	private String texto;
	private List<String> nomes = new ArrayList<String>();
	private HtmlCommandButton htmlCommandButton;
	
	
	
	
	
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public HtmlCommandButton getHtmlCommandButton() {
		return htmlCommandButton;
	}

	public void setHtmlCommandButton(HtmlCommandButton htmlCommandButton) {
		this.htmlCommandButton = htmlCommandButton;
	}

	public String addNome() {
		nomes.add(nome);
		if(nomes.size() > 2) {
			htmlCommandButton.setDisabled(true);
			return "paginanavegada?faces-redirect=true";
		}
		return "";
	}
	
	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

}

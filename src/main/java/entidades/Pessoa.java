package entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String sobrenome;
	private Integer idade;
	
	

	@Temporal(TemporalType.DATE)
	private Date datanascimento;

	private String sexo;
	
	private String nivelProgramador;
	
	private Integer[] linguagens;
	
	private String[] frameworks;
	
	private Boolean ativo;
	
	private String login;
	private String senha;
	
	private String perfilUser;
	
	
	
	
	
	
	





	public Integer[] getLinguagens() {
		return linguagens;
	}





	public void setLinguagens(Integer[] linguagens) {
		this.linguagens = linguagens;
	}





	public String getNivelProgramador() {
		return nivelProgramador;
	}





	public void setNivelProgramador(String nivelProgramador) {
		this.nivelProgramador = nivelProgramador;
	}





	public String getPerfilUser() {
		return perfilUser;
	}





	public void setPerfilUser(String perfilUser) {
		this.perfilUser = perfilUser;
	}





	public Pessoa() {

	}

	
	
	
	
	public String getLogin() {
		return login;
	}





	public void setLogin(String login) {
		this.login = login;
	}





	public String getSenha() {
		return senha;
	}





	public void setSenha(String senha) {
		this.senha = senha;
	}





	public Boolean getAtivo() {
		return ativo;
	}



	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}



	public String[] getFrameworks() {
		return frameworks;
	}



	public void setFrameworks(String[] frameworks) {
		this.frameworks = frameworks;
	}



	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Date getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

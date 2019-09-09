package repository;

import entidades.Pessoa;

public interface IDaoPessoa {
	
	Pessoa consultarUsuario(String login, String senha);

}

package com.blogpessoal.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.modelos.Postagem;

@Repository
public interface PostagemRepositorio extends JpaRepository<Postagem, Long> {

	/**
	 * Metodo utilizado para realizar pesquisa pela coluna titulo da tabela postagem
	 * 
	 * @param titulo
	 * @return List com Postagem
	 * @author Turma34
	 * @since 1.0
	 * 
	 */
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);

	/**
	 * Metodo utilizado para realizar pesquisa pela coluna descricao da tabela
	 * postagem
	 * 
	 * @param descricao
	 * @return List com Postagem
	 * @author Turma34
	 * @since 1.0
	 * 
	 */
	public List<Postagem> findAllByDescricaoContainingIgnoreCase(String descricao);

}
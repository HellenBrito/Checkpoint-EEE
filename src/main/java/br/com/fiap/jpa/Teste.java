package br.com.fiap.jpa;

import java.time.LocalDateTime;
import br.com.fiap.entity.Livro;
import br.com.fiap.jpa.service.LivroServiceImpl;

public class Teste {

	public static void main(String[] args) {
		LivroServiceImpl livroService = LivroServiceImpl.getInstance();
		
		Livro livro = new Livro("Enterprise", "Hellen", 123456789, "edicaolimitada", LocalDateTime.now());
		Livro livro2 = new Livro("Cronicas", "Brito", 12347777, "edicaoilimitada", LocalDateTime.now());
		Livro livro3 = new Livro("FIAP", "Douglas Adams", 12345268, "limitada", LocalDateTime.now());
		livroService.cadastrar(livro);
		livroService.cadastrar(livro2);
		livroService.cadastrar(livro3);
		
		livroService.listar().forEach(System.out::println);
		
		livroService.remover(3L);
		
		livroService.atualizar(new Livro("Cronicas", "Brito", 12347777, "edicao3", LocalDateTime.now()));
	}

}

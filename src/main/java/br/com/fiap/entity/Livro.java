package br.com.fiap.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="tb_livro")
@SequenceGenerator(name="livro", sequenceName = "SQ_TB_DISCIPLINA", allocationSize = 1)
public class Livro implements Serializable{
	
	private static final long serialVersionUID = 4381104743492991636L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "livro")
	private Long id;
	
	
	@Column(name="ds_titulo", length = 30, nullable = false)
	private String titulo;
	
	
	@Column(name="ds_autor", length = 30, nullable = false)
	private String autor;
	
	
	@Column(name = "nr_isbn")
	private Integer isbn;
	
	
	@Column(name = "ds_edicao", length = 100, nullable = false)
	private String edicao;
	
	
	@Column(name="dt_publicacao")
	private LocalDateTime dataPublicacao;
	
	
	@Column(name="st_ativo")
	private Boolean ativo;
	
	
	@Column(name="dt_cadastro")
	private LocalDateTime dataCadastro;
	
	
	@Column(name="dt_atualizacao")
	private LocalDateTime dataAtualizacao;


	public Livro(String titulo, String autor, Integer isbn, String edicao, LocalDateTime dataPublicacao) {
		this();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.edicao = edicao;
		this.dataPublicacao = dataPublicacao;
		
		
	}

	public Livro() {
		super();
		this.ativo = true;
		this.dataCadastro = LocalDateTime.now();
		this.dataAtualizacao = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "\nTitulo: " + this.getTitulo()
		+ "\nAutor: " + this.getAutor()
		+"\nISNB: "+ this.getIsbn()
		+"\nEdicao: "+ this.getEdicao()
		+"\nData Publicação: "+ this.getDataPublicacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public LocalDateTime getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDateTime dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
		
	
}

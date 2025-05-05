package livraria;

public class Livro {
	private String isbn;
	private String titulo;
	private String autor;
	
	
	public Livro(String titulo, String autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getIsbn() {
		return isbn;
	}
}

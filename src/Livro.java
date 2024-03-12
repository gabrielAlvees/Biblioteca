public class Livro extends ItemBiblioteca{
    private String tipo;
    private String isbn;
    private int totalPaginas;

//    Construtor
    public Livro(String titulo, String editora, String dataPublicacao, String tipo, String isbn, int totalPaginas){
        super(titulo, editora, dataPublicacao);
        this.tipo = tipo;
        this.isbn = isbn;
        this.totalPaginas = totalPaginas;
    }

//    Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getTotalPaginas(){
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas){
        this.totalPaginas = totalPaginas;
    }
}

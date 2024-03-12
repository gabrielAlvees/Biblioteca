public class Revista extends ItemBiblioteca {
    private String tipo;
    private int totalPaginas;

//    Construtor
    public Revista(String titulo, String editora, String dataPublicacao, String tipo, int totalPaginas){
        super(titulo, editora, dataPublicacao);
        this.tipo = tipo;
        this.totalPaginas = totalPaginas;
    }

//    Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }
}

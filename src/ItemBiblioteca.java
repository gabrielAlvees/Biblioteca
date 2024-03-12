public class ItemBiblioteca {
    private String titulo;
    private String editora;
    private String dataPublicacao;



//    Construtor
    public ItemBiblioteca(String titulo, String editora, String dataPublicacao){
        this.titulo = titulo;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
    }
    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}

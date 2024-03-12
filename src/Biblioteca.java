import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<ItemBiblioteca> itemBiblioteca;
    private ArrayList<Usuario> usuario;

    public Biblioteca(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.itemBiblioteca = new ArrayList<>();
        this.usuario = new ArrayList<>();
    }

    public void adicionarItens(ItemBiblioteca itemBiblioteca){
        this.itemBiblioteca.add(itemBiblioteca);
    }

    public void mostrarItemAdicionado(){
        for(ItemBiblioteca item : this.itemBiblioteca){
            System.out.println("O item adicionado foi: " + item.getTitulo());
        }
    }

    public void adicionarUsuario(Usuario usuario){
        this.usuario.add(usuario);
    }

    public void mostrarUsuarioAdiciona(){
        for(Usuario usuario : this.usuario){
            System.out.println("O usuário adicionado foi: " + usuario.getNome());
        }
    }

    public void emprestarItem(String titulo, String nomeDoUsuario){
        for(ItemBiblioteca itemBiblioteca : this.itemBiblioteca){
            for(Usuario usuario : this.usuario){
                if(itemBiblioteca.getTitulo().equals(titulo) && usuario.getNome().equals(nomeDoUsuario)){
                    System.out.println("Emprestado com Sucesso!");
                    return;
                }
            }
        }
        System.out.println("Erro ao emprestar o livro");
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<ItemBiblioteca> getItemBiblioteca() {
        return itemBiblioteca;
    }

    public void setItemBiblioteca(ArrayList<ItemBiblioteca> itemBiblioteca) {
        this.itemBiblioteca = itemBiblioteca;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }
}

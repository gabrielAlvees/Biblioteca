public class Main {
    public static void main(String[] args) {
//        Usuario usuario = new Usuario("Fernanda", "33333333", 25);
//        usuario.imprimirUsuario();

        Biblioteca biblioteca = new Biblioteca("Biblioteca Tatuapé", "Tatuapé - São Paulo");
//        biblioteca.adicionarItens(new ItemBiblioteca("Ciclano", "Editoral tal", "20/04/1998"));

//        Adicionando Itens
        biblioteca.adicionarItens(new Livro("Livro", "Editoral Livro", "20/04/1998", "Livro", "#24ba0", 349));
        biblioteca.adicionarItens(new Revista("Revista", "Editora Revista", "20/04/2004", "Revista", 20));

        biblioteca.mostrarItemAdicionado();
//        Criando um Usuário
        biblioteca.adicionarUsuario(new Usuario("Fernanda", "33333333", 25));
//        Emprestando Item
        biblioteca.emprestarItem("Livro", "Fernanda");


    }
}
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionar livros e usuários
        Livro livro1 = new Livro("1984", "George Orwell", "123456789");
        Usuario usuario1 = new Aluno("João", 1);

        biblioteca.registrarEmprestimo(usuario1, livro1);
    }
}

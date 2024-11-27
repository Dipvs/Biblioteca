import java.util.*;

public class Biblioteca implements Gerenciavel {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private Map<Usuario, List<Livro>> emprestimos = new HashMap<>();

    @Override
    public void adicionar() {
        // Lógica para adicionar um livro ou usuário
    }

    @Override
    public void remover() {
        // Lógica para remover um livro ou usuário
    }

    @Override
    public void listar() {
        // Lógica para listar livros ou usuários
    }

    public void registrarEmprestimo(Usuario usuario, Livro livro) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            emprestimos.computeIfAbsent(usuario, k -> new ArrayList<>()).add(livro);
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }
}

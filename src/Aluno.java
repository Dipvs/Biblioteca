public class Aluno extends Usuario {
    public Aluno(String nome, int id) {
        super(nome, id);
    }

    @Override
    public String toString() {
        return super.toString() + " (Aluno)";
    }
}
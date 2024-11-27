public class Professor extends Usuario {
    public Professor(String nome, int id) {
        super(nome, id);
    }

    @Override
    public String toString() {
        return super.toString() + " (Professor)";
    }
}
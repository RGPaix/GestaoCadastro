public class Livro {
    String nome;
    Integer id;
    String genero;

    public Livro(String nome, Integer id, String genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    @Override
    public String toString(){
        return id + " - " + nome + " - " + genero + " ";
    }
}

public class ListaVetor<T> implements Lista<T>{

    private Object[] elementos;
    private int tamanho;

    public ListaVetor(int capacidade){
        elementos = new Object[capacidade];
        tamanho = 0;
    }

    @Override
    public void inserir(T elemento) {
        if (tamanho == elementos.length){
            throw new RuntimeException("Lista cheia.");
        }
        elementos[tamanho++] = elemento;
    }

    @Override
    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho){
            throw new RuntimeException("Índice inválido.");
        }
        for (int i = indice; i < tamanho -1; i++){
            elementos[i] = elementos[i + 1];
        }
        elementos[--tamanho] = null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T buscar(int indice) {
        if (indice < 0 || indice >= tamanho){
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        return (T) elementos [indice];
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void listar(){
        if (elementos == null){
            System.out.println("Lista vazia.");
            return;
        }
        for (int i = 0; i < tamanho; i++){
            System.out.println(elementos[i] + " ");
        }
        System.out.println();
    }

    public Livro buscarPorId(int id) {
        for (int i = 0; i < tamanho; i++) {
            Livro l = (Livro) elementos[i];
            if (l.id == id) return l;
        }
        return null;
    }

    public Livro buscarPorNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            Livro l = (Livro) elementos[i];
            if (l.nome.equalsIgnoreCase(nome)) return l;
        }
        return null;
    }
}

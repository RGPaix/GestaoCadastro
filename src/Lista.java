public interface Lista<T> {
    void inserir (T elemento);
    void remover (int indice);
    T buscar (int indice);
    int tamanho();
    boolean estaVazia();
    public void listar();
}

public interface Pilha<T> {
    void empilhar (T item);
    T desempilhar();
    T topo();
    Boolean vazia();
    Integer tamanho();
    void listar();
}

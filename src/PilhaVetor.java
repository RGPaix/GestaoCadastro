import java.util.NoSuchElementException;

public class PilhaVetor<T> implements Pilha<T> {
    private Object[] dados;
    private Integer top;
    private int size;

    public PilhaVetor(int tamanho) {
        if (tamanho <= 0) {
            tamanho = 1;
        }
        this.size = tamanho;
        this.dados = new Object[tamanho];
        this.top = 0;
    }

    @Override
    public void empilhar(T item) {
        if (top == dados.length) {
            System.out.println("Pilha cheia.");
            return;
        }
        dados[top++] = item;
    }

    @Override
    public T desempilhar() {
        if (vazia()) throw new NoSuchElementException("Pilha vazia.");
        T item = (T) dados[top - 1];
        --top;
        return item;
    }

    @Override
    public T topo() {
        if (vazia()) throw new NoSuchElementException("Pilha vazia.");
        return (T) dados[top - 1];
    }

    @Override
    public Boolean vazia() {
        return top == 0;
    }

    @Override
    public Integer tamanho() {
        return top;
    }

    @Override
    public void listar() {
        if (vazia()) {
            System.out.println("Pilha vazia.");
            return;
        }
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(dados[i]);
        }
        System.out.println();
    }

    public Livro buscarPorId(int id) {
        for (int i = top - 1; i >= 0; i--) {
            Livro l = (Livro) dados[i];
            if (l.id == id) return l;
        }
        return null;
    }

    public Livro buscarPorNome(String nome) {
        for (int i = top - 1; i >= 0; i--) {
            Livro l = (Livro) dados[i];
            if (l.nome.equalsIgnoreCase(nome)) return l;
        }
        return null;
    }
}



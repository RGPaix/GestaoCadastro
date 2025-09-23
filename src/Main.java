import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PilhaVetor<Livro> pilha = new PilhaVetor<>(10);
        ListaVetor<Livro> lista = new ListaVetor<>(10);

        pilha.empilhar(new Livro("Cem Anos de Solidão", 1, "Romance"));
        lista.inserir(new Livro("Cem Anos de Solidão", 1, "Romance"));

        pilha.empilhar(new Livro("Contos de Édipo", 2, "Fábulas"));
        lista.inserir(new Livro("Contos de Édipo", 2, "Fábulas"));

        pilha.empilhar(new Livro("A Bíblia", 3, "Religioso"));
        lista.inserir(new Livro("A Bíblia", 3, "Religioso"));

        pilha.empilhar(new Livro("O Diário de Bridget Jones", 4, "Romance"));
        lista.inserir(new Livro("O Diário de Bridget Jones", 4, "Romance"));

        System.out.println("Elementos da pilha: ");
        pilha.listar();

        System.out.println("\nElementos da lista: ");
        lista.listar();

        System.out.println("\nRemovendo o terceiro elemento da lista... ");
        System.out.println("\nLista sem o terceiro elemento: ");
        lista.remover(2);
        lista.listar();

        System.out.println("\nRemovendo o último elemento da pilha... ");
        System.out.println("\nPilha sem o último elemento: ");
        pilha.desempilhar();
        pilha.listar();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite um ID para buscar: ");
        int idBusca = sc.nextInt();
        sc.nextLine();

        long inicio = System.nanoTime();
        Livro resultadoLista = lista.buscarPorId(idBusca);
        long fim = System.nanoTime();
        System.out.println("Busca na Lista: " + resultadoLista + " (tempo: " + (fim - inicio) + " ns)");

        inicio = System.nanoTime();
        Livro resultadoPilha = pilha.buscarPorId(idBusca);
        fim = System.nanoTime();
        System.out.println("Busca na Pilha: " + resultadoPilha + " (tempo: " + (fim - inicio) + " ns)");

        System.out.print("\nDigite um nome para buscar: ");
        String nomeBusca = sc.nextLine();

        long inicio1 = System.nanoTime();
        Livro resultadoLista1 = lista.buscarPorNome(nomeBusca);
        long fim1 = System.nanoTime();
        System.out.println("Busca na Lista: " + resultadoLista1 + " (tempo: " + (fim1 - inicio1) + " ns)");

        inicio1 = System.nanoTime();
        Livro resultadoPilha1 = pilha.buscarPorNome(nomeBusca);
        fim1 = System.nanoTime();
        System.out.println("Busca na Pilha: " + resultadoPilha1 + " (tempo: " + (fim1 - inicio1) + " ns)");
    }
}
Sistema de Gestão de Cadastros – Livro

Descrição:

Este projeto implementa um sistema de cadastro de livros, utilizando duas estruturas de dados:
- Lista (ListaVetor) – permite inserção, remoção por índice e busca.
- Pilha (PilhaVetor) – segue o princípio LIFO (Last In, First Out), permitindo empilhar e desempilhar elementos.

O sistema permite:
- Inserir novos livros.
- Remover livros da lista ou pilha.
- Buscar livros por ID ou nome, com medição de desempenho em nanosegundos.
- Listar todos os elementos cadastrados em cada estrutura.

Estrutura do Projeto:
- Livro.java – classe representando o livro (id, nome, genero).
- Lista.java – interface que define os métodos da lista.
- ListaVetor.java – implementação da lista usando array.
- Pilha.java – interface que define os métodos da pilha.
- PilhaVetor.java – implementação da pilha usando array.
- Main.java – programa principal que testa todas as funcionalidades: inserção, remoção, busca e listagem.

Funcionalidades:
1) Inserção: Inserir livros na lista ou empilhar livros na pilha.
2) Remoção: Remover livro por índice na lista / Desempilhar livro do topo da pilha.
3) Busca: Buscar livros por ID ou nome.
4) Medir o tempo de execução em nanosegundos para cada estrutura.
5) Listagem: Listar todos os livros presentes na lista ou na pilha.

Como Executar:

Compile todas as classes:
javac *.java

Execute o Main:
java Main


O programa irá:
- Inserir livros de exemplo na lista e na pilha.
- Listar todos os livros.
- Permitir buscar por ID (medindo o tempo de execução).
- Remover elementos e exibir as estruturas após a remoção.

Tecnologias Utilizadas:
- Java 11+
- Estruturas de dados implementadas manualmente (Lista e Pilha com arrays)

Observações: 
- A implementação usa arrays para armazenar elementos, sem uso de bibliotecas externas.
- O método toString() da classe Livro formata a saída dos livros para facilitar a visualização.
- O tempo de execução das buscas pode variar dependendo do computador.

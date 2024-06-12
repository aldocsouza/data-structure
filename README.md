### Classe `LinkedList`

A classe `LinkedList` define uma lista ligada que contém nós (`Node`) e métodos para manipular a lista.

#### Atributos

- `private Node head;`: Aponta para o primeiro nó da lista.
- `private Node tail;`: Aponta para o último nó da lista.
- `private int length;`: Mantém o tamanho da lista.

#### Classe Interna `Node`

```java
class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
    }
}
````

* Atributos: Cada nó contém data (o valor armazenado) e next (uma referência para o próximo nó).
* Construtor: Inicializa o nó com um valor de data.

### Construtor da LinkedList
```java
public LinkedList(String data) {
    length = 1;
    Node newNode = new Node(data);
    head = newNode;
    tail = newNode;
}
````
* Inicializa: A lista com um único nó, definindo head e tail para esse nó e length como 1.

## Métodos de Acesso e Manipulação
* `getHead` e `getTail`: Imprimem os dados do primeiro e último nó, respectivamente.
* `getLength`: Imprime o comprimento da lista.
* `makeEmpty`: Esvazia a lista, redefinindo head, tail e length.
* `print`: Imprime todos os elementos da lista.
* `append`: Adiciona um novo nó ao final da lista.
* `removeLast`: Remove o último nó da lista.
* `preppend`: Adiciona um novo nó no início da lista.
* `removeFirst`: Remove o primeiro nó da lista.
* `get`: Retorna o nó em um índice específico.
* `insert`: Insere um nó em um índice específico.
* `set`: Define o valor de um nó em um índice específico.
* `remove`: Remove o nó em um índice específico.

### Exemplos de Uso
#### 1. Criação da Lista:
```java
LinkedList list = new LinkedList("Produto 1");
````

#### 2. Adicionando Elementos:
```java
list.append("Produto 2");
list.append("Produto 3");
````

#### 3. Imprimindo a Lista:
```java
list.print();
// Saída esperada:
// ###########################################
// Produto 1
// Produto 2
// Produto 3
// ###########################################
````

#### 4. Removendo o Último Elemento:
```java
list.removeLast();
list.print();
// Saída esperada:
// ###########################################
// Produto 1
// Produto 2
// ###########################################
````

#### 5. Inserindo no Início:
```java
list.preppend("Produto 0");
list.print();
// Saída esperada:
// ###########################################
// Produto 0
// Produto 1
// Produto 2
// ###########################################
````

## Importância no Contexto de Estruturas de Dados
As listas ligadas são fundamentais para:

* <strong>Flexibilidade</strong>: Permitem inserções e remoções eficientes em qualquer posição, especialmente em estruturas dinâmicas onde o tamanho pode variar.
* <strong>Implementação de Outras Estruturas</strong>: São usadas para implementar pilhas, filas, listas duplamente ligadas, e outras estruturas complexas.
* <strong>Compreensão de Conceitos</strong>: Ajudam a entender conceitos importantes como alocação dinâmica de memória, referências, e como as estruturas de dados podem ser gerenciadas manualmente.

## Conclusão

A implementação de uma LinkedList é um exemplo clássico e muito utilizado no estudo de Estruturas de Dados. Ela fornece uma base sólida para entender operações fundamentais de gerenciamento de coleções de dados de forma eficiente e dinâmica.

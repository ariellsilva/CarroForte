# CarroForte
**Descrição do Código**

Este código Java consiste em duas classes: `Armamento` e `CarroGuerra`.

**Classe Armamento:**

- A classe `Armamento` representa um tipo genérico de armamento com várias funcionalidades, como acelerar, desacelerar, analisar, mirar e atirar.
- Atributos:
  - `nome`: uma string que armazena o nome do armamento.
  - `acelerar`, `desacelerar`, `analisar`, `mirar`, `atirar`: booleanos que indicam se o armamento é capaz de realizar cada uma dessas ações.
- Métodos:
  - `Armamento(String nome)`: construtor que inicializa o nome do armamento e define todas as funcionalidades como verdadeiras.
  - Métodos getters para obter o nome e o estado de cada funcionalidade.
  - `info()`: método que exibe informações detalhadas sobre o armamento, incluindo o nome e o estado de cada funcionalidade.

**Classe CarroGuerra:**

- A classe `CarroGuerra` é uma classe de exemplo que cria um objeto da classe `Armamento` com o nome "Carro de Guerra" e exibe informações detalhadas sobre ele usando o método `info()`.

**Finalidade do Código:**

Este código Java serve como uma representação simples de um armamento de um carro de guerra, demonstrando suas funcionalidades básicas. Ele pode ser utilizado como base para a criação de sistemas mais complexos de simulação militar ou jogos de estratégia, onde as características dos armamentos são importantes para o gameplay.

**Como Utilizar:**

1. Copie o código para um arquivo Java em seu ambiente de desenvolvimento.
2. Compile e execute o arquivo `CarroGuerra.java`.
3. Observe a saída no console, que mostrará informações sobre o armamento do carro de guerra.

Este código é útil para entender os conceitos de classes, objetos e métodos em Java, bem como para demonstrar como criar e usar classes para representar objetos do mundo real.
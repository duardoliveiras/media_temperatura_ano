## Exercícios elaborados durante o estudo de Collections

### Média de temperatura

Para este exercício, foi criada uma classe chamada `Mes` que possui atributos `nome` e `temp`, para salvar o nome por extenso do mês e a temperatura naquele mês. Foi criada uma `List<String>` que armazena o nome de todos os meses do ano, seguindo a ordem numérica. Além disso, foi instanciada a classe `Random` para gerar números de temperatura aleatórios, e também um `ArrayList<Mes>` que representa o ano de 2022 e objetos do tipo `Mes`.

### Ordenação de arco-íris

Para este exercício, foi utilizado o `HashSet<>`, que por sua vez não permite elementos repetidos e não é ordenado. Para gerar uma lista ordenada, foi utilizado o `TreeSet<>`, que armazena os valores em ordem crescente, neste caso, a ordem alfabética. Além disso, foi utilizado o `Iterator<>` para iterar por todas as posições da lista e fazer verificações e remoções.

### Ordenação de objetos pelos atributos

Para este exercício, foi criado um `HashSet<>` que armazena objetos do tipo `Linguagens`, que possui atributos de nome, lançamento e IDE. Foi utilizada a sobrescrita dos métodos `compare` e `compareTo` implementando as classes `Comparable` e `Comparator`, para ordenar a lista de acordo com os atributos.

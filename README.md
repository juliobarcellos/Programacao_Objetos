# Programação Orientada a Objetos

Repositório para o conteúdo das aulas e exercícios propostos na matéria cursada no 4º semestre do curso de análise e desenvolvimento de sistemas.

## Configuração do projeto

Todas as aulas e exercícios foram feitos utilizando as seguintes ferramentas:
* [Eclipse-JEE](https://www.eclipse.org/downloads/packages/release/2018-12/r) - versão 2018-12

* A partir da aula 6 começamos a trabalhar com JavaFX, para que os projetos rodem é necessário instalar as ferramentas abaixo:

* [e(fx)clipse 3.5.0](http://www.eclipse.org/efxclipse/install.html#for-the-lazy/) - plugin para o JavaFX no eclipse, deve ser baixado diretamente do Eclipse Marketplace.
A versão utilizada para a construção foi a 3.5.0, porém funciona normalmente na versão atual (3.6.0).
* [JavaFX 11](https://gluonhq.com/products/javafx/) - JDK do JavaFX. Após fazer o download fazer os passos abaixo:
  1. Descompactar o arquivo em uma pasta de sua preferência;
  2. Crie uma variável de ambiente chamada PATH_TO_FX apontando para o diretório lib do SDK que você baixou na etapa anterior (Exemplo em linha de comando: SET PATH_TO_FX="C:\Program Files\Java\javafx-sdk-11.0.2\lib").
* Para modificar o JVM utilizado no eclipse e assegurar que o Eclipse use o Sistema de módulos, o arquivo eclipse.ini precisa ser modificado para contemplar as linhas abaixo:
    - `-vm`
    - `<fullPathToJDK9>/bin`
    - `--add-modules=ALL-SYSTEM`
    
* Para o projeto da aula 10 utilizamos o [MariaDB Connector](https://downloads.mariadb.org/connector-java/2.7.0/) conectando o projeto a um banco de dados local.
Para fazer com que o projeto funcione você apenas precisa ir no eclipse e selecionar o arquivo mariadb-java-client-2.7.0.jar que está na pasta resources no projeto,
clicar com o botão direito e selecionar a opção "Build Path" depois "Add to Build Path". O Banco de Dados utilizado está na mesma pasta ([arquivo database.sql](POO_Aula10/src/edu/curso/resources/database.sql))

* Para o projeto da aula 11 utilizamos o [Hibernate Validator 6.2](https://hibernate.org/validator/releases/6.2/) e o [MariaDB Connector](https://downloads.mariadb.org/connector-java/2.7.0/).
Para fazer com que o projeto funcione você apenas precisa ir no eclipse e selecionar os arquivos .jar que estão no projeto, clicar com o botão direito e selecionar a opção
"Build Path" depois "Add to Build Path". O Banco de Dados utilizado é o mesmo da aula 10 -> [arquivo.sql](POO_Aula10/src/edu/curso/resources/database.sql)

## Informações gerais

### [POO_Aula2](https://github.com/juliobarcellos/Programacao_Orientada_A_Objetos/tree/master/POO_Aula2/src/controller)

- No arquivo [TestesStrings](POO_Aula2/src/controller/TestesStrings.java) começamos a aprender as propriedades das Strings e o motivo de usar `string1 == string2` dar erro, ao passo que string1.equals(string2) irá funcionar;
- No arquivo [TestesStringBuffer](POO_Aula2/src/controller/TesteStringBuffer.java) testamos a diferença entre concatenar 30mil números separados por vírgula usando uma String comum e um StringBuffer.

### [POO_Aula3](https://github.com/juliobarcellos/Programacao_Orientada_A_Objetos/tree/master/POO_Aula3/src/edu/curso)
Nessa aula aprendemos mais sobre memória Stack e Heap, métodos, utilização de var-args nos parâmetros e construtores

- O arquivo [Funcionario](POO_Aula3/src/edu/curso/Funcionario.java) contém o exemplo de utilização de métodos dentro de uma entidade, um exemplo de null Pointer Exception e a utilização de var-args no parâmetro de uma função/procedimento;
- O arquivo [EstouroHeap](POO_Aula3/src/edu/curso/EstouroHeap.java) foi um exercício para estourar a memória Heap, o professor depois passou um [arquivo](POO_Aula3/src/edu/curso/EstourarMemoriaHeap.java) contendo uma das possíveis soluções;
- Os arquivos [AntenaTV](POO_Aula3/src/edu/curso/AntenaTV.java) e [Microondas](POO_Aula3/src/edu/curso/Microondas.java) foram resultado de um exercício de abstração onde pensamos em objetos comuns da vida cotidiana e os transformamos em classes.
 
### [POO_Aula4](https://github.com/juliobarcellos/Programacao_Orientada_A_Objetos/tree/master/POO_Aula4/src)
Aula sobre herança, super classes e sobrecarga.

- Os arquivos [Aluno](POO_Aula4/src/model/Aluno.java), [Animal](POO_Aula4/src/model/Animal.java) e [Pessoa](POO_Aula4/src/model/Pessoa.java) apresentam um exemplo de herança, uso de super classes, e também um exemplo de cadeia de construtores;
- O arquivo [Principal](POO_Aula4/src/view/Principal.java) demonstra na prática a cadeia de construtores funcionando, e também tem uma demonstração de como funciona a sobrecarga de métodos.

### [POO_Aula5](https://github.com/juliobarcellos/Programacao_Orientada_A_Objetos/tree/master/POO_Aula5/src/edu/curso)
Aula sobre sobrescrita, agregação, composição, Scanner e o método `System.out.printf()`

- O arquivo [Empresa](POO_Aula5/src/edu/curso/Empresa.java) faz a chamada para o pagamento de [funcionários](POO_Aula5/src/edu/curso/Funcionario.java), que é feito através da classe [RHINP](POO_Aula5/src/edu/curso/RHINP.java) que herda da classe [RH](POO_Aula5/src/edu/curso/RH.java) e sobrescreve o método `fazPagamento()`;
- O arquivo [TesteScanner](POO_Aula5/src/edu/curso/TesteScanner.java) contém um exemplo de utilização do Scanner para entrada de dados, e o uso do método `System.out.printf()` para formatar a saída de dados.

### [POO_Aula6](https://github.com/juliobarcellos/Programacao_Orientada_A_Objetos/tree/master/POO_Aula6/src/edu/curso)
Aula introdutória ao JavaFX, aprendemos sobre os componentes principais (Stage, Scene, Pane, Labels, TextFields e Buttons)

- O arquivo [TesteFX](POO_Aula6/src/edu/curso/TesteFX.java) contém um exemplo simples de uma tela de login;
- O arquivo [TesteLayout](POO_Aula6/src/edu/curso/TesteLayout.java) serviu para trabalharmos com BorderPane, GridPane e FlowPane, contendo uma tela de cadastro simples;
- O arquivo [TesteCalc](POO_Aula6/src/edu/curso/TesteCalc.java) foi um exercício proposto para simular o layout da calculadora do Windows utilizando o JavaFX.
 
### [POO_Aula7](https://github.com/juliobarcellos/Programacao_Orientada_A_Objetos/tree/master/POO_Aula7/src)
Aula sobre Drawing, uso do canvas para criação de elementos visuais e introdução à EventHandler

- O arquivo [Bolinha](POO_Aula7/src/edu/curso/Bolinha.java) contém uma animação com uma bolinha que percorre o contorno da tela;
- O arquivo [BolinhaDVD](POO_Aula7/src/edu/curso/BolinhaDVD.java) contém uma animação com uma bolinha simulando o movimento do logo de DVD que existia nos aparelhos da época;
- O arquivo [Desenho](POO_Aula7/src/edu/curso/Desenho.java) foi um exercício proposto para trabalhar os métodos gráficos e desenhar alguns objetos na tela;
- O arquivo [SistemaSolar](POO_Aula7/src/edu/curso/SistemaSolar.java) foi um exemplo do uso de fórmulas trigonométricas para a movimentação de objetos em elipse, simulando um sistema solar e dando início também
à utilização do EventHandler para fazer com que a posição da Terra seja "reiniciada" toda vez que o Mouse for clicado na tela.
- O arquivo [TesteBotão](POO_Aula7/src/edu/curso/TesteBotao.java) serve como demonstração da utilização de EventHandler, e também contém um exemplo de como os objetos são escritos no console do eclipse.

### [POO_Aula8](https://github.com/juliobarcellos/Programacao_Orientada_A_Objetos/tree/master/POO_Aula8/src/edu/curso)
Aula finalizando o assunto de Eventos, apresentação de interfaces, função lambda e padrão de projetos observer

- O arquivo [TesteEvento](POO_Aula8/src/edu/curso/TesteEvento.java) mostra o uso de um ActionEvent para fazer com que tanto o mouse quanto o teclado ativem o EventHandler do botão;
- O arquivo [TesteLambda](POO_Aula8/src/edu/curso/TesteLambda.java) apresenta o conceito de uma [interface](POO_Aula8/src/edu/curso/InterfaceCom1Funcao.java) simples e mostra o uso da função lambda;
- Os arquivos [Observador](POO_Aula8/src/edu/curso/Observador.java) e [Publicador](POO_Aula8/src/edu/curso/Publicador.java) são interfaces do método Observer, sendo implementadas pelas classes [Assinante](POO_Aula8/src/edu/curso/Assinante.java) e [Revista](POO_Aula8/src/edu/curso/Revista.java) respectivamente.
- O arquivo [PracaDaSe](POO_Aula8/src/edu/curso/PracaDaSe.java) mostra o padrão em uso, simulando o serviço de assinaturas de revistas, e mostrando a distribuição da informação da classe Publicadora (Revista) para as classes observadoras (Assinantes).

### [POO_Aula9](https://github.com/juliobarcellos/Programacao_Orientada_A_Objetos/tree/master/POO_Aula9/src/edu/curso)
Aula de reforço para algumas estruturas de dados, Uso das propriedades observáveis do JavaFX e Início da construção de um CRUD no padrão BCE no JavaFX

- O arquivo [TesteQueue](POO_Aula9/src/edu/curso/TesteQueue.java) foi o uso de uma Queue implementada utilizando `ArrayDeque<>` para simular um jogo de cartas, onde são utilizados os métodos `baralho.poll` e `baralho.peek` para remover ou "espiar" uma carta do baralho;
- No arquivo [Aluno](POO_Aula9/src/edu/curso/Aluno.java) temos um exemplo de como o método `set` pode ser utilizado sem que ninguém saiba que o valor foi alterado, ou sem que isso seja comunicado de forma alguma. Já no arquivo [AlunoObservavel](POO_Aula9/src/edu/curso/AlunoObservavel.java) usamos StringProperty para acompanhar todas as alterações na variável, que são reportadas assim que ocorrem;
- O arquivo [Pet](POO_Aula9/src/edu/curso/Pet.java) é uma entidade criada para uso no CRUD de Pets, criamos também a [Boundary](POO_Aula9/src/edu/curso/PetBoundary.java) com as funções de Adicionar e Pesquisar um Pet usando um ArrayList para guardar os dados. Também foi explicado o conceito dos métodos `boundaryToEntity()` e `entityToBoundary(Entity e)`.

### [POO_Aula10](https://github.com/juliobarcellos/Programacao_Orientada_A_Objetos/tree/master/POO_Aula10/src/edu/curso)
Aula sobre aplicação do BCE, JPA e integração com JavaFX ao nosso CRUD

- No package [resources](https://github.com/juliobarcellos/Programacao_Orientada_A_Objetos/tree/master/POO_Aula10/src/edu/curso/resources) temos os arquivos [mariadb-java-client](POO_Aula10/src/edu/curso/resources/mariadb-java-client-2.7.0.jar) para fazer a conexão com o banco de dados, e o arquivo [database.sql](POO_Aula10/src/edu/curso/resources/database.sql) com o código do banco que utilizamos para este projeto;
- O arquivo [TesteDatabase](POO_Aula10/src/edu/curso/TesteDatabase.java) contém os métodos para integração e conexão entre o java e o banco de dados;
- O arquivo [PetControl](POO_Aula10/src/edu/curso/PetControl.java) contém os métodos para adicionar um novo Pet e pesquisar por nome;
- Os arquivos [PetBoundary](POO_Aula10/src/edu/curso/PetBoundary.java) e [Pet](POO_Aula10/src/edu/curso/Pet.java) se mantiveram iguais à Aula9, mostrando apenas os campos para cadastrar o Pet, botão de adicionar e pesquisar.

### [POO_Aula11](https://github.com/juliobarcellos/Programacao_Orientada_A_Objetos/tree/master/POO_Aula11/src/edu/curso)
Aula sobre DAO, Hibernate Validator e TableView

- junto com as classes estão os arquivos .jar necessários para que o projeto funcione, lembre-se de adicioná-los ao Build Path e utilizar o [BD](POO_Aula11/src/database.sql) também caso não tenha implementado ainda;
- Melhoramos nossa tela de cadastro de Pets incluíndo o validator e uma TableView para mostrar os registros e interagir melhor com a pesquisa, incluíndo as alterações abaixo:
  - Na classe [Pet](POO_Aula11/src/edu/curso/Pet.java) incluímos as tags para validar alguns dados: nome e raça não podem estar em branco, nome deve possuir entre 2 e 50 caracteres, peso mínimo de 0,5kg, e a data de nascimento deve ser anterior ao dia atual;
  - Na classe [PetBoundary](POO_Aula11/src/edu/curso/PetBoundary.java) incluímos uma TableView utilizando o método `coluna.setCellValueFactory()` para que os valores se tornem observáveis, e adicionamos um `ChangeListener` na tabela para que sempre que alterarmos o Pet selecionado, os campos do formulário sejam automaticamente preenchidos com os dados do Pet selecionado;
  - Incluímos a interface [PetDAO](POO_Aula11/src/edu/curso/PetDAO.java) e a classe [PetDAOImpl](POO_Aula11/src/edu/curso/PetDAOImpl.java) contendo os métodos de conexão e tratamento do banco de dados;
  - Na classe [PetControl](POO_Aula11/src/edu/curso/PetControl.java) foi inserido o método validador da entidade, para que sempre que alguém tente salvar um novo pet ele seja validado antes, e também foi feito o devido acoplamento dos métodos usando o DAO.

### [POO_HeapSort](POO_HeapSort/src/edu/curso/HeapSort.java)
Para a primeira prova da matéria cada aluno fez um vídeo apresentando um assunto relacionado a Java e implementando o assunto abordado com código. O assunto que escolhi foi a implementação do HeapSort
[![Vídeo no YouTube implementando o HeapSort em Java](https://i9.ytimg.com/vi/wELRQn3d6Mo/maxresdefault.jpg?time=1614319200000&sqp=COCc4oEG&rs=AOn4CLBq35122ScHinETvwJ5nOZ4Yq_ASA)](http://www.youtube.com/watch?v=wELRQn3d6Mo "HeapSortVideo")

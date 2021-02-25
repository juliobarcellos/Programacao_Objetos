# Sistemas_Operacionais_I

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

### [POO_Aula2]()

- No arquivo [TestesString]() começamos a aprender as propriedades das Strings e o motivo de usar `string1 == string2` dar erro, ao passo que string1.equals(string2) irá funcionar;
- No arquivo [TestesStringBuffer]() testamos a diferença entre concatenar 30mil números separados por vírgula usando uma String comum e um StringBuffer.

### [POO_Aula3]()
Nessa aula aprendemos mais sobre memória Stack e Heap, métodos, utilização de var-args nos parâmetros e construtores

- O arquivo [Funcionario]() contém o exemplo de utilização de métodos dentro de uma entidade, um exemplo de null Pointer Exception e a utilização de var-args no parâmetro de uma função/procedimento;
- O arquivo [EstouroHeap]() foi um exercício para estourar a memória Heap, o professor depois passou um [arquivo]() contendo uma das possíveis soluções;
- Os arquivos [AntenaTV]() e [Microondas]() foram resultado de um exercício de abstração onde pensamos em objetos comuns da vida cotidiana e os transformamos em classes.
 
### [POO_Aula4]()
Aula sobre herança, super classes e sobrecarga.

- Os arquivos [Aluno](), [Animal]() e [Pessoa]() apresentam um exemplo de herança, uso de super classes, e também um exemplo de cadeia de construtores;
- O arquivo [Principal]() demonstra na prática a cadeia de construtores funcionando, e também tem uma demonstração de como funciona a sobrecarga de métodos.

### [POO_Aula5]()
Aula sobre sobrescrita, agregação, composição, Scanner e o método `System.out.printf()`

- O arquivo [Empresa]() faz a chamada para o pagamento de [funcionários](), que é feito através da classe [RHINP]() que herda da classe [RH]() e sobrescreve o método `fazPagamento()`;
- O arquivo [TesteScanner]() contém um exemplo de utilização do Scanner para entrada de dados, e o uso do método `System.out.printf()` para formatar a saída de dados.

### [POO_Aula6]()
Aula introdutória ao JavaFX, aprendemos sobre os componentes principais (Stage, Scene, Pane, Labels, TextFields e Buttons)

- O arquivo [TesteFX]() contém um exemplo simples de uma tela de login;
- O arquivo [TesteLayout]() serviu para trabalharmos com BorderPane, GridPane e FlowPane, contendo uma tela de cadastro simples;
- O arquivo [TesteCalc]() foi um exercício proposto para simular o layout da calculadora do Windows utilizando o JavaFX.
 
### [POO_Aula7]()
Aula sobre Drawing, uso do canvas para criação de elementos visuais e introdução à EventHandler

- O arquivo [Bolinha]() contém uma animação com uma bolinha que percorre o contorno da tela;
- O arquivo [BolinhaDVD]() contém uma animação com uma bolinha simulando o movimento do logo de DVD que existia nos aparelhos da época;
- O arquivo [Desenho]() foi um exercício proposto para trabalhar os métodos gráficos e desenhar alguns objetos na tela;
- O arquivo [SistemaSolar]() foi um exemplo do uso de fórmulas trigonométricas para a movimentação de objetos em elipse, simulando um sistema solar e dando início também
à utilização do EventHandler para fazer com que a posição da Terra seja "reiniciada" toda vez que o Mouse for clicado na tela.
- O arquivo [TesteBotão]() serve como demonstração da utilização de EventHandler, e também contém um exemplo de como os objetos são escritos no console do eclipse.


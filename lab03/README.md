NOTAS IMPORTANTES
Spring Data JPA also lets you define other query methods by declaring their method signature. For example, CustomerRepository includes the findByLastName() method.


# Respostas para as primeiras perguntas 

- O userRepository é instanciado automaticamente pelo Spring Boot, mais especificamente pelo Spring Data JPA. Para além disso, o Spring Data JPA também cria uma implementação do UserRepository, que é injetada no UserController.

- Os metodos invocados pelo userRepository são: save, findAll, findById, deleteById

- Os dados são guardados na base de dados H2, que é uma base de dados em memória. Para aceder à base de dados, basta aceder ao endereço http://localhost:8080/h2-console 

- A regra para o @NotBlank é que o campo não pode ser nulo e não pode estar vazio. O @Size é para definir o tamanho máximo do campo. Está definida pelo Validator do Spring Boot.



# REVIEW QUESTIONS

## QUESTAO A
Para além do RestController ser algo muitíssimo mais atual, afinal, só foi adicionado ao SpringBoot na versão 4.0 (enquanto o Controller está desde a versão 2.4), podemos citar como diferenças:
- @RestController é utilizado para padrões Restful Web Service, enquanto o @controller é usado em formatos MVC Java.
- Usando o @component, como vimos no guião anterior, é possível retornar uma view (HTML), já com o RestController, apenas retornamos dados sem estilização. Para isso, usamos um processo de envio para os arquivos HTML dos dados retirados das requisições manejadas pelo RestController
- Utilizando o @Controller, será necessário utilizarmos o @ResponseBody para todos os métodos que desejamos manejar. Utilizando o @RestController, esta anotação já é um default, ou seja, não precisamos digitar ela sempre que iniciamos um novo controle sobre uma requisição.
- Ambos são utilizados sobre classses

## QUESTAO B

Os diagramas estão na pasta Employees

## QUESTAO C
Todas essas notações fazem parte do pacote DataJPA e servem respetivamente para:
@Column= Dar um nome específico para a coluna em questão na base de dados SQL (pode ser omitida e assim teremos um nome default)
@Table=Dar um nome específico para a tabela em questão na base de dados SQL (pode ser omitida e assim teremos um nome default)
@id=Usado para identificar que a variável que vem abaixo desta notação, será usada como PRIMARY KEY da table em questão

## QUESTAO D
Para além de não necessitar criar os métodos getters e setters, o autowired torna automatizada a chamada injeção de dependências do java. No nosso caso, usamos o AutoWired para automatizar um dos campos presentes no método RestController.

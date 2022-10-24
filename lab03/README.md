#A questao 3.1 está presente na pasta users
- Repostas para as perguntas do 3.1
a)O novo Repositório é instanciado com a notaçao @AutoWired. Isso elimina a necessidade de criarmos getters e setters para uma classe. Para além disso, o @AutoWired permite que permite a injeçao das dependencias para o SpringBoot, de forma que nao precisamos fazer isto de forma manual com o legacy code INJECT.

b) Os métodos save(), findAll(), findById() e delete() foram usados. Estes métodos estao definidos pela classe-mae CrudRepository, que é fornecida pelo springframework.data.repository e extendida na nossa interface UserRepository

c)Os dados sao salvos em memória, até que o método flush seja chamado e possa sincronizar os dados com o DB.

d)A anotaçao @NotBlank está declarada utilizando o import javax.validation.constraints.NotBlank, que basicamente nos permite que um valor nao seja Null e tenha um tamanho maior do que zero (para o caso de strings, isso é muito importante, já que podemos enviar "").


#A questao 3.2 está presente na pasta employees

Entry Point http://localhost:8080/employees
Data initial= {"firstName": "Marcel", "lastName": "estudante","emailId": "marcelaraujo@ua.pt"}
    {
        "id": 6,
        "firstName": "Marcel",
        "lastName": "estudante",
        "emailId": "marcelaraujo@ua.pt"
    }


NOTAS IMPORTANTES
Spring Data JPA also lets you define other query methods by declaring their method signature. For example, CustomerRepository includes the findByLastName() method.

# REVIEW QUESTIONS

## QUESTAO A
Para além do RestController ser algo muitíssimo mais atual, afinal, só foi adicionado ao SpringBoot na versão 4.0 (enquanto o Controller está desde a versão 2.4), podemos citar como diferenças:
- @RestController é utilizado para padrões Restful Web Service, enquanto o @controller é usado em formatos MVC Java.
- Usando o @component, como vimos no guião anterior, é possível retornar uma view (HTML), já com o RestController, apenas retornamos dados sem estilização. Para isso, usamos um processo de envio para os arquivos HTML dos dados retirados das requisições manejadas pelo RestController
- Utilizando o @Controller, será necessário utilizarmos o @ResponseBody para todos os métodos que desejamos manejar. Utilizando o @RestController, esta anotação já é um default, ou seja, não precisamos digitar ela sempre que iniciamos um novo controle sobre uma requisição.
- Ambos são utilizados sobre classses

## QUESTAO B

## QUESTAO C
Todas essas notações fazem parte do pacote DataJPA e servem respetivamente para:
@Column= Dar um nome específico para a coluna em questão na base de dados SQL (pode ser omitida e assim teremos um nome default)
@Table=Dar um nome específico para a tabela em questão na base de dados SQL (pode ser omitida e assim teremos um nome default)
@id=Usado para identificar que a variável que vem abaixo desta notação, será usada como PRIMARY KEY da table em questão

## QUESTAO D
Para além de não necessitar criar os métodos getters e setters, o autowired torna automatizada a chamada injeção de dependências do java. No nosso caso, usamos o AutoWired para automatizar um dos campos presentes no método RestController.

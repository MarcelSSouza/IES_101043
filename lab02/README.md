Neste guião aprendi muito sobre APIS e o Java para desenvolvimento WEB. Seguem as minhas considerações

EXERCICIOS 2.1 e 2.2 nas pastas TOMCAT

EXERCICIOS 2.3 na pasta API (há as duas opçoes de Greeting)

EXERCICIO 2.4 na pasta SHOWDB


REVIEW QUESTIONS:

A-
Um servlet nada mais é do que um servidor que receberá requisições HTTP, poderá processar estasm requisições e devolver ao cliente em forma de texto, imagem, etc. Utilizamos o pacote JAVAX.SERVLET e, como tudo em java é orientado em objetos, utilizamos uma subclasse
Ao receber uma requisição, um Servlet pode capturar os parâmetros desta requisição, efetuar qualquer processamento inerente a uma classe Java, e devolver uma página HTML.
Em resumo, os servlets servem para:
-Processar ou armazenar dados que foram submetidos de um formulário HTML
-Fornecer conteúdo dinâmico, como os resultados de uma consulta a um banco de dados
-Gerenciar a informação de estado que não existe no protocolo sem estado HTTP, como inserir/retirar os itens de uma cesta de compras de um cliente específico

B- No exemplo do ultimo exercicio, o Controller seria a classe de mesmo nome UsersController.java (que é a responsável pela comunicação entre MODEL e VIEW, tratar das requisições e toda a logica da aplicação), o VIEW seriam as paginas HTML utilizadas no exemplo do Greeting (que recebem conteúdo passado pelo controller e são também alteradas de acordo com a lógica do controller) e, por fim, o MODEL seria a lógica de banco de dados (no nosso caso, foi apenas utilizado uma lista em ShowDbs, mas na aplicação real seriam o Banco de Dados e as Queries de acesso )

C-AS Starter Dependencies são muito importantes para mninimizar a quantidade de dependências que colocamos manualmente no arquivo POM. Por exemplo, ao invés de adicionar TomCat,SpringMVC, Jackson, podemos apenas adicionar o Spring-Web-Starter. Este, fará com que as versões das dependências sejam coesas e que o nosso arquivo POM.xml não fique muito bagunçado (como fica de costume).

D-Citando alguns:
-@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
-@ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
-@Configuration: allow to register extra beans in the context or import additional configuration classes

Tentei utilizar em específico o JPA com o H2 para criar uma Fake Database e, para isso, era necessário adicionar novoc Beans como o @Entity e etc. Portanto, a utilização destas ferramentas se torna muito importante diversas vezes.


E-
1-Usar substantivos, não verbos, nos endpoints
Achei muito importante, afinal, em APIs buscamos, de certa forma, "Objetos", "coisas concretas" e não realizar ações, portanto, nada mais correto do que utilizar NOUNS not VERBS

2- Lidar com erros de forma graciosa
Acho que temos poucos exemplos disto, mas deve ser sempre evitado os erros padrões (algo que eu poderia ter feito, mas nao tive tempo haha)

3- Mante ruma boa segurança da API
Principalmente quando se trata de dados sensiveis, é muito importante a segurança.

4-Manter dados em cache para te rmelhor perfomance
Hoje em dia, se torna cada vez mais importante a utilização disto para chamadas regulares. Obviamente, deve ser usado para os endpoints mais utilizados

5- Versionar a API
Importante em qualquer âmbito tecnologico. Criar versões dos códigos torna tudo mais simples para programadores, Devops e utilizadores.
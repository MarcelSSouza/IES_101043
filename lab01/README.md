# IES_101043

- Utilizamos o Maven para organizar melhor um projeto Java. Para alem da organizacao, o uso de dependencias é simplificado, afinal, podemos enviar o aquivo POM para um colega que estejamos trabalhando em equipe e ele poderá instalar todas as dependencias de forma automatizada.
 
$ mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false


- Basicamnete, usamos o -D para denotar uma propiedade Maven antes de iniciar o projeto. O groupId precisa utilizar o padrao de nomeacao de pacotes, ou seja, deve ter um dominio com.meuapp. Ja o artifactID precisa somente nomear de forma simples o nosso projeto como meu-app.

- Obviamente, devemos ter os pacotes java e javac

- Ao criar o projeto maven, devemos sempre segui um lifecycle de Clean, Package e Run. 

- No arquivo POM.xml podemos adicionar quaisquer bibliotecas que queiramos utilizar no nosso projeto, usando a TAG dependency

- Um archetype é o tipo de arquitetura inicial de software que iremos utilizar

- Para rodar o nosso projeto, usamos tambem o MVN. Comando: mvn exec:java -Dexec.mainClass="PACOTE"

PARTE 1.3

- Como já estou muito acostumado com git, resolvi pular as anotaçoes por julgar trivial o que havia no guiao

$ cd projectfolder # move to the root of the working folder to be imported
$ git init # initialize a local git repo in this folder
$ git remote add origin <REMOTE_URL> #must adapt the url for your repo
$ git add . # mark all existing changes in this root to be commited
$ git commit -m "Initial commit" 
$ git push -u origin main 

- Aqui o guiao tambem nos informa sobre a importancia do .gitignore, o que de fato é bem importante :)

- Um comando interessante desse guiao é o git log --reverse --oneline

- Para realizar o Log eu utilizei a lib Logger que é padrao do java

PARTE 1.4

- Tive problemas com o Docker, uma vez que a janela que é aberta via WSL2 nao conversa com o windows.

- No docker, temos a imagem do container, o container em si e o script do container (DockerFile). Achei um assunto bastante interessante. Buscarei mais sobre.

- Usando docker --help temos acesso a tudo necessario para aprender mais sobre como usar o docker.

- Alguns dos comandos utilizados foram docker run, 




















REVIEW QUESTIONS

1) O default se ocupa de realizar o deploy do projeto Maven, o clean se ocupa de limpar os arquivos desnecessarios para que possamos enviar o arquivos à um amigo de forma simplificada (sem arquivos binarios de compilacao e sem dependencias baixadas) e, por fim, o site se procupa em administrar a criacao do website do projeto
Para um melhor entendimento, a documentacao está em https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Lifecycle_Reference

2) Sim, podemos usar o Maven para rodar o nosso projeto. inclusive, podemos passar alguns argumentos junto com o comando MVN, que é:

mvn exec:java -Dexec.mainClass="weather.WeatherStarter"

3) Provavelmente, para contribuir com um projeto, usaremos:

git clone URL/SSH
-IMPLEMENTO-
git add .
git commit - "Commit text"
git push origin BRANCH (normalmente, será Main)

4) A mensagem de commit deve iniciar com um titulo usando no maximo 50 chars usando Tittle Case. Para além disso, adicionar um corpo na mensagem de commit se for necessário ao tamanho do commit. Nesta mensagem, explicar QUAL foi a mudanca e POR QUE ocorreu a mudanca. Deixar sempre um espaco entre o titulo do commit e o texto. Alem disso, podemos usar o "-" se quisermos pontuar um Bullet Point e separar os parágrafos sempre com uma linha em branco.






# IES_101043
$ mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -
DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -
	DinteractiveMode=false

Basicamnete, usamos o -D para denotar uma propiedade Maven antes de iniciar o projeto

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






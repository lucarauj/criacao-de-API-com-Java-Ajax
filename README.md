[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/LICENSE)

<h1 align="center"> Criação de API Rest com Java e Ajax </h1>

<p align="center"><img width="200px" src="https://github.com/lucarauj/assets/blob/main/ApiJavaSpring.png" /></p>

### ❌ Conteúdo:
- Spring Boot REST API Tela de Pesquisa Modal;
- Model e Tabela de banco;
- Repository Spring Data;
- End-Point POST, PUT, DELETE e GET;
- Configuração com Maven;
- Geração de Jar de Deploy;
- Ajax com JQuery para API;

### ⚙ Configurando ```pom.xml```:
```
<dependency>
	<groupId>org.postgresql</groupId>
	<artifactId>postgresql</artifactId>
	<scope>runtime</scope>
</dependency>
```
```
<properties>
	<maven.test.skip>true</maven.test.skip>
</properties>
```
### 🛠 Configurando ```application.properties```:
```
spring.datasource.url= jdbc:postgresql://localhost:5432/spring-boot-rest
spring.datasource.username=postgres
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = false
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect
```

### ❌ Utilizando o Postman:

- POST - salvar
<img width="800px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/POST%20salvar.png"/>

- GET - listar
<img width="800px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/GET%20listar.png"/>

- GET buscarNome
<img width="800px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/GET%20buscarNome.png"/>

- GET buscarId
<img width="800px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/GET%20buscarId.png"/>

- PUT - atualizar
<img width="800px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/PUT%20atualizar.png"/>

- DELETE - deletar
<img width="800px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/DELETE%20deletar.png"/>

### 🎲 Utilizando o PostgreSQL:

<img width="800px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/PostgreSQL.png"/>

### 🗜 Gerando arquivo JAR do Spring Boot com Maven:

- Comando cmd: ```mvn clean package```

- Comando cmd: ```java -jar springboot-rest-api-sample-1.0.0-SNAPSHOT.jar```

### Criando o arquivo ```index.html``` e utilizando o ```JQuery CDN minified```:
```
<script
  src="https://code.jquery.com/jquery-3.6.3.min.js"
  integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
  crossorigin="anonymous"></script>
```

### ❌ Utilizando Ajax com JQuery:

- Tela - Home
<img width="600px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/TelaHome.png" />

- Tela - Pesquisa
<img width="600px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/TelaPesquisa.png"/>

- Tela - Cadastrar
<img width="600px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/TelaCadastrar.png"/>

- Tela - Listar
<img width="600px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/TelaListar.png"/>

- Tela - Editar
<img width="600px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/TelaEditar.png"/>

- Tela - Deletar
<img width="600px" src="https://github.com/lucarauj/criacao-de-API-com-Java-Ajax/blob/main/image/TelaDeletar.png"/>

### 📝 Anotações utilizadas no projeto:

- @SpringbottApplication:
- @RestController: marca a classe como um controlador onde cada método retorna um objeto de domínio em vez de uma visão;
- @Entity: utilizada para informar que uma classe também é uma entidade;
- @Id: especifica o identificador da entidade, que é usado ao carregar a entidade em um determinado contexto de persistência;
- @SequenceGenerator: usada para especificar a sequência de banco de dados usada pelo gerador de identificadores da entidade anotada atualmente;
- @GeneratedValue (GenerationType.SEQUENCE): o Hibernate utilizará as sequences do banco de dados para gerar as chaves primárias;
- @Repository: serve para definir uma classe como pertencente à camada de persistência;
- @Autowired:delega ao Spring Boot a inicialização do objeto;
- @GetMapping: usada para mapear solicitações HTTP GET em métodos manipuladores específicos;
- @ResponseBody: usada para transformar um objeto Java retornado do controller em uma representação de recurso solicitada por um cliente REST;
- @RequestBody: indica que o valor do objeto virá do corpo da requisição;
- @PostMapping: usada para mapear solicitações HTTP POST em métodos específicos de manipulador;
- @DeleteMapping: usada para mapear solicitações HTTP DELETE em métodos manipuladores específicos;
- @RequestParam: usada para mapear os parâmetros HTTP a argumentos de métodos;
- @PutMapping: usada para mapear solicitações HTTP PUT em métodos manipuladores específicos;
- @Query: permite criar instruções SQL e expor essas instruções como métodos DAO;

## 🚀 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:
<div style="display: inline_block"><br>
<img align="center" alt="Lucarauj-Java" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg">
<img align="center" alt="Lucarauj-Postman" height="60" width="110" src="https://github.com/lucarauj/assets/blob/main/postman.png">
<img align="center" alt="Lucarauj-Spring" height="40" width="50" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg">
<img align="center" alt="Lucarauj-Postgresql" height="50" width="60" src="https://github.com/lucarauj/assets/blob/main/postgresql.svg">
<img align="center" alt="Lucarauj-JQuery" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/jquery/jquery-original-wordmark.svg" />
          
</div>

## Aluno

Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>

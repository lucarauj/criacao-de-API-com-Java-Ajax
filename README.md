Conteúdo:

Spring Boot REST API Tela de Pesquisa Modal;
Model e Tabela de banco;
Repository Spring Data;
End-Point POST, PUT, DELETE e GET;
Configuração com Maven;
Geração de Jar de Deploy;
Ajax com JQuery para API;


- Criar projeto Maven
- Utilizar pgAdmin (PostgreSQL)

pom.xml
```
<dependency>
	<groupId>org.postgresql</groupId>
	<artifactId>postgresql</artifactId>
	<scope>runtime</scope>
</dependency>
```

application.properties
```
spring.datasource.url= jdbc:postgresql://localhost:5432/spring-boot-rest
spring.datasource.username=postgres
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = false
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect

```

Anotações:

@SpringbottApplication
@RestController
@Entity
@Id
@SequenceGenerator
@GeneratedValue
@Repository
@Autowired
@GetMapping
@ResponseBody
@RequestBody
@DeleteMapping
@RequestParam
@PutMapping
@Query

Gerando arquivo JAR do Spring Boot com Maven

Comando cmd: mvn clean package

arquivo pom.xml:

```
<properties>
	<maven.test.skip>true</maven.test.skip>
</properties>
```

Comando cmd: java -jar springboot-rest-api-sample-1.0.0-SNAPSHOT.jar

Criação de página inicial com Bootstrap
- index.html

Utilizando o JQuery CDN minified

Salvando com AJAX  




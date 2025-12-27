<h1 align="center">
  Todo-List
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Social&message=@evandersondev&color=EA2027&labelColor=000000" alt="@evandersondev" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Curso&color=EA2027&labelColor=000000" alt="Curso" />
</p>

API de tarefas usando Java e Spring Boot, um todo-list desenvolvido no curso introdutório java da Rocketseat [Java com Spring Boot - Curso Introdutório](https://app.rocketseat.com.br/jornada/java-com-spring-boot-curso-introdutorio/visao-geral) para aprender as principais práticas para criação de backend.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Lombok](https://projectlombok.org/)
- [H2](https://www.h2database.com/html/main.html)

## Práticas adotadas

- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Autenticação basic auth
- Dockerfile
- Deploy no Render

## Como Executar

- Clonar repositório git
- Construir o projeto:

```
$ ./mvnw clean package
```

- Executar a aplicação:

```
$ java -jar target/todolist-1.0.0.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Usuário

```http
POST http://localhost:8080/users
Content-Type: application/json


{
    "name": "John Doe",
    "username": "johndoe",
    "password": "123456"
}
```

<br>

- Criar Tarefa

```http
POST http://localhost:8080/tasks
Content-Type: application/json
Authorization: Basic johndoe:123456

{
    "description": "New task created",
    "title": "Spring boot stater",
    "priority": "High",
    "startAt": "2025-12-27T13:00:00",
    "endAt": "2025-12-31T10:30:00"
}
```

<br>

- Listar Tarefas

```http
GET http://localhost:8080/tasks
Authorization: Basic johndoe:123456
```

- Atualizar Tarefa
  <br>

```http
PUT http://localhost:8080/tasks/{id}
Content-Type: application/json
Authorization: Basic evandersondev:123456

{
    "title": "Spring Boot Updated"
}
```

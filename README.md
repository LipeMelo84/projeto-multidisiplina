
**Curso:** Análise e Desenvolvimento de Sistemas
**Disciplina:** Desenvolvimento Web – Back-End
**Aluno:** Felipe Reiz
**RU:** 4302932
**Projeto:** API RESTful de Gerenciamento de Tarefas

---

## 🧠 Sobre o Projeto

Este projeto tem como objetivo desenvolver uma **API RESTful** para **gerenciar tarefas**, utilizando o **Spring Boot** como base.
A ideia é colocar em prática os principais conceitos do desenvolvimento back-end com Java, como **CRUD**, **JPA**, **banco de dados relacional (MySQL)**, e **documentação com Swagger**.

Com ela, é possível cadastrar novas tarefas, listar todas, buscar por ID, atualizar informações e excluir tarefas.
Além disso, o sistema foi estruturado com o padrão **Controller → Service → Repository**, o que deixa o código mais limpo e organizado.

---

## 🧩 Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3.3.4**
* **Spring Web**
* **Spring Data JPA**
* **MySQL**
* **Swagger / OpenAPI 3**
* **Maven**

---

## ⚙️ Como Configurar e Executar

### 1️⃣ Pré-requisitos

Antes de rodar o projeto, é necessário ter instalado:

* **Java JDK 17 ou superior**
* **MySQL**
* **Maven**
* Uma **IDE** de sua preferência (VS Code, IntelliJ, Eclipse etc.)

---

### 2️⃣ Configuração do Banco de Dados

No MySQL, o banco é criado automaticamente.
As configurações estão no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tarefas_api?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=America/Sao_Paulo
spring.datasource.username=root
spring.datasource.password=
```

Se seu MySQL tiver senha, basta colocá-la após o sinal de igual.
Exemplo:

```
spring.datasource.password=minhasenha
```

---

### 3️⃣ Rodando a Aplicação

**Pela IDE:**
Basta executar a classe principal `TarefaApplication.java`.

**Pelo terminal:**

```bash
mvn clean package
java -jar target/tarefa-0.0.1-SNAPSHOT.jar
```

A API vai rodar no endereço:
👉 [http://localhost:8080](http://localhost:8080)

---

## 🌐 Documentação (Swagger)

O Swagger fornece uma interface visual para testar a API sem precisar usar outras ferramentas.

Para acessar:
👉 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 📡 Endpoints Disponíveis

| Método | Endpoint            | Descrição                     |
| ------ | ------------------- | ----------------------------- |
| GET    | `/api/tarefas`      | Lista todas as tarefas        |
| GET    | `/api/tarefas/{id}` | Busca uma tarefa pelo ID      |
| POST   | `/api/tarefas`      | Cadastra uma nova tarefa      |
| PUT    | `/api/tarefas/{id}` | Atualiza uma tarefa existente |
| DELETE | `/api/tarefas/{id}` | Remove uma tarefa pelo ID     |

---

## 🧾 Exemplo de JSON para cadastro ou atualização

```json
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Revisar anotações e preparar a API para entrega",
  "concluida": false
}
```

---

## 🧱 Estrutura do Projeto

```
tarefa/
├── pom.xml
├── src/
│   ├── main/java/com/felipe/reiz/tarefa/
│   │   ├── TarefaApplication.java
│   │   ├── controller/TarefaController.java
│   │   ├── model/Tarefa.java
│   │   ├── repository/TarefaRepository.java
│   │   └── service/TarefaService.java
│   └── resources/application.properties
```

---

## 💡 Considerações Finais

O desenvolvimento desta API foi uma boa oportunidade para aplicar, na prática, conceitos importantes do **Spring Boot** e entender melhor como funciona uma arquitetura de back-end bem estruturada.
O projeto é simples, mas cobre todo o ciclo CRUD e mostra claramente como conectar uma aplicação Java a um banco de dados MySQL com segurança e eficiência.

---

📅 **Data de entrega:** Outubro de 2025
👨‍💻 **Autor:** Felipe Reiz
🏫 **Centro Universitário Internacional – UNINTER**


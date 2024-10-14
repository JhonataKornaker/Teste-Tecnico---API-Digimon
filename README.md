# Teste Técnico - Digimon API

Este projeto é uma API REST desenvolvida em Spring Boot para consultar e gerenciar informações sobre Digimons.

## Funcionalidades
- Listar todos os Digimons.
- Buscar Digimon por nome.
- Buscar Digimon por level.

## Tecnologias Utilizadas
- Java 17
- Spring Boot 3.3.4
- Maven
- Swagger UI
- JPA
- PostegreSQL (rodando em container Docker)
- Docker e Docker Compose
- Lombok
- Flywaydb

## Como Executar o Projeto
### Pré-requisitos
- JDK 17
- Maven
- Docker
- IDE

### Passos
1. Clone o repositório:
    ```
   https://github.com/JhonataKornaker/apiDigimon.git
   cd apiDigimon
   ```
2. Suba os container do Docker:

   **Antes de rodar o comando abaixo é necessário abrir o Docker Desktop antes**

   ```
   docker-compose up -d
   ```
   Isso iniciará o container com o banco de dados PostgreSQL


3. Executar o projeto:


   - Abra o projeto na sua IDE


   - Localize a classe principal da aplicação, que geralmente está anotada com @SpringBootApplication. No caso do meu projeto, seria algo como ApiDigimonApplication.java.


   - Clique no botão de "Play" ao lado do método main, ou clique com o botão direito na classe e selecione "Run".

   
   A aplicação estará disponível em http://localhost:8080.


4. Acessar o Swagger UI:

   Para visualizar e testar os endpoints via interface Swagger, acesse:
   ```
   http://localhost:8080/swagger-ui.html
   ```

## Endpoints Principais
| Método | Endpoint                   | Descrição                                 |
|--------|----------------------------|-------------------------------------------|
| GET    | /api/digimon               | Lista todos os Digimons                   |
| GET    | /api/digimon/name/{name}   | Busca um Digimon pelo nome                |
| GET    | /api/digimon/level/{level} | Busca todos os Digimons com o mesmo level |


### Desenvolvido por **Jhonata Kornaker**

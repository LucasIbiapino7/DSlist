# DSList

# Sobre o projeto

Visa implementar um sistema simples de Games e Listas de Jogos onde temos a opção de mudar a posição de um jogo dentro da sua Lista. 

## Modelo conceitual
![Modelo Conceitual](https://github.com/LucasIbiapino7/assets/blob/main/imgs/DSLIST.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Postman
# Competências
- Desenvolvimento em Camadas
- Consultas personalizadas
# Features
- Retorna Uma Lista com todos os Jogos
- Retorna Uma lista com todas as Listas de jogos
- Retorna uma Lista com todos os Jogos de uma Lista. Exemplo:
```json
[
    {
        "id": 1,
        "title": "Mass Effect Trilogy",
        "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png",
        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!",
        "year": 2012,
        "position": 0
    },
    {
        "id": 2,
        "title": "Red Dead Redemption 2",
        "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/2.png",
        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!",
        "year": 2018,
        "position": 1
    },
    {
        "id": 3,
        "title": "The Witcher 3: Wild Hunt",
        "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/3.png",
        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!",
        "year": 2014,
        "position": 2
    },
    {
        "id": 4,
        "title": "Sekiro: Shadows Die Twice",
        "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/4.png",
        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!",
        "year": 2019,
        "position": 3
    },
    {
        "id": 5,
        "title": "Ghost of Tsushima",
        "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/5.png",
        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!",
        "year": 2012,
        "position": 4
    }
]
```
- Retorna um Jogo pelo seu ID. Exemplo:
```json
{
    "id": 1,
    "title": "Mass Effect Trilogy",
    "year": 2012,
    "genre": "Role-playing (RPG), Shooter",
    "platforms": "XBox, Playstation, PC",
    "score": 4.8,
    "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png",
    "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!",
    "longDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa."
}
```
- Move a posição de um jogo dentro da Lista

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git@github.com:LucasIbiapino7/DSlist.git
```
# Autor

Lucas Ibiapino Do Nascimento Duarte



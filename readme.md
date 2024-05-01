# Projeto AppRH

O projeto **AppRH** é um sistema de Recursos Humanos que permite o cadastro de vagas de emprego e candidatos para essas vagas. Desenvolvido utilizando Java, Spring Boot e Thymeleaf, oferece uma interface simples e intuitiva para gerenciar o processo de recrutamento.

## Tecnologias Utilizadas

- Java
- Spring Boot (Framework MVC)
- Thymeleaf (Template Engine)
- Bootstrap (Front-end Framework)

## Como Executar o Projeto

Para executar o projeto, siga estas etapas:

1. Certifique-se de ter o Java instalado em sua máquina.
2. Clone ou baixe este repositório para o seu ambiente local.
3. Abra o projeto em sua IDE preferida.
4. Encontre e execute o arquivo `AppRhApplication.java` como uma aplicação Spring Boot.
5. Acesse o sistema em seu navegador web utilizando o endereço [http://localhost:8080](http://localhost:8080).

## Funcionalidades Principais

- Cadastro de Vagas de Emprego: Permite o cadastro de novas vagas, incluindo nome, descrição do cargo, data de expiração e salário.
- Cadastro de Candidatos: Possibilita o cadastro de candidatos interessados nas vagas, incluindo nome, RG e e-mail.
- Listagem de Vagas e Candidatos: Exibe todas as vagas de emprego cadastradas, bem como os candidatos inscritos em cada vaga.
- Exclusão de Candidatos: Permite a exclusão de candidatos inscritos em uma vaga específica.

## Estrutura do Projeto

O projeto está estruturado de acordo com a arquitetura MVC (Model View Controller), dividido em:

- **Model**: Classes Java que representam os objetos de domínio, como Vaga e Candidato.
- **View**: Templates HTML com Thymeleaf para renderização da interface do usuário.
- **Controller**: Classes Java que implementam a lógica de negócios e controlam o fluxo da aplicação.

## Contribuindo

Sinta-se à vontade para contribuir com melhorias ou correções neste projeto. Basta criar um fork deste repositório, fazer as alterações desejadas e enviar um pull request.

Esperamos que o **AppRH** seja útil e ajude na gestão eficiente do processo de recrutamento em sua empresa!
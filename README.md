A estrutura da aplicação segue uma arquitetura em camadas, composta por Controller, Service, Repository e Model, proporcionando uma separação clara de responsabilidades e facilitando a manutenção e a escalabilidade do projeto.

A camada Controller gerencia as requisições HTTP e direciona as operações para os serviços apropriados.
A camada Service contém a lógica de negócios e garante a integridade das operações antes de enviar ou buscar dados do repositório.
A camada Repository é responsável pelo acesso ao banco de dados, utilizando o Spring Data JPA para interações com o MySQL de maneira simplificada e eficiente.
A camada Model define as entidades do domínio do projeto, representando os dados que serão armazenados e manipulados.
A configuração do projeto está centralizada no arquivo application.properties, onde são definidos os detalhes da conexão com o banco de dados MySQL, como URL, nome de usuário e senha.

O arquivo pom.xml contém todas as dependências essenciais, incluindo Spring Boot, Spring Data JPA e MySQL Connector, que permitem a execução da aplicação, o mapeamento objeto-relacional (ORM) e a conexão com o banco de dados.

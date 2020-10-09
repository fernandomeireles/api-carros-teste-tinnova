# api-carros-teste-tinnova
Repositório criado para a api de controles sobre carros do teste TINNOVA

A api back-end, foi escrita em Java 8, o banco utilizado é MySql 8.

Para utilizar a api siga os passos abaixo:

1º Execute o script "cria_alimenta_tabela", que esta na pasta "Script", no usuário de banco que irá utilizar na api.
2º Altere o arquivo "application.properties" que fica em "\api-carros-teste-tinnova\api.car.tinnova\src\main\resources", inserindo o endereço do banco, usuario e senha que irá utilizar.
3º Compile o projeto com o maven (mvn clean install) via terminal ou utilizando IDEs, e na pasta "\api-carros-teste-tinnova\api.car.tinnova\target", execute o script para inicialização correspondente ao seu sistema operacional para iniciar o projeto. (Opcional o projeto também pode ser iniciado via IDEs).
4º Acesse o endereço http://localhost:8080/api-car-tinnova/swagger-ui.html#/. Agora poderá validar e testar as funcionalidades.

Espero que gostem ! 

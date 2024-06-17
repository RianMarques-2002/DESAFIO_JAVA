📦 #Desafio de Componentes e Injeção de Dependência com Spring Boot

📝 ## Descrição breve do projeto

Este projeto é uma aplicação Java desenvolvida com Spring Boot para calcular o valor total de um pedido. O cálculo inclui a aplicação de um desconto ao valor básico do pedido e a adição do valor do frete, seguindo regras específicas. A aplicação exemplifica o uso de componentes e injeção de dependência, promovendo a separação de responsabilidades e boas práticas de desenvolvimento.

🚀 ## Problema que o projeto resolve

O projeto resolve o problema de cálculo do valor total de um pedido, considerando um percentual de desconto e o custo do frete.
O sistema permite que diferentes componentes cuidem de responsabilidades específicas: um componente para o cálculo do frete e outro para o cálculo do valor total do pedido.

💻 ## Instruções de instalação e execução

📋 ### Pré-requisitos

- Java 11 ou superior
- Maven

🛠️ ### Passos para instalação e execução

1. **Clone o repositório**

   ```bash
   git clone https://github.com/RianMarques-2002/DESAFIO_JAVA.git
   cd DESAFIO_JAVA
   ```

2. **Compile o projeto**

   ```bash
   mvn clean install
   ```

3. **Execute a aplicação**

   ```bash
   mvn spring-boot:run
   ```

4. **Acesse a aplicação**

   A aplicação estará disponível no localhost em `http://localhost:8080`.

### Exemplo de requisição

Você pode calcular o valor total de um pedido utilizando o endpoint `/order/total` com os parâmetros `code`, `basicValue` e `discountPercentage`. Por exemplo:

```bash
curl "http://localhost:8080/order/total?code=1034&basicValue=150.00&discountPercentage=20.0"
```

A resposta deverá sair como:

```
Pedido código 1034
Valor total: R$ 132.00
```

🔍 ## O que aprendi com esse projeto

Durante o desenvolvimento deste projeto, aprendi a:

1. **Utilizar o Spring Boot**: Como configurar e executar uma aplicação Spring Boot, incluindo a criação de serviços e controladores REST.
2. **Injeção de dependência**: A importância da injeção de dependência para promover a modularidade e a facilidade de manutenção do código.
3. **Separação de responsabilidades**: Como estruturar o código em diferentes componentes, cada um com sua responsabilidade específica, para melhorar a clareza e a organização do projeto.
4. **Boas práticas de desenvolvimento em Java**: Escrever código limpo, comentado e bem estruturado, seguindo as convenções do Java e do Spring Framework.
5. **Desenvolvimento orientado a serviços**: Implementar e gerenciar serviços que encapsulam a lógica de negócios de maneira independente e reutilizável.

Este projeto proporcionou uma excelente oportunidade para consolidar esses conceitos e aplicar as melhores práticas de desenvolvimento em um cenário prático.

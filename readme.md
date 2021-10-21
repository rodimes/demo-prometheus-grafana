# Monitorando aplicativos Spring Boot com Prometheus e Grafana

Este pequeno projeto de demonstração contém uma configuração de exemplo do Prometheus e Grafana para monitorar aplicativos Spring Boot.

O projeto contem os datasorces padroes para (Grafana / Prometheus) e coleta informacoes da applicacao Spring Boot com Prometheus server
para monitoraento atraves de dashboard do grafana.

Se você quiser fazer o login no Grafana, pode usar a combinação `admin / password`.


## Construindo o projeto

Primeiro, crie o aplicativo de inicialização spring boot, compilando o projeto com o seguinte comando:

```bash
mvn clean package
```

Agora, quando o aplicativo foi criado, podemos começar a executar nossos serviços executando:

```bash
docker-compose build
docker-compose up
```

Depois que todos os serviços forem iniciados com sucesso, você pode navegar para os seguintes urls:

- Spring Boot app - http://localhost:8080/
- Prometheus      - http://localhost:9090/
- Grafana         - http://localhost:3000/

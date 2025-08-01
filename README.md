# Delivery Tech API

Sistema de delivery desenvolvido com Spring Boot e Java 21.

![Java Version](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.x-brightgreen)

## 🚀 Tecnologias

- **Java 21 LTS** (versão mais recente)
- Spring Boot 3.2.x
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## ⚡ Recursos Modernos Utilizados

- Records (Java 14+)
- Text Blocks (Java 15+)
- Pattern Matching (Java 17+)
- Virtual Threads (Java 21)

## 📁 Estrutura do Projeto

```
.
├── Dockerfile
├── docker-compose.yml
├── mvnw
├── mvnw.cmd
├── pom.xml
├── readme.md
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── deliverytech
    │   │           └── api
    │   │               ├── ApiApplication.java
    │   │               ├── config
    │   │               │   ├── CorsConfig.java
    │   │               │   ├── DataInitializer.java
    │   │               │   ├── MetricsConfig.java
    │   │               │   ├── OpenApiConfig.java
    │   │               │   ├── SecurityConfig.java
    │   │               │   └── SwaggerConfig.java
    │   │               ├── controller
    │   │               │   ├── AuthController.java
    │   │               │   ├── AuthController_Clean.java
    │   │               │   ├── AuthController_old.java
    │   │               │   ├── ClienteController.java
    │   │               │   ├── ClienteController_Clean.java
    │   │               │   ├── EntregaController.java
    │   │               │   ├── EntregadorController.java
    │   │               │   ├── EntregadorController_clean.java
    │   │               │   ├── MinimalController.java
    │   │               │   ├── PedidoController.java
    │   │               │   ├── ProdutoController.java
    │   │               │   ├── RestauranteController.java
    │   │               │   ├── TestController.java
    │   │               │   └── UsuarioController.java
    │   │               ├── dto
    │   │               │   ├── request
    │   │               │   │   ├── AtualizarStatusPedidoRequest.java
    │   │               │   │   ├── ClienteRequest.java
    │   │               │   │   ├── ItemPedidoRequest.java
    │   │               │   │   ├── LoginRequest.java
    │   │               │   │   ├── PedidoRequest.java
    │   │               │   │   ├── ProdutoExemploRequest.java
    │   │               │   │   ├── ProdutoRequest.java
    │   │               │   │   ├── RegisterRequest.java
    │   │               │   │   ├── RestauranteRequest.java
    │   │               │   │   └── UsuarioRequest.java
    │   │               │   └── response
    │   │               │       ├── ApiResponse.java
    │   │               │       ├── ClienteResponse.java
    │   │               │       ├── ItemPedidoResponse.java
    │   │               │       ├── PedidoResponse.java
    │   │               │       ├── ProdutoResponse.java
    │   │               │       ├── RestauranteResponse.java
    │   │               │       └── UsuarioResponse.java
    │   │               ├── exception
    │   │               │   ├── BusinessException.java
    │   │               │   ├── ConflictException.java
    │   │               │   ├── EntityNotFoundException.java
    │   │               │   ├── ErrorResponse.java
    │   │               │   └── GlobalExceptionHandler.java
    │   │               ├── model
    │   │               │   ├── Cliente.java
    │   │               │   ├── Endereco.java
    │   │               │   ├── Entrega.java
    │   │               │   ├── Entregador.java
    │   │               │   ├── ItemPedido.java
    │   │               │   ├── Pedido.java
    │   │               │   ├── Produto.java
    │   │               │   ├── Restaurante.java
    │   │               │   ├── Role.java
    │   │               │   ├── StatusEntrega.java
    │   │               │   ├── StatusEntregaCheck.java
    │   │               │   ├── StatusPedido.java
    │   │               │   └── Usuario.java
    │   │               ├── repository
    │   │               │   ├── ClienteRepository.java
    │   │               │   ├── EntregaRepository.java
    │   │               │   ├── EntregadorRepository.java
    │   │               │   ├── PedidoRepository.java
    │   │               │   ├── ProdutoRepository.java
    │   │               │   ├── RestauranteRepository.java
    │   │               │   └── UsuarioRepository.java
    │   │               ├── security
    │   │               │   ├── JwtAuthenticationFilter.java
    │   │               │   ├── JwtUtil.java
    │   │               │   ├── KeyGenerator.java
    │   │               │   ├── PasswordEncoderGenerator.java
    │   │               │   └── UsuarioDetailsServiceImpl.java
    │   │               └── service
    │   │                   ├── ClienteService.java
    │   │                   ├── ClienteServiceImpl.java
    │   │                   ├── CustomUserDetailsService.java
    │   │                   ├── PedidoService.java
    │   │                   ├── PedidoServiceImpl.java
    │   │                   ├── ProdutoService.java
    │   │                   ├── ProdutoServiceImpl.java
    │   │                   ├── RestauranteService.java
    │   │                   ├── RestauranteServiceImpl.java
    │   │                   └── UsuarioService.java
    │   └── resources
    │       ├── application-dev.properties
    │       ├── application-minimal.properties
    │       ├── application-swagger-test.properties
    │       ├── application-test.properties
    │       ├── application.properties
    │       ├── data.sql
    │       ├── schema.sql
    │       ├── static
    │       └── templates
    └── test
        ├── java
        │   └── com
        │       └── deliverytech
        │           └── api
        │               ├── ApiApplicationTests.java
        │               ├── config
        │               │   └── SwaggerTestSecurityConfig.java
        │               ├── controller
        │               │   ├── AuthControllerIntegrationTest.java
        │               │   ├── AuthControllerTest.java
        │               │   ├── ClienteControllerTest.java
        │               │   ├── EntregaControllerTest.java
        │               │   ├── EntregadorControllerTest.java
        │               │   ├── PedidoControllerTest.java
        │               │   ├── ProdutoControllerTest.java
        │               │   ├── ProdutoControllerTestNew.java
        │               │   ├── RestauranteControllerTest.java
        │               │   ├── RestauranteControllerTestSimples.java
        │               │   ├── RestauranteControllerTestUnitario.java
        │               │   ├── UsuarioControllerSimpleTest.java
        │               │   ├── UsuarioControllerTest.java
        │               │   └── UsuarioControllerUnitTest.java
        │               ├── dto
        │               │   ├── request
        │               │   │   ├── ClienteRequestTest.java
        │               │   │   ├── LoginRequestTest.java
        │               │   │   ├── ProdutoRequestTest.java
        │               │   │   └── RegisterRequestTest.java
        │               │   └── response
        │               │       ├── ApiResponseTest.java
        │               │       ├── ClienteResponseTest.java
        │               │       ├── ItemPedidoResponseTest.java
        │               │       ├── PedidoResponseTest.java
        │               │       ├── ProdutoResponseTest.java
        │               │       ├── RestauranteResponseTest.java
        │               │       └── UsuarioResponseTest.java
        │               ├── exception
        │               │   ├── BusinessExceptionTest.java
        │               │   ├── ConflictExceptionTest.java
        │               │   ├── EntityNotFoundExceptionTest.java
        │               │   ├── ErrorResponseTest.java
        │               │   └── GlobalExceptionHandlerTest.java
        │               ├── model
        │               │   ├── ClienteTest.java
        │               │   ├── EnderecoTest.java
        │               │   ├── EntregaTest.java
        │               │   ├── EntregadorTest.java
        │               │   ├── ItemPedidoTest.java
        │               │   ├── PedidoTest.java
        │               │   ├── ProdutoTest.java
        │               │   ├── RestauranteTest.java
        │               │   ├── RoleTest.java
        │               │   ├── StatusEntregaTest.java
        │               │   ├── StatusPedidoTest.java
        │               │   └── UsuarioTest.java
        │               ├── repository
        │               │   ├── ClienteRepositoryTest.java
        │               │   ├── EntregaRepositoryTest.java
        │               │   ├── EntregadorRepositoryTest.java
        │               │   ├── PedidoRepositoryTest.java
        │               │   ├── ProdutoRepositoryTest.java
        │               │   ├── RestauranteRepositoryTest.java
        │               │   └── UsuarioRepositoryTest.java
        │               ├── security
        │               │   ├── JwtAuthenticationFilterTest.java
        │               │   ├── JwtUtilTest.java
        │               │   └── UsuarioDetailsServiceImplTest.java
        │               ├── service
        │               │   ├── ClienteServiceImplTest.java
        │               │   ├── CustomUserDetailsServiceTest.java
        │               │   ├── PedidoSerivceImplTest.java
        │               │   ├── ProdutoServiceImplTest.java
        │               │   ├── RestauranteServiceImplTest.java
        │               │   └── UsuarioServiceTest.java
        │               └── test
        │                   └── StatusEntregaDebug.java
        └── resources
            └── application-test.properties
```

## 🏃‍♂️ Como executar

1. **Pré-requisitos:** JDK 21 instalado
2. Clone o repositório
3. Execute: `./mvnw spring-boot:run` (Linux/macOS) ou `mvnw.cmd spring-boot:run` (Windows)
4. Acesse: [http://localhost:8080/health](http://localhost:8080/health)

## 🗒️ Endpoints Principais

- `GET /health` - Status da aplicação (inclui versão Java)
- `GET /info` - Informações da aplicação
- `GET /h2-console` - Console do banco H2 (ambiente de desenvolvimento)
- `POST /api/v1/auth/login` - Login do usuário
- `POST /api/v1/auth/register` - Registro de novo usuário
- `GET /swagger-ui.html` - Interface de documentação Swagger
- `GET /v3/api-docs` - Documentação OpenAPI (JSON)

## 🔧 Configuração

- Porta: `8080`
- Banco: H2 em memória
- Profile: `development`

## 🔐 Acesso ao H2 Console

1. Acesse [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
2. Preencha os campos:
   - **JDBC URL:** `jdbc:h2:mem:testdb`
   - **User Name:** `sa`
   - **Password:** (em branco ou conforme definido)
3. Clique em "Connect"

## 🐳 Docker (opcional)

```bash
docker-compose up
```

Ou manualmente:

```bash
docker build -t delivery-tech-api .
docker run -p 8080:8080 delivery-tech-api
```

## 👨‍💻 Desenvolvedor

Enzo Okuizumi - SDE TI 13 ARQUITETURA DE SISTEMAS (TARDE) 02458  
Desenvolvido com JDK 21 e Spring Boot 3.2.x
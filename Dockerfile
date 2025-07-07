# Etapa 1: imagem base com Java
FROM openjdk:21-jdk-slim

# Etapa 2: define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Etapa 3: copia o arquivo JAR para dentro do contêiner
COPY target/seu-app.jar app.jar

# Etapa 4: expõe a porta usada pela aplicação Spring Boot
EXPOSE 8080

# Etapa 5: comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
 
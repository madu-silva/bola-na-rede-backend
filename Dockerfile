FROM openjdk:17

COPY target/bola-na-rede-0.0.1.jar /app/bola-na-rede.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "bola-na-rede.jar"]
# ===== STAGE 1 - BUILD =====
FROM eclipse-temurin:17-jdk AS build

WORKDIR /app

COPY pom.xml .
RUN ./mvnw dependency:go-offline || true

COPY . .
RUN ./mvnw clean package -DskipTests

# ===== STAGE 2 - RUNTIME =====
FROM eclipse-temurin:17-jre

WORKDIR /app

EXPOSE 8080

COPY --from=build /app/target/todolist-1.0.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

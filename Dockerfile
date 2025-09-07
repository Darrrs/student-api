FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Maven wrapper and pom.xml
COPY mvnw ./
COPY .mvn .mvn
COPY pom.xml ./

# Download dependencies
RUN ./mvnw dependency:go-offline -B

# Copy source
COPY src ./src

# Build the app
RUN ./mvnw clean package -DskipTests

# Run the jar
CMD ["java", "-jar", "target/First-0.0.1-SNAPSHOT.jar"]

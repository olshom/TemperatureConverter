FROM maven:latest
LABEL authors="olga"
WORKDIR /app/
COPY . /app/
RUN mvn package
CMD ["java", "-jar", "target/TemperatureConverter.jar"]

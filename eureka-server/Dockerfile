#### Palco 1
FROM openjdk:8-jdk-alpine as build
WORKDIR /workspace/app
COPY pom.xml .
COPY src src
RUN apk add --no-cache maven
RUN mvn install -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

#### Palco 2
FROM openjdk:8-jdk-alpine
ARG DEPENDENCY=/workspace/app/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.delanhese.eurekaserver.EurekaServerApplication"]
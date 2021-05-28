# crud-postgre

### Introduction

> An example of database `CRUD` operation with `AWS RDS PostgreSQL` using `spring-boot` and `maven3.8`. I don't know why but I have just tried this time with `MAVEN` instead of my favourite `Gradle`

### Required Tools & Applications
 - Code Editor or IDE - [IntelliJ Idea](https://www.jetbrains.com/idea/download/#section=mac)
 - AWS-RDS - [AWS Console](https://aws.amazon.com/console/)
 - Database - [DBWeaver](https://dbeaver.io/files/dbeaver-ce-latest-macos.dmg)
 - RestClient - [Postman](https://www.postman.com/downloads/)

<details><summary>Application Configurations & Dependecies</summary>
<p>

- POM.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.5.0</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.techsharezone</groupId>
    <artifactId>crud-postgre</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>crud-postgre</name>
    <description>Demo project for Spring Boot</description>
    <properties>
        <java.version>11</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>

        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>

```
</p>
- application.properties
  
  ```properties
  spring.datasource.url=jdbc:{AWS_RDS_POSTGRESQL_ENDPOINT}/employee
  spring.datasource.username={DB_USRER_NAME}
  spring.datasource.password={DB_PASSWOED}
  spring.jpa.show-sql=true
  spring.jpa.hibernate.ddl-auto=create
  spring.jpa.properties.dialect=org.hibernate.dialect.PostgresSQLDialect
  ```
  </details>
  
## Run application
`
./gradlew bootRun
`
<details><summary>Request Payloads & Responses</summary>
<p>
  
 - Payload for create an employee
  
```ssh
curl -d '{"name":"Saurabh", "deapartment":"IT"}' -H "Content-Type: application/json" -X POST http://localhost:8080/save
```
  
- Fetch all employees
  
```
curl -H "Content-Type: application/json" -X GET http://localhost:8080/employees

```  

  ```json
  [
    {
        "id": 3214,
        "name": "Prashant",
        "department": "Software Engineering"
    },
    {
        "id": 2132,
        "name": "Saurabh",
        "department": "IT"
    },
    {
        "id": 3342,
        "name": "Galaxy",
        "department": "Software Engineer"
    }
]
  
  ```
  
  </p></details>
  
  
Follow me on - [Medium](https://saurabhshcs.medium.com) | [Linkedin](https://www.linkedin.com/in/saurabhshcs/) | [YouTube](https://www.youtube.com/channel/UCSQqjPw7_tfx1Ie4yYHbcxQ?pbjreload=102) | [StackOverFlow](https://stackoverflow.com/users/10719720/saurabhshcs?tab=profile)



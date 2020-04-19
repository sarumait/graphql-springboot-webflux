# Example of GraphQL integration with Spring Boot and WebFlux

To run the application:
```
./mvnw spring-boot:run
```

Once the application is started, you can perform queries to fetch album information, e.g:

```
curl http://localhost:8080/graphql -X POST -H "Content-Type: application/json" -d '{"query":"{allAlbums{name}}"}' -v
```

The voyager UI can be accessed on `http://localhost:8080/voyager`.
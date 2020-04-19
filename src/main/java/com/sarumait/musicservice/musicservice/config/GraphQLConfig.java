package com.sarumait.musicservice.musicservice.config;

import com.sarumait.musicservice.musicservice.graphql.QueryResolver;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {

    public static final String SCHEMA_FILE = "schema.graphqls";

    @Bean
    GraphQLSchema schema() {
        return SchemaParser.newParser()
                .file(SCHEMA_FILE)
                .resolvers(new QueryResolver())
                .build()
                .makeExecutableSchema();
    }

}

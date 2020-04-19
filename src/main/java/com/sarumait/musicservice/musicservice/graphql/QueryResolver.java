package com.sarumait.musicservice.musicservice.graphql;

import com.sarumait.musicservice.musicservice.model.Album;
import graphql.kickstart.tools.GraphQLQueryResolver;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static java.util.Arrays.asList;

public class QueryResolver implements GraphQLQueryResolver {

    private static final List<Album> ALBUMS = asList(new Album("album 1"), new Album("album 2"));

    public CompletableFuture<List<Album>> getAllAlbums() {

        //Or, return Mono.just(ALBUMS).toFuture();

        return Flux.fromIterable(ALBUMS)
                .collectList()
                .toFuture();
    }

}

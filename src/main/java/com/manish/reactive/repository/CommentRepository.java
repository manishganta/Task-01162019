package com.manish.reactive.repository;

import com.manish.reactive.model.Comment;
import reactor.core.publisher.Flux;

public interface CommentRepository {

    Flux<Comment> findAll();

}

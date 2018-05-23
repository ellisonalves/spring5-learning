package com.ellisonalves.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.ellisonalves.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}

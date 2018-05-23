package com.ellisonalves.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.ellisonalves.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}

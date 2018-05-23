package com.ellisonalves.spring5webapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.ellisonalves.spring5webapp.model.Author;
import com.ellisonalves.spring5webapp.model.Book;
import com.ellisonalves.spring5webapp.model.Publisher;
import com.ellisonalves.spring5webapp.repository.AuthorRepository;
import com.ellisonalves.spring5webapp.repository.BookRepository;
import com.ellisonalves.spring5webapp.repository.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	@Autowired
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();
	}

	private void initData() {
		Publisher publisher = new Publisher();
		publisher.setName("foo");

		publisherRepository.save(publisher);

		Author authorOne = new Author("AuthorOne", "AuthorOne");
		Book bookOne = new Book("My book One", "1234", publisher);
		authorOne.getBooks().add(bookOne);
		bookOne.getAuthors().add(authorOne);

		authorRepository.save(authorOne);
		bookRepository.save(bookOne);

		Author authorTwo = new Author("AuthorTwo", "AuthorTwo");
		Book bookTwo = new Book("My book Two", "4321", publisher);
		authorTwo.getBooks().add(bookTwo);
		bookTwo.getAuthors().add(authorTwo);

		authorRepository.save(authorTwo);
		bookRepository.save(bookTwo);
	}

}

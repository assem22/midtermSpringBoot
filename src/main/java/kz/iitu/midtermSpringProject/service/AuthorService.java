package kz.iitu.midtermSpringProject.service;

import kz.iitu.midtermSpringProject.entity.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAllAuthors();

    Optional<Author> findAuthorById(Long id);

    void createAuthor(Author author);

    void updateAuthor(Author author);

    void deleteAuthor(Long id);
}

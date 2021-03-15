package kz.iitu.midtermSpringProject.service;

import kz.iitu.midtermSpringProject.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAllBooks();

//    public List<Book> searchBooks(String keyword);

    Optional<Book> findBookById(Long id);

    void createBook(Book book);

    void updateBook(Book book);

    void deleteBook(Long id);
}

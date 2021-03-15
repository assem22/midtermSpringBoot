package kz.iitu.midtermSpringProject.service;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
    List<Book> findAllBooks();

//    public List<Book> searchBooks(String keyword);

    Book findBookById(Long id);

    void createBook(Book book);

    void updateBook(Book book);

    void deleteBook(Long id);
}

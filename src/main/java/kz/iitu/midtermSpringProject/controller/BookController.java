package kz.iitu.midtermSpringProject.controller;

import kz.iitu.midtermSpringProject.entity.Book;
import kz.iitu.midtermSpringProject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public List<Book> getBooks() {
        return bookService.findAllBooks();
    }

    public void createBook(Book book) {
        bookService.createBook(book);
    }

    public void deleteBook(long bookId) {
        bookService.deleteBook(bookId);
    }

    public void updateBook(Book book) {
        bookService.updateBook(book);
    }
}

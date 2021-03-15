package kz.iitu.midtermSpringProject.entity;


import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;
    private String book_name;
    private String book_genre;
    private String description;

    @ManyToOne
    @JoinColumn(name="author_id", nullable=false)
    private Author author;

    public Book() {

    }

    public Book(Long book_id, String book_name, String book_genre, String description) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_genre = book_genre;
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_genre() {
        return book_genre;
    }

    public void setBook_genre(String book_genre) {
        this.book_genre = book_genre;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_genre='" + book_genre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

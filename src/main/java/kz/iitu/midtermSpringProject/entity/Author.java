package kz.iitu.midtermSpringProject.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long author_id;
    private String author_name;
    private String author_email;
    private String author_password;

    @OneToMany(mappedBy="author")
    private Set<Book> books;

    @ManyToMany
    private Set<Subscriber> subscribers;

    public Author(Long author_id, String author_name, String author_email, String author_password) {
        this.author_id = author_id;
        this.author_name = author_name;
        this.author_email = author_email;
        this.author_password = author_password;
    }

    public Author() {

    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_email() {
        return author_email;
    }

    public void setAuthor_email(String author_email) {
        this.author_email = author_email;
    }

    public String getAuthor_password() {
        return author_password;
    }

    public void setAuthor_password(String author_password) {
        this.author_password = author_password;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_id=" + author_id +
                ", author_name='" + author_name + '\'' +
                ", author_email='" + author_email + '\'' +
                ", author_password='" + author_password + '\'' +
                '}';
    }
}

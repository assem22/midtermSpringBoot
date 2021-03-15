package kz.iitu.midtermSpringProject.service.impl;

import kz.iitu.midtermSpringProject.entity.Author;
import kz.iitu.midtermSpringProject.entity.Subscriber;
import kz.iitu.midtermSpringProject.repository.AuthorRepository;
import kz.iitu.midtermSpringProject.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> findAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public void createAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void updateAuthor(Author author) {
//        Author updatedSubscriber = authorRepository.findById(author.getAuthor_id()).get();
        authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}

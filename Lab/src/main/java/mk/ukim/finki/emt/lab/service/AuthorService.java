package mk.ukim.finki.emt.lab.service;

import mk.ukim.finki.emt.lab.model.Author;
import mk.ukim.finki.emt.lab.model.dto.AuthorDTO;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> getAllAuthors();
    Optional<Author> addAuthor(AuthorDTO author);
    Optional<Author> getAuthorById(Long id);
    Optional<Author> updateAuthor(Long id, AuthorDTO author);
    void deleteAuthor(Long id);
}

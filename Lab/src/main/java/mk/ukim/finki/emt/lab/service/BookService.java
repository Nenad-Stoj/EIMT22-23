package mk.ukim.finki.emt.lab.service;

import mk.ukim.finki.emt.lab.model.Book;
import mk.ukim.finki.emt.lab.model.dto.BookDTO;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAll();
    Optional<Book> addBook(BookDTO book);
    Optional<Book> getBookById(Long id);
    Optional<Book> updateBook(Long id, BookDTO book);
    void deleteBook(Long id);
    Optional<Book> markAsRented(Long id);
}

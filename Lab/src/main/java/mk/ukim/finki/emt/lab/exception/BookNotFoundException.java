package mk.ukim.finki.emt.lab.exception;

public class BookNotFoundException extends Exception{
    public BookNotFoundException(Long id) {
        super("Book with id = " + id + " not found");
    }
}

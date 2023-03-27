package mk.ukim.finki.emt.lab.repository;

import mk.ukim.finki.emt.lab.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}

package mk.ukim.finki.emt.lab.model.dto;

import lombok.Data;
import mk.ukim.finki.emt.lab.model.enumeration.Category;

@Data
public class BookDTO {
    String name;
    Category category;
    Long authorId;
    Integer availableCopies;
}

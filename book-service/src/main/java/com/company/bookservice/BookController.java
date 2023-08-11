package com.company.bookservice;

import com.company.bookservice.repository.AuthorClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author asankaa
 */
@RestController
@AllArgsConstructor
@Slf4j
public class BookController {
    @Autowired
    private final AuthorClient authorClient;
    @GetMapping("/book")
    public String getBook() {
        ResponseEntity<AuthorDto> author = this.authorClient.getAuthor();
        log.info("AuthorController.getBook() invoked");
        return "Spring Boot in Action : "+author.getBody().toString();
    }
    @GetMapping("/book/{id}")
    public ResponseEntity<AuthorDto> getAuthor(@PathVariable("id") Integer id) {
        log.info("AuthorController.getAuthor() invoked with id: {}",id );
        return new ResponseEntity<>(AuthorDto.builder().authorId(id).firstName("Author ").build(), HttpStatus.OK);
    }
    @GetMapping("/book2/{id}")
    public ResponseEntity<AuthorDto> getBook(@PathVariable("id") Integer id) {
        log.info("AuthorController.getAuthor() invoked with id: {}",id );
        return new ResponseEntity<>(this.authorClient.getAuthor().getBody(), HttpStatus.OK);
    }
}

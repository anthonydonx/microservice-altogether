package com.company.authorservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author asankaa
 */
@RestController
@Slf4j
public class AuthorController {
    @GetMapping("/author")
    public ResponseEntity<AuthorDto> getAuthor() {
        log.info("AuthorController.getAuthor() invoked");
        AuthorDto authorDto = AuthorDto.builder()
                .authorId(1)
                .firstName("Asanka")
                .build();
        return ResponseEntity.ok(authorDto);
    }
    @GetMapping("/author/{id}")
    public ResponseEntity<AuthorDto> getAuthor(@PathVariable("id") Integer id) {
        log.info("AuthorController.getAuthor() invoked with id: {}",id );
        return new ResponseEntity<>(AuthorDto.builder().authorId(id).firstName("From Author ").build(), HttpStatus.OK);
    }
}

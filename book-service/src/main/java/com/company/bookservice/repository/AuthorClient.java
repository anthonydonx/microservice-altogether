package com.company.bookservice.repository;

import com.company.bookservice.AuthorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author asankaa
 */
@FeignClient("AUTHOR-SERVICE")
//@Component
public interface AuthorClient {
    @GetMapping("/author")
    public ResponseEntity<AuthorDto> getAuthor();
}

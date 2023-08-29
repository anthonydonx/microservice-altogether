package com.company.bookservice.repository;

import com.company.bookservice.AuthorDto;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author asankaa
 */
@FeignClient("AUTHOR-SERVICE")
//@Component
public interface AuthorClient {
    @GetMapping("/author")
    public ResponseEntity<AuthorDto> getAuthor();
    @GetMapping("/author/{id}")
    public ResponseEntity<AuthorDto> getAuthor(@PathVariable("id") Integer id);
}

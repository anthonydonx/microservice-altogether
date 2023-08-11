package com.company.bookservice;

import lombok.Builder;
import lombok.Data;

/**
 * @author asankaa
 */
@Data
@Builder
public class AuthorDto {
    private Integer authorId;
    private String firstName;
}

package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Tag(name = "Comment model information")
public class CommentDto {
    @Schema(name = "Comment id")
    private long id;

    @Schema(name = "Comment name")
    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    @Schema(name = "Comment email")
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    @Schema(name = "Comment body")
    @NotEmpty
    @Size(min = 10, message = "Comment body must be minimum 10 characters")
    private String body;
}

package com.iltaek.example.springboot.web.dto;

import com.iltaek.example.springboot.domain.posts.Posts;
import java.time.LocalDateTime;
import lombok.Getter;

/**
 * Created by iltaek on 2019/12/08 Blog : http://blog.iltaek.me Github : http://github.com/iltaek
 */
@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}

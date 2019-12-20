package com.iltaek.example.springboot.domain.posts;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by iltaek on 2019/12/08 Blog : http://blog.iltaek.me Github : http://github.com/iltaek
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글_저장_불러오기Test() throws Exception {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder()
            .title(title)
            .content(content)
            .author("iltaek")
            .build());

        //when
        List<Posts> postResults = postsRepository.findAll();

        //then
        Posts posts = postResults.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);

    }

    @Test
    public void BaseTimeEntity_등록_Test() throws Exception {
        //given
        LocalDateTime now = LocalDateTime.of(2019, 6, 4, 0, 0, 0);
        postsRepository.save(Posts.builder()
            .title("title")
            .content("content")
            .author("author")
            .build());

        //when
        List<Posts> allPosts = postsRepository.findAll();

        //then
        Posts post = allPosts.get(0);

        System.out.println(">>>>>>>>>> createdDate=" + post.getCreatedDate() + ", modifiedDate=" + post.getModifiedDate());

        assertThat(post.getCreatedDate()).isAfter(now);
        assertThat(post.getModifiedDate()).isAfter(now);
    }
}
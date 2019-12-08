package com.iltaek.example.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by iltaek on 2019/12/08
 * Blog : http://blog.iltaek.me
 * Github : http://github.com/iltaek
 * */
public interface PostsRepository extends JpaRepository<Posts, Long> {
}

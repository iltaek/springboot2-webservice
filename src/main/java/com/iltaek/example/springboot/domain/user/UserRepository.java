package com.iltaek.example.springboot.domain.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by iltaek on 2019/12/15 Blog : http://blog.iltaek.me Github : http://github.com/iltaek
 */
public interface UserRepository  extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}

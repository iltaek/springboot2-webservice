package com.iltaek.example.springboot.config.auth.dto;

import com.iltaek.example.springboot.domain.user.User;
import java.io.Serializable;
import lombok.Getter;

/**
 * Created by iltaek on 2019/12/15 Blog : http://blog.iltaek.me Github : http://github.com/iltaek
 */
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}

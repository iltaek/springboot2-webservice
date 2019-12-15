package com.iltaek.example.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by iltaek on 2019/12/15 Blog : http://blog.iltaek.me Github : http://github.com/iltaek
 */

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GEUST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
}

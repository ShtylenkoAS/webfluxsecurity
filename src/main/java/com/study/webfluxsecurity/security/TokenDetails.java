package com.study.webfluxsecurity.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TokenDetails {

    private Long userId;
    private String token;
    private Date issueAt;
    private Date expireAt;
}
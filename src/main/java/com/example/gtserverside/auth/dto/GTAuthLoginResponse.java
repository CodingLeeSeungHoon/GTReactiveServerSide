package com.example.gtserverside.auth.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GTAuthLoginResponse {
    private String userID;
    private String password;
}

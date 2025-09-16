package dev.decafmango.sec_lab1.validation;

import dev.decafmango.sec_lab1.model.dto.PostDto;
import dev.decafmango.sec_lab1.model.dto.SignInRequest;
import dev.decafmango.sec_lab1.model.dto.SignUpRequest;
import org.springframework.stereotype.Component;

@Component
public class XssSanitizer {

    private String sanitize(String input) {
        if (input == null || input.trim().isEmpty()) {
            return input;
        }

        return input.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#x27;");
    }

    public SignUpRequest sanitize(SignUpRequest signUpRequest) {
        return SignUpRequest.builder()
                .email(sanitize(signUpRequest.getEmail()))
                .password(sanitize(signUpRequest.getPassword()))
                .nickname(sanitize(signUpRequest.getNickname()))
                .build();
    }

    public SignInRequest sanitize(SignInRequest signInRequest) {
        return SignInRequest.builder()
                .email(sanitize(signInRequest.getEmail()))
                .password(sanitize(signInRequest.getPassword()))
                .build();
    }

    public PostDto sanitize(PostDto postDto) {
        return PostDto.builder()
                .content(sanitize(postDto.getContent()))
                .build();
    }

}

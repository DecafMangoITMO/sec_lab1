package dev.decafmango.sec_lab1.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SignInRequest {

    @NotBlank(message = "Email must not be blank!")
    @Email(message = "Email must be an email!")
    @Size(min = 1, max = 64, message = "Email's length must be less than 64 symbols!")
    private String email;

    @NotBlank(message = "Password must not be blank")
    @Size(min = 6, max = 32, message = "Password's length must be from 6 to 32 symbols!")
    private String password;

}

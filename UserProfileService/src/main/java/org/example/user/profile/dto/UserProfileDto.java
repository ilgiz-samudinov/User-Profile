package org.example.user.profile.dto;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileDto {


    @NotBlank(message = "Имя не должно быть пустым")
    @Size(max = 50, message = "Имя должно состоять не более 50 символов")
    private String firstName;

    @NotBlank(message = "Фамилия не должно быть пустым")
    @Size(max = 50, message = "Фамилия должно состоять не более 50 символов")
    private String lastName;

    @NotBlank(message = "Email не должно быть пустым")
    @Email(message = "неправильный формат email")
    private String email;

    @NotBlank(message = "Возраст не должно быть пустым")
    @Min(value = 0, message = "Возраст не может быть отрицательным")
    @Max(value = 150, message = "Введите корректный возраст")
    private int age;

    @Pattern(regexp = "\\+?[0-9]{7,20}", message ="Введите корректный номер телефона")
    private String phone;


    private LocalDate birthDate;

    private String pictureUrl;

    @NotBlank(message = "Пол обязателен")
    private String gender;

    @Size(max = 50 , message = "Страна должна состоять не более 50 символов")
    private String country;

    @Size(max = 50 , message = "Город должна состоять не более 50 символов")
    private String city;

    @Size(max = 50 , message = "Биография  должна состоять не более 500 символов")
    private String biography;

}

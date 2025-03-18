package org.example.user.profile.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false , unique = true)
    private String email;

    @Column(nullable = false)
    private int age;

    @Column(length = 20)
    private String phone;


    private LocalDate birthDate;

    private String pictureUrl;

    @Column(length = 10)
    private String gender;

    @Column(length = 50 )
    private String country;

    @Column(length = 50)
    private String city;

    @Column(length = 500)
    private String biography;

}

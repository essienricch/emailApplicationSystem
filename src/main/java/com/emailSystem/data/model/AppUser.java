package api.email_system.data.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String emailAddress;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    private LocalDateTime createdAt;

    private String profileImg;
}

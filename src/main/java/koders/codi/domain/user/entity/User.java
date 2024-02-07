package koders.codi.domain.user.entity;

import jakarta.persistence.*;
import koders.codi.domain.user.dto.SignupDto;
import lombok.*;


@Entity(name = "users")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(length = 100)
    private String password;

    @Column(length = 100)
    private String nickname;

    private String profileImageUrl;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private Provider provider;

    public static User of(final SignupDto signupDto) {
        return new User(
                null,
                signupDto.getEmail(),
                signupDto.getPassword(),
                signupDto.getNickname(),
                //TODO: 이미지 받아올 수 있게 dto 수정
                "default-profile-image.png",
                Role.USER,
                Provider.COMMON
        );
    }
}
package koders.codi.domain.user.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class SignupDto {
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String nickname;
}
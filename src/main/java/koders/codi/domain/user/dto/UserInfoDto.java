package koders.codi.domain.user.dto;

import koders.codi.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class UserInfoDto {
    private Long id;
    private String email;
    private String nickname;
    private String profileImageUrl;
    public static UserInfoDto of(final User user){
        return new UserInfoDto(
                user.getId(), user.getEmail(), user.getNickname(), user.getProfileImageUrl());
    }
}

package koders.codi.domain.user.service;

import koders.codi.domain.user.dto.SignupDto;
import koders.codi.domain.user.dto.UserInfoDto;
import koders.codi.domain.user.entity.User;
import koders.codi.domain.user.repository.UserRepository;
import koders.codi.global.exception.ErrorCode;
import koders.codi.domain.user.exception.UserEmailAlreadyExistException;
import koders.codi.domain.user.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void signup(SignupDto signupDto) {
        checkEmailDuplicated(signupDto.getEmail());
        signupDto.setPassword(passwordEncoder.encode(signupDto.getPassword()));
        userRepository.save(User.of(signupDto));
    }
    public void checkEmailDuplicated(String email) {
        if (userRepository.existsByEmail(email)) {
            throw new UserEmailAlreadyExistException(ErrorCode.EMAIL_ALREADY_EXIST);
        }
    }
    public UserInfoDto getUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(ErrorCode.NOT_FOUND_USER));
        return UserInfoDto.of(user);
    }
}
package koders.codi.global.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    // Common
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "400", "값이 올바르지 않습니다."),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "405", "지원하지 않는 Http Method 입니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "500", "서버 에러"),
    INVALID_TYPE_VALUE(HttpStatus.BAD_REQUEST, "400", "입력 값의 타입이 올바르지 않습니다."),
    UNAUTHORIZED_ACCESS(HttpStatus.UNAUTHORIZED, "401", "잘못된 접근입니다."),
    NOT_EXIST_TOKEN_INFO(HttpStatus.FORBIDDEN, "403", "토큰 정보가 존재하지 않습니다."),
    ACCESS_DENIED(HttpStatus.FORBIDDEN, "403", "접근이 거부 되었습니다."),
    FEIGN_CLIENT_ERROR(HttpStatus.BAD_REQUEST, "400", "정보를 가져올 수 없습니다."),

    // User
    NOT_FOUND_USER(HttpStatus.NOT_FOUND, "404", "존재하지 않는 사용자입니다."),
    EMAIL_ALREADY_EXIST(HttpStatus.BAD_REQUEST, "400", "이미 존재하는 이메일 입니다."),
    EMAIL_OR_PASSWORD_NOT_MATCH(HttpStatus.BAD_REQUEST, "400", "이메일 혹은 비밀번호가 일치하지 않습니다."),

    // Record
    NOT_FOUND_RECORD(HttpStatus.NOT_FOUND, "404", "존재하지 않는 기록입니다."),

    // Test
    TEST_EXCEPTION(HttpStatus.BAD_REQUEST, "400", "테스트 에러"),


    // Social login
    SOCIAL_ACCESS_TOKEN_INVALID(HttpStatus.UNAUTHORIZED, "401", "유효하지 않은 소셜 로그인 토큰입니다."),

    // Image
    IMAGE_WRONG_FILE_FORMAT(HttpStatus.UNSUPPORTED_MEDIA_TYPE, "I001", "파일 형식이 잘못되었습니다.");

    // Depend on Entity (도메인에 따라서 달라지는 경우)
    // 이벤트 Entity 관련
    // EMAIL_DUPLICATION(HttpStatus.BAD_REQUEST, "E001", "이메일 중복 입니다."),
    // EVENT_NOT_FOUND(HttpStatus.NOT_FOUND, "E002", "존재하지 않는 이벤트입니다."),
    // EVENT_OVER_DEADLINE(HttpStatus.BAD_REQUEST, "E003", "신청 기간이 지났습니다."),
    // EVENT_TYPE_NOT_MATCH(HttpStatus.BAD_REQUEST, "E004", "모집 유형이 일치하지 않습니다."),
    // EVENT_TYPE_ENUM_NOT_SUPPORTED(HttpStatus.BAD_REQUEST, "E005", "지원하지 않는 이벤트 유형입니다."),


    // JWT (Json Web Token)
    //JWT_INVALID_TOKEN(HttpStatus.UNAUTHORIZED, "J001", "유효하지 않은 토큰입니다."),
    //JWT_EXPIRED_TOKEN(HttpStatus.UNAUTHORIZED, "J002", "만료된 토큰입니다."),
    //JWT_REFRESH_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "J003", "만료된 리프레시 토큰입니다."),
    //ACCESS_TOKEN_LOGOUT(HttpStatus.UNAUTHORIZED, "J004", "로그아웃된 액세스 토큰입니다."),

    // 리소스 요청에 대한 권한이 없는 경우
    //RESOURCE_FORBIDDEN(HttpStatus.FORBIDDEN, "R001", "해당 리소스에 대한 권한이 없습니다."),
    //RESOURCE_UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "R002", "인증이 필요합니다. 로그인을 해주세요."),


    private final HttpStatus status;
    private final String code;
    private final String message;

    public int getStatus() {
        return this.status.value();
    }

    ErrorCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

}

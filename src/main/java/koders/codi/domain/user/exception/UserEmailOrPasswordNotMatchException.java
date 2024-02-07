package koders.codi.domain.user.exception;

import koders.codi.global.exception.CommonException;
import koders.codi.global.exception.ErrorCode;

public class UserEmailOrPasswordNotMatchException extends CommonException {
    public UserEmailOrPasswordNotMatchException(final ErrorCode errorCode) {
        super(errorCode);
    }
}

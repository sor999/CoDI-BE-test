package koders.codi.domain.user.exception;

import koders.codi.global.exception.CommonException;
import koders.codi.global.exception.ErrorCode;

public class UserNotFoundException extends CommonException {
    public UserNotFoundException(final ErrorCode errorCode) {
        super(errorCode);
    }
}

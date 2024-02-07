package koders.codi.domain.user.exception;

import koders.codi.global.exception.CommonException;
import koders.codi.global.exception.ErrorCode;

public class UserEmailAlreadyExistException extends CommonException {
    public UserEmailAlreadyExistException(final ErrorCode errorCode) {
        super(errorCode);
    }

}

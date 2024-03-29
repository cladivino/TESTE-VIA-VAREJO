package br.com.viavarejo.exception;

public class ValidacaoException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 8888197183613580128L;

    public ValidacaoException() {
        super();
    }

    public ValidacaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ValidacaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidacaoException(String message) {
        super(message);
    }

    public ValidacaoException(Throwable cause) {
        super(cause);
    }
}

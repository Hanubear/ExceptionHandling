public class DivideByZeroException extends Exception{
    public DivideByZeroException() {
    }

    public DivideByZeroException(String message) {
        super(message);
    }

    public DivideByZeroException(Throwable cause) {
        super(cause);
    }

    public DivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}

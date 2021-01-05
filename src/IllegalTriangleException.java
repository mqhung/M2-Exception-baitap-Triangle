public class IllegalTriangleException extends Exception{
    private String mess;

    public IllegalTriangleException(String message) {
        super(message);
        this.mess = message;
    }

    @Override
    public String getMessage() {
        return mess;
    }
}

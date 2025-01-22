package fr.pantheonsorbonne.ufr27.miage.exception;

public class MapperException extends RuntimeException {
    public MapperException(String message) {
        super(message);
    }

    public MapperException(String message, Throwable cause) {
        super(message, cause);
    }
}

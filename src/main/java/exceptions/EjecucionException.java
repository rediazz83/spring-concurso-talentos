package exceptions;

public class EjecucionException extends RuntimeException {
	
	public EjecucionException() { }
	
	public EjecucionException(String mensaje) {
		super(mensaje);
	}
	
}

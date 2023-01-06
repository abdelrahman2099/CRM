package springdemo.rest;

public class CustomerNotFoundExption extends RuntimeException {

	public CustomerNotFoundExption() {

	}

	public CustomerNotFoundExption(String arg0) {
		super(arg0);

	}

	public CustomerNotFoundExption(Throwable arg0) {
		super(arg0);

	}

	public CustomerNotFoundExption(String arg0, Throwable arg1) {
		super(arg0, arg1);

	}

	public CustomerNotFoundExption(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);

	}

}

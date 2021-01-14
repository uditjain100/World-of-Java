package First;

public class Singleton_Class {

	private static Singleton_Class obj;

	private Singleton_Class() {

	}

	public static Singleton_Class getInstance() {
		if (obj == null) {
			obj = new Singleton_Class();
		}
		return obj;
	}

}

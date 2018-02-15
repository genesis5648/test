package Interview;

class BoxFactory{
	// The first <T> clarifies that this function is the template one.
	// Box<T> indicates the return type
	public static <T> Box<T> makebox(T o)
	{
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
	
	
}

public class GenericMethodBoxMaker {
	
	public static void main(String[] args) {
		BoxFactory.makebox(new Box<Apple>());
		BoxFactory.makebox(new Integer(10));
	}

}

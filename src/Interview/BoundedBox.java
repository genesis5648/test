package Interview;


//T is limited to an object inheriting Number class
//Box is already defined; template cannot be the identifier
class LimitedBox<T extends Number>
{
	private T ob;
	public void set(T o)
	{
		ob = o;
	}
	
	public T get()
	{
		return ob;
	}
}

public class BoundedBox {

	public static void main(String[] args) {
		LimitedBox<Integer> box = new LimitedBox<Integer>();
		box.set(12);
		
		//error Apple class is not valid for the template <T extends Number> since Apple does not inherit Number class 
		//LimitedBox<Apple> box2 = new LimitedBox<Apple>();
		
		//Box<Ap>
		
		System.out.println(box.get());

	}

}

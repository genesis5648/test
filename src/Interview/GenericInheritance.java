package Interview;

class ParentBox<T>{
	protected T ob;
	public void set(T o){ob = o;}
	public T get(){return ob;}
}

class SteelBox<T> extends ParentBox<T>{
	//creator definition
	public SteelBox(T o)
	{
		ob = o;
	}

	public SteelBox() {
		// TODO Auto-generated constructor stub
	}
}

public class GenericInheritance {

	public static void main(String[] args) {
		ParentBox<Integer> iBox = new SteelBox<Integer>(10);
		ParentBox<Integer> tempBox = new SteelBox<Integer>();
		ParentBox<String> sBox = new SteelBox<String>("hello");
		
		System.out.println(iBox.get());
		System.out.println(sBox.get());

	}

}

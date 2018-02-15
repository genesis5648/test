package Interview;


class Fruit{
	protected int test=0;
}

class Apple extends Fruit{
	public String toString(){
		return "I am an apple.";
	}
}

class Orange extends Fruit{
	public String toString(){
		return "I am an orange";
	}
}

class Box<T>
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


public class FruitAndBox2 {

	public static void main(String[] args) {
		Box<Apple> abox = new Box<Apple>();
		Box<Orange> bbox = new Box<Orange>();
		
		abox.set(new Apple());
		bbox.set(new Orange());
		
		Apple temp = abox.get();
		Orange temp2 = bbox.get();
		
		Fruit fruit = temp;			
		
		temp.test=1;
		temp.test=1;
		
		System.out.println(temp);
		System.out.println(temp2);
		
	}

}

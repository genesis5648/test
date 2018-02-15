package Interview;

class Unboxer{
	public static <T> T openBox(Box<T> box)
	{
		return box.get();
	}
	
	//same to wildcard -> public staitc void peekBox(Box<?> box) 
	public static <T> void peekBox(Box<T> box)
	{
		System.out.println(box);
	}
}

public class WildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

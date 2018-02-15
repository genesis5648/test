package Interview;

class EmptyBoxFactory{
	public static <T> Box<T> makebox(){
		Box<T> box = new Box<T>();
		return box;
	}
}

public class TargetTypes {

	public static void main(String[] args) {
		
		//both ones are available
		Box<Integer> iBox = EmptyBoxFactory.<Integer>makebox();		
		iBox = EmptyBoxFactory.makebox();
		
		iBox.set(25);
		System.out.println(iBox.get());
	}

}

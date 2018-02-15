package Interview;



class DBox<L, R>
{
	private L left;
	private R right;
	
	public void set(L left, R right)
	{
		this.left = left;
		this.right = right;
	}
	
	public String toString()
	{
		return left+" "+right;
	}	
}


public class MultiTypeParam {

	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 24);
		System.out.println(box);
	}

}

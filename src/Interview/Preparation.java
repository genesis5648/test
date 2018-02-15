package Interview;

public class Preparation {

	public static void main(String[] args) {
//		Printable prn = new LPrinter();
//		prn.print("test");
//		((ColorPrintable) prn).printCMYK("test");
//		((LPrinter) prn).printCMYK("test");
//		prn = new SPrinter();
//		
//		System.out.println();
//		
//		prn.print("test");
//		((ColorPrintable) prn).printCMYK("test");
//		((SPrinter) prn).printCMYK("test");
//		
//		//call by reference is not supported in JAVA!!!
//		
//		ColorPrintable.printLine("good");
//		
//		TestPrint.printLine("test");
		
		Printable print  = new SPrinter();
		print.printX("default");
		
		if(print instanceof LPrinter)
			System.out.println("ok");
		
		Garbage garbage = new Garbage();
		
		garbage = null;
		
		System.gc();
		
		Box<Integer> box = new Box<Integer>();
		
		box.set(3);
		
		
	}
}

//default 접근자이며 동일 패키지 내에서 접근 가능하다.
interface Printable {
	int PAPER_WIDTH = 70;	//public, static, final are assumed 
	int PAPER_HEIGHT = 120;	//public, static, final are assumed
	void print(String doc);
	static void printLine(String str){System.out.println(str);}
	default void printX(String doc){printLine(doc);}
}

interface ColorPrintable extends Printable{
	static void printLine(String str)
	{
		System.out.println("Static method : "+str);
	}
	void printCMYK(String doc);
}

interface TestPrint{
	static void printLine(String str)
	{
		System.out.println("testprint : "+str);
	}
}

class LPrinter implements ColorPrintable{
	@Override
	public void print(String doc)
	{
		System.out.println("LG : "+doc);
	}		
	@Override
	public void printCMYK(String doc)
	{
		System.out.println("LG color : "+doc);
	}
}
	//default = available in the same package
class SPrinter implements ColorPrintable{
	@Override
	public void print(String doc)
	{
		System.out.println("SS : "+doc);
	}
	public void printCMYK(String doc)
	{
		System.out.println("SS color : "+doc);
	}
}

class Garbage{
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("destroyed");
	}
}






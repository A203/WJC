package Day03;

public class Class07 {
	public char str='A';
	public void hello(){
		System.out.println("A...");
	}
public class Class08 extends Class07 {
		public char str='B';
		public void hello(){
			System.out.println("B...");
		}
	public void main(String[] args) {
/*		Class07 a =new Class07();
		System.out.println(a.str);
		a.hello();
		*/
	    Class07 a = new Class08();
		System.out.println(a.str);
		a.hello();
	}
}
}

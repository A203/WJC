package Day03;

public abstract class Class10 {
	public static Mango class10;

	public String toString(){
		return "ˮ��";
	}
}
class Apple extends Class10{
	public String toString(){
		return "ƻ��";
	}
}
class Mango extends Class10{
	public String toString(){
		return "â��";
	}
}
class Juicer{
	public void juice(Class10 class10){
		System.out.println("ե"+class10+"֭");
	}
	public static void main(String[] args) {
		Juicer j = new Juicer();
		Class10 class10 = new Mango();
		j.juice(class10);
		// TODO Auto-generated method stub

	}
}
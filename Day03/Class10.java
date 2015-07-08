package Day03;

public abstract class Class10 {
	public static Mango class10;

	public String toString(){
		return "水果";
	}
}
class Apple extends Class10{
	public String toString(){
		return "苹果";
	}
}
class Mango extends Class10{
	public String toString(){
		return "芒果";
	}
}
class Juicer{
	public void juice(Class10 class10){
		System.out.println("榨"+class10+"汁");
	}
	public static void main(String[] args) {
		Juicer j = new Juicer();
		Class10 class10 = new Mango();
		j.juice(class10);
		// TODO Auto-generated method stub

	}
}
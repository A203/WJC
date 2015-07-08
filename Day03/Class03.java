package Day03;

public class Class03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person=new Person("Eric",21,"China");
		person.introduce();
	}

}
class Person{
	String name;
	int age;
	String address;
	
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Person(String name,int age, String address){
		this(name,age);
		this.address=address;
	}
	void hello(){
		System.out.println("hello....");
	}
	void introduce(){
		System.out.println("name"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
		this.hello();
		System.out.println(this);
	}
}

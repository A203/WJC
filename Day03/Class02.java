package Day03;

public class Class02 {
String name;
String age;
String address;

void introduce(){
	System.out.println("my name is "+name+",today is "+age+" years old,my address is "+address+".");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Class02 class02=new Class02("Eric";"21";"China");
Class02 class02=new Class02();
class02.name="Eric";
class02.age="21";
class02.address="China";
class02.introduce();
	}

}

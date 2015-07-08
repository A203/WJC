package Day03;

public class Class01 {
 private static final Class01 Class01 = null;
String name;
 String brand;
 String price;
 void call(){
	 System.out.println("call to sb.");
 }
 void sendMsg(){
	 System.out.println("sendMSg to sb.");
 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Class01 p=new Class01();
     p.name="note";
     p.brand="Ascend";
     p.price="99";

      System.out.println(p.name);
      p.sendMsg();
	}
	public static Class01 getClass01() {
		return Class01;
	}

}

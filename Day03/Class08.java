package Day03;

public abstract class Class08 {
	public abstract void sleep();
	
	}
//abstract class Tiger extends Class08{
	class tiger extends Class08{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Å¿×ÅË¯...");
}
	}
	class Monkey extends Class08{
		public void sleep(){
			System.out.println("Ñö×ÅË¯¡£¡£¡£");
		}
	}
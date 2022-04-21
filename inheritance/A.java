package inheritance;

class A {
	

	void show()
	{
		System.out.println("Super Class");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Sub class");
	}
}
class C extends A
{
	void showC()
	{
		System.out.println("class C");
	}
}
class SimDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C b=new C();
		b.show();
		//b.display();
		b.showC();
		B b1=new B();
		b1.display();
		

	}

}

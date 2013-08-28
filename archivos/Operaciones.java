public class Operaciones
{
	public static void main (String args[])
	{
		new Operaciones();
	}
	public Operaciones()
	{
		this.Suma();
		this.Resta();
		this.Multiplicacion();
		this.Division();
	}
	private Suma()
	{
		int a = 2;
		int b = 5;
		int c = a+b;
		System.out.println(c);
	}
	private Resta()
	{
		int a = 10;
		int b = 5;
		int c = a-b;
		System.out.println(c);
	}
	private Multiplicacion()
	{
		int a = 8;
		int b = 4;
		int c = a*b;
		System.out.println(c);
	}
	private Division()
	{
		int a = 8;
		int b = 2;
		int c = a/b;
		System.out.println(c);
	}
}
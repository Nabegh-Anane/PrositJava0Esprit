public class partie3 {
	public static int somme(int a, int b)  {
		return a+b;
	}
	public static void main(String[] argument){
		int n1 = Integer.parseInt(argument[0]);
		int n2 = Integer.parseInt(argument[1]);
		System.out.println("la somme : "+somme(n1,n2));
	}
}
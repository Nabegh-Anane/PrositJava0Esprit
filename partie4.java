public class partie4 {
	public static int somme(int a, int b)  {
		return a+b;
	}
	public static void afficherEntier(int x)  {
		System.out.println("la nombre a afficher : "+x);
	}
	public static void main(String[] argument){
		int n1 = Integer.parseInt(argument[0]);
		int n2 = Integer.parseInt(argument[1]);
		int v = somme(n1,n2);
		afficherEntier(v);
	}
}
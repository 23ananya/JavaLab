
public class Combinations {

	public static void main(String[] args) {
		
			
	public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter the three digits from 0 to 9: ");
	String a=scan.nextLine();
	String b=scan.nextLine();
	String c=scan.nextLine();
        System.out.println("The possible combinations are: ");
	System.out.println(a+b+c);
	System.out.println(b+a+c);
	System.out.println(c+b+a);
	System.out.println(b+c+a);
	System.out.println(c+a+b);
	System.out.println(a+c+b);


	}

}

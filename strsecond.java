import java.util.StringTokenizer;
import java.util.Scanner;
class strsecond{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1= sc.nextLine();
		StringTokenizer st = new StringTokenizer(s1, ",");
		System.out.println("Tokens extracted from the string using StringTokenizer: ");
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
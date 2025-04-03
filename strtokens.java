import java.util.StringTokenizer;
class strtokens{
	public static void main(String[] args){
		StringTokenizer st = new StringTokenizer("This statement, is passed, directly inside, the class.");
		System.out.println("Tokens extracted from the string using StringTokenizer: ",StringTokenizer,",");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
} 
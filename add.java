import java.util.*;
public class add{
	public static void main(String[] args){
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(sum(a,b));
	}
	
	public static int sum(int a,int b){
// 		System.out.println(a+b);
		return a+b;
	}
}

import java.util.Scanner;

class SimilarChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String string=sc.next();
		int queries=sc.nextInt();
		
		while(queries!=0) {
			int q=sc.nextInt();
			String s1 = "";
			for(int i=0;i<q;i++) {
				s1+=string.charAt(i);
            }
           // System.out.println(s1);
			int count = 0;
			char ch = string.charAt(q-1);
			for(int i=0;i<q-1;i++) {
				if(ch == s1.charAt(i))
					count += 1;
			}
			
			System.out.println(count);
			queries -= 1;
		}
		
		sc.close();

	}

}

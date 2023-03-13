
public class One {
	public static void main(String[] args){
		int x = 5;
		int y = 10;
		if(x>y) System.out.println("X is greater than Y");
		else if (x<y) System.out.println("Y is greater than X");
		else System.out.println("Both are equal");
		
		for(int i=0;i<10;i++) {
			System.out.printf(i+ " ");
		}
		
		System.out.println("");
		
		int z = 0;
		while(z<=10) {
			z++;
			System.out.printf(z + " ");
		}
		
		System.out.println("");
		
		do {
			System.out.printf(z+ " ");
			z--;
		}
		while(z>0);
		
		for(int i=1;i<=10;i++) {
			switch(i) {
			case 2:
				System.out.printf("%nThis is 2%n");
				break;
			case 8:
				System.out.println("This is 8");
				break;
			}
				
		}
		
		}
}

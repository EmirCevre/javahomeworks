package intro;

public class loops {

	public static void main(String[] args) {
		//for,foreach,while,do-while
		
		for(int i=0;i<=100;i++) {
			System.out.println(i);
	}
		
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println("çift sayilar  : " + i);
			}
			else {
				System.out.println("tek sayilar : " + i);
			}
		}

}
}
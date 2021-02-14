
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 0;
		
		while (x <= 100) {
			System.out.println(x);
			x += 2;
		}
		x = 100;
		
		while (x >= 0) {
			System.out.println(x);
			x -= 3;
		}
		
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}
		
		
		for (int i = 0; i <= 100; i++) {
			
			if (i % 15 == 0) {
				System.out.println("HelloWorld");
			} else if (i % 5 == 0) {
				System.out.println("World");
			} else if (i % 3 == 0) {
				System.out.println("Hello");
			} else {
				System.out.println(i);
			}
			
		}
		
		
		String outside = "very hot";
		boolean isHotOutside = outside == "very hot";
		System.out.println (isHotOutside);
		
		double y = 589.0;
		boolean hasMoneyInPocket = (y == 589.0);
		System.out.println (hasMoneyInPocket);
		
		int price =150;
		double weekendDiscount = 0.55;
		String day = "Mon.";
		boolean weekday = (day == "Sat.");

		if(day =="Sat.") {
			weekendDiscount *= price;
		}
		else if (day =="Sun.") {
			weekendDiscount *= price;
	}
		else System.out.println ("No discount" + "," +weekday);

	}

}

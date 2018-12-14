
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot ben = new Robot();
		Robot tim = new Robot();
		Robot crystal = new Robot();
		Robot sean = new Robot();
		
		ben.speak("my name is Ben");
		ben.speak("hey");
		//i passed a parameter to my speak method
		ben.heft(11);
		ben.move("NorthWest", 17);
		ben.passPrimitives("It's a Wonderful Life", 76.2, 49);
		String fat = "AAAYYYYYOOO";
		ben.speak(fat);
		//here i created a string and passed it to the method
		crystal.speak(fat);
		//the method doesn't care what you call the variable you give it
		int value = 17;
		ben.passPrimitives(fat, 18.2, value);
	}

}


class Robot {
	public void speak(String sayHello) {
		System.out.println(sayHello);
	}
	//sayHello is a parameter passed to the method
	//it's called a parameter because we can change it
	
	public void heft(int weight) {
		
		System.out.println("my cat weighs " + weight + " lbs!");
	}
	
	public void move(String direction, double distance) {
		
		System.out.println("I will move " + distance + " meters in direction " + direction);
	}
	
	public void passPrimitives(String favMovie, double height, int cheatDiet) {

	System.out.println("My favorite movie is " + favMovie + ". I am " + height + " meters tall and I will cheat on my diet " + cheatDiet
			+ " times this afternoon!");
}}


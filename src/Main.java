package src;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);

    	System.out.print("Hello Sir/Madam, what may I call you? ");
    	String i = sc.next();
		System.out.println("Greetings, " + i + " !");
		sc.close();
    }
}

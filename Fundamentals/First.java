public class First {
	public static void main(String[] args) {
		System.out.println("Hello World!");
        String firstName = "bobby";
        String lastName = "brown";
        System.out.println(firstName + " " + lastName);
        int age = 54;
        boolean isBald = true;
        double weight = 175.23;
        char grade = 'F';
        System.out.println("Name: " + firstName + " " + lastName + "\n" + "age: " +age+ "\n"+ "weight: " + weight);




        String fullName = firstName.concat(lastName);
        System.out.println("full name lengh: " + (fullName.length()));
        System.out.println("full name: " + fullName);

        String greeting = String.format("Hi %s, you are %d years old." ,fullName, age);
        System.out.println(greeting);
        // System.out.printf("Hi %s, you are %d years old." ,fullName, age);

        String firstName1 = "Martha";
        String firstName2 = new String("Martha");
        String firstName3 = "Martha";
        System.out.println(firstName1 == firstName2);


	}
}
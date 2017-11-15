void helloWorld() {
	/* This Method has the return type "void",
	which means it is not returning something.
	It is only visible by classes in the same package. */
	System.out.println("Hello World");
	/* Here we just print "Hello World" to the console. */
} /* The method body ends without return statement */

int getOne() {
	/* This method returns a variable of the type int.
	Other than that nothing differs from the first example. */
	return 1;
	/* The return statement returns the integer 1.
	Without return statement this method would not compile. */
}

int addTogether(int a, int b) {
	/* This method adds the integers a and b, which get passed as parameters. */
	return a + b;
}

String concat(String... strings) {
	/* Here we can pass as many Strings as we need. */
	String string = "";
	/* An empty String */
	for (String s : strings) {
		string += s;
	}
	/* We append every String in strings to our empty String. */
	return string;
}

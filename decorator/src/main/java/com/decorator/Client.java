package com.decorator;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The is a <strong> message.");
		System.out.println(m.getContent());

		Message decorator = new HtmlEncodedMessage(m);
		System.out.println(decorator.getContent());

		decorator = new Base64EncodedMessage(decorator); // Recursive composition
		System.out.println(decorator.getContent());
	}
}

package com.ex;

import java.io.Closeable;

class Resource implements Closeable {

	public void init() {
		System.out.println("Resource : init");
	}

	public void use() {
		System.out.println("Resourse : use...");
		if (true)
			throw new RuntimeException("oooops");
	}

	public void close() {
		System.out.println("Resource : closed");
	}

}

public class Try_Catch_Finally_Syntax {

	public static void main(String[] args) {

		// Resource resource = new Resource();
		// resource.init();
		//
		// try {
		// resource.use();
		// return;
		// } catch (Exception e) {
		// System.out.println("Ex handled while using resource..");
		// } finally {
		// resource.close();
		// }

		// ----------------------------------------

		//
		// try (Resource resource = new Resource()) {
		// resource.init();
		// resource.use();
		// } catch (Exception e) {
		// System.out.println("Ex handled while using resource..");
		// }

		// ---------------------------------

		// try {
		//
		// } finally {

		// }

		// -----------------------------------
	}

}

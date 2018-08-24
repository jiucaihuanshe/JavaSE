package com.others;

import java.util.ArrayList;
import java.util.List;

public class Cats {
	public static void main(String args[]) {
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		Animal b = new Animal();
		Cat a = null;
		if (b instanceof Animal)
			a = (Cat) b;
		if (a != null)
			cats.add(a);
		System.out.println(cats.size() + "cats");
	}
}

class Animal {
}
class Cat extends Animal {
}

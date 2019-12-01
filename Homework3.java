public class Human{
	String sex;
	String name;
	String surname;
	int height;
	int weight;
	int age;
}
public Human(){}

public class Student extends Human{
	String univercity;
	String faculty;
	String speciality;
	int group;
}

public class Vehicle{
	int qtyWheel;
	double speed;
	int passengers;

	public void run (){System.out.println("Move from A to B");}
	public int qty (int passengers) {return passengers;}
	public void print() {System.out.println("At parcking");}
}

public class House{
	int floors;
	int apartments;
	int residents;
}

public class Table{
	String madeFrom;
	String form;
	int qtyLegs;
}

public class Window{
	String material;
	int qtyPerRoom;
	String color;
}

public class wall{
	String color;
	int length;
	int height;
}

public class Door{
	String material;
	String lock;
	int qty;
}

public class Bottle{
	String type;
	String material;
	int qtyPerTable;
}
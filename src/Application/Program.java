package Application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department (1, "books");
		
		System.out.println(obj);
		
		Seller sl = new Seller (21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(sl);

	}

}

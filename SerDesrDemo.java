package com.codegnan.Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDesrDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		String filePath="emp.txt";
		
		System.out.println("Serialization started");
		Employee emp1 = new Employee(101, "Rambo", 50000, "MI", "Java");
		System.out.println("Employee Details Before Serialization");
		emp1.displayDetails();
		
		try(FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(emp1);
			System.out.println("Serialized employee Object: "+emp1);
			System.out.println("Serialization ended");
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("De-Serialization started");
		try(FileInputStream fis = new FileInputStream(filePath);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Employee emp2 = (Employee)ois.readObject();
			System.out.println("Employee Details after deserializaion");
			emp2.displayDetails();
			System.out.println("De-serilization employee Object: "+emp2);
			System.out.println("DeSerialization ended");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

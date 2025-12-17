package com.codegnan.Io;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVWriterExample {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Dev", 7000000,"Hyd"));
		people.add(new Person("Bhujanga Rao",800000,"Gtr"));
		people.add(new Person("Ruthwik ",870000,"Hyd"));

		try(PrintWriter out = new PrintWriter("people.csv")){
			out.print("Name,age,city");
			out.println();
			for(Person person: people) {
				out.println(person.toCSV());
			}
			System.out.println("Data written to a file people.csv file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
